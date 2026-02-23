import java.util.List;

public class OutputPrinter {
    public static void printInput(String raw) {
        System.out.println("INPUT: " + raw);
    }

    public static void printOutput(StudentRecord rec, int count){
        System.out.println("OK: created student " + rec.id);
        System.out.println("Saved. Total students: " + count);
        System.out.println("CONFIRMATION:");
        System.out.println(rec);
    }

    public static void printErrors(List<String> errors){
        System.out.println("ERROR: cannot register");
        for (String e : errors) System.out.println("- " + e);
    }
}
