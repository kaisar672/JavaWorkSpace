package core_java_topics.inheritance.hierarchicalInheritance;

public class Insurance {
    private long insurance_id;
    private String applicant_name;
    private String insurance_type;
    private String insurance_provider;
    private double insurance_amount;

    public long getInsurance_id() {
        return insurance_id;
    }
    public void setInsurance_id(long insurance_id) {
        this.insurance_id = insurance_id;
    }
    public String getApplicant_name() {
        return applicant_name;
    }
    public void setApplicant_name(String applicant_name) {
        this.applicant_name = applicant_name;
    }
    public String getInsurance_type() {
        return insurance_type;
    }
    public void setInsurance_type(String insurance_type) {
        this.insurance_type = insurance_type;
    }
    public String getInsurance_provider() {
        return insurance_provider;
    }
    public void setInsurance_provider(String insurance_provider) {
        this.insurance_provider = insurance_provider;
    }
    public double getInsurance_amount() {
        return insurance_amount;
    }
    public void setInsurance_amount(double insurance_amount) {
        this.insurance_amount = insurance_amount;
    }
}
