package core_java_topics.inheritance.hierarchicalInheritance;

public class TermLifeInsurance extends Insurance {
    private String description;
    private double insurance_emi;
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getInsurance_emi() {
        return insurance_emi;
    }
    public void setInsurance_emi(double insurance_emi) {
        this.insurance_emi = insurance_emi;
    }
}
