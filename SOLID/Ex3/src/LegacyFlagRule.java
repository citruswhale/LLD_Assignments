public class LegacyFlagRule implements EligibilityRule{
    @Override
    public boolean isEligible(StudentProfile s) {
        return s.disciplinaryFlag == LegacyFlags.NONE;
    }

    @Override
    public String ineligibilityReason() {
        return "disciplinary flag present";
    }
}
