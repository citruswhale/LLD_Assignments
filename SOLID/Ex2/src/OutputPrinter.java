public class OutputPrinter {
    Persistence store;

    OutputPrinter(Persistence store) {
        this.store = store;
    }

    public void printInvoice(String printable) {
        System.out.println(printable);
    }

    public void printSavedInvoice(String invId) {
        System.out.println("Saved invoice: " + invId + " (lines=" + store.countLines(invId) + ")");
    }
}
