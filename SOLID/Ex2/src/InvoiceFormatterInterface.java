import java.util.List;
import java.util.Map;

public interface InvoiceFormatterInterface {
    public String identityFormat(List<OrderLine> lines, Map<String, MenuItem> menu, Bill bill);
}
