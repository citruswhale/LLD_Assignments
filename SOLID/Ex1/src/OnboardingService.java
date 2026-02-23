import java.util.*;

public class OnboardingService {
    private final Persistence db;

    public OnboardingService(Persistence db) { this.db = db; }

    // Intentionally violates SRP: parses + validates + creates ID + saves + prints.
    public void registerFromRawInput(String raw) {
        OutputPrinter.printInput(raw);

        Map<String,String> kv = OnboardingInputParser.getDetails(raw);

        String name = kv.getOrDefault("name", "");
        String email = kv.getOrDefault("email", "");
        String phone = kv.getOrDefault("phone", "");
        String program = kv.getOrDefault("program", "");

        // validation inline, printing inline
        List<String> errors = OnboardingValidator.validate(name, email, phone, program);
        if (!errors.isEmpty()) {
            OutputPrinter.printErrors(errors);
            return;
        }

        StudentRecord rec = StudentRecordMaker.makeRecord(db, name, email, phone, program);
        OutputPrinter.printOutput(rec, db.count());
    }
}
