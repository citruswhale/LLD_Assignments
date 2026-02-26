public class CreditRule implements EligibilityRule{
    int threshold;

    CreditRule(int threshold){
        this.threshold = threshold;
    }

    @Override
    public boolean isEligible(StudentProfile s) {
        return s.earnedCredits >= threshold;
    }

    @Override
    public String ineligibilityReason() {
        return "credits below " + threshold;
    }
}
