import java.util.List;
import java.util.Map;

public interface PriceCalculatorInterface {
    Bill total(String invId, List<OrderLine> lines, Map<String, MenuItem> menu, String customerType);
}
