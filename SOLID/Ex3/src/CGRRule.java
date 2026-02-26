public class CGRRule implements EligibilityRule{
    double threshold;

    CGRRule(double threshold){
        this.threshold = threshold;
    }

    @Override
    public boolean isEligible(StudentProfile s) {
        return s.cgr >= threshold;
    }

    @Override
    public String ineligibilityReason() {
        return "CGR below " + threshold;
    }
}
