public class Bill {
    String invId;
    double subtotal;
    double taxPct;
    double tax;
    double discount;
    double total;

    Bill(String invId, double subtotal, double taxPct, double tax, double discount, double total) {
        this.invId = invId;
        this.subtotal = subtotal;
        this.taxPct = taxPct;
        this.tax = tax;
        this.discount = discount;
        this.total = total;
    }
}
