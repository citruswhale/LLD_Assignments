public class AttendanceRule implements EligibilityRule{
    int threshold;

    AttendanceRule(int threshold){
        this.threshold = threshold;
    }

    @Override
    public boolean isEligible(StudentProfile s) {
        return s.attendancePct >= threshold;
    }

    @Override
    public String ineligibilityReason() {
        return "attendance below " +  threshold;
    }
}
