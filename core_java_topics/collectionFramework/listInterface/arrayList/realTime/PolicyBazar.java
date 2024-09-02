package core_java_topics.collectionFramework.listInterface.arrayList.realTime;

public class PolicyBazar {
    private long policy_number;
    private String applicant_name;
    private String insurance_provider;
    private double premium_emi;
    private double policy_coverage;
    private int policy_age_validity;
    private double policy_premium_cover;
    private double claims_settled;

    public PolicyBazar(long policy_number, String applicant_name, String insurance_provider, double premium_emi, double policy_coverage, int policy_age_validity, double policy_premium_cover, double claims_settled) {
        this.policy_number = policy_number;
        this.applicant_name = applicant_name;
        this.insurance_provider = insurance_provider;
        this.premium_emi = premium_emi;
        this.policy_coverage = policy_coverage;
        this.policy_age_validity = policy_age_validity;
        this.policy_premium_cover = policy_premium_cover;
        this.claims_settled = claims_settled;
    }

    @Override
    public String toString() {
        return "PolicyBazar{" +
                "policy_number=" + policy_number +
                ", applicant_name='" + applicant_name + '\'' +
                ", insurance_provider='" + insurance_provider + '\'' +
                ", premium_emi=" + premium_emi +
                ", policy_coverage=" + policy_coverage +
                ", policy_age_validity=" + policy_age_validity +
                ", policy_premium_cover=" + policy_premium_cover +
                ", claims_settled=" + claims_settled +
                '}';
    }
}
