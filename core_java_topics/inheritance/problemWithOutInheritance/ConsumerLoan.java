package core_java_topics.inheritance.problemWithOutInheritance;

public class ConsumerLoan {
    private long loan_number;
    private String applicant_name;
    private String address;
    private String loan_type;
    private double loan_amount;
    private String disbursal_date;
    private double rate_of_interest;
    private double emi_amount;
    private int tenure;
    private double processing_fee;
    public long getLoan_number() {
        return loan_number;
    }
    public void setLoan_number(long loan_number) {
        this.loan_number = loan_number;
    }
    public String getApplicant_name() {
        return applicant_name;
    }
    public void setApplicant_name(String applicant_name) {
        this.applicant_name = applicant_name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getLoan_type() {
        return loan_type;
    }
    public void setLoan_type(String loan_type) {
        this.loan_type = loan_type;
    }
    public double getLoan_amount() {
        return loan_amount;
    }
    public void setLoan_amount(double loan_amount) {
        this.loan_amount = loan_amount;
    }
    public String getDisbursal_date() {
        return disbursal_date;
    }
    public void setDisbursal_date(String disbursal_date) {
        this.disbursal_date = disbursal_date;
    }
    public double getRate_of_interest() {
        return rate_of_interest;
    }
    public void setRate_of_interest(double rate_of_interest) {
        this.rate_of_interest = rate_of_interest;
    }
    public double getEmi_amount() {
        return emi_amount;
    }
    public void setEmi_amount(double emi_amount) {
        this.emi_amount = emi_amount;
    }
    public int getTenure() {
        return tenure;
    }
    public void setTenure(int tenure) {
        this.tenure = tenure;
    }
    public double getProcessing_fee() {
        return processing_fee;
    }
    public void setProcessing_fee(double processing_fee) {
        this.processing_fee = processing_fee;
    }
}
