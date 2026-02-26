import java.util.ArrayList;
import java.util.List;

public class RuleUtil {
    public static List<EligibilityRule> makeRuleList() {
        List<EligibilityRule> eligibilityRules = new ArrayList<>();
        eligibilityRules.add(new LegacyFlagRule());
        eligibilityRules.add(new CGRRule(RuleInput.minCgr));
        eligibilityRules.add(new AttendanceRule(RuleInput.minAttendance));
        eligibilityRules.add(new CreditRule(RuleInput.minCredits));
        return eligibilityRules;
    }
}
