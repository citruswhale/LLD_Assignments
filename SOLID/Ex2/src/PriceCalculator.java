import java.util.List;
import java.util.Map;

public class PriceCalculator implements PriceCalculatorInterface {

    private final TaxPolicy taxPolicy;
    private final DiscountPolicy discountPolicy;

    PriceCalculator(TaxPolicy taxPolicy, DiscountPolicy discountPolicy) {
        this.taxPolicy = taxPolicy;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Bill total(String invId, List<OrderLine> lines, Map<String, MenuItem> menu, String customerType) {
        double subtotal = 0.0;
        for (OrderLine l : lines) {
            MenuItem item = menu.get(l.itemId);
            double lineTotal = item.price * l.qty;
            subtotal += lineTotal;
        }
        double taxPct = taxPolicy.taxPercent(customerType);
        double tax = subtotal * (taxPct / 100.0);
        double discount = discountPolicy.discountAmount(customerType, subtotal, lines.size());
        double total = subtotal + tax - discount;
        return new Bill(invId, subtotal, taxPct, tax, discount, total);
    }
}
