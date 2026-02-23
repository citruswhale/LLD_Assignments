import java.util.*;

public class CafeteriaSystem {
    private final Map<String, MenuItem> menu = new LinkedHashMap<>();
    private final Persistence store;
    private final OutputPrinter outputPrinter;
    private final PriceCalculatorInterface priceCalculator;
    private final InvoiceFormatterInterface invoiceFormatter;
    private int invoiceSeq = 1000;

    CafeteriaSystem(Persistence store, OutputPrinter outputPrinter, PriceCalculatorInterface priceCalculator, InvoiceFormatterInterface invoiceFormatter) {
        this.store = store;
        this.outputPrinter = outputPrinter;
        this.priceCalculator = priceCalculator;
        this.invoiceFormatter = invoiceFormatter;
    }

    public void addToMenu(MenuItem i) { menu.put(i.id, i); }

    // Intentionally SRP-violating: menu mgmt + tax + discount + format + persistence.
    public void checkout(String customerType, List<OrderLine> lines) {

        String invId = IdUtil.getId(++invoiceSeq);

        Bill bill = priceCalculator.total(invId, lines, menu, customerType);

        String printable = invoiceFormatter.identityFormat(lines, menu, bill);
        outputPrinter.printInvoice(printable);
        store.save(invId, printable);
        outputPrinter.printSavedInvoice(invId);
    }
}
