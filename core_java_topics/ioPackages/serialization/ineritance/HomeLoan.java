package core_java_topics.ioPackages.serialization.ineritance;
public class HomeLoan extends Loan {
    private long loan_number;
    private String customer_name;
    private String address;
    private double loan_amount;
    private double rate_of_interest;
    private double disbursal_rate;
    private double emi_amount;
    private int tenure;
    HomeLoan(){}
    public HomeLoan(long loan_id, String loan_type, String bank_name,long loan_number, String customer_name, String address, double loan_amount, double rate_of_interest, double disbursal_rate, double emi_amount, int tenure) {
        super(loan_id,loan_type,bank_name);
        this.loan_number = loan_number;
        this.customer_name = customer_name;
        this.address = address;
        this.loan_amount = loan_amount;
        this.rate_of_interest = rate_of_interest;
        this.disbursal_rate = disbursal_rate;
        this.emi_amount = emi_amount;
        this.tenure = tenure;
    }
    public long getLoan_number() {
        return loan_number;
    }
    public void setLoan_number(long loan_number) {
        this.loan_number = loan_number;
    }
    public String getCustomer_name() {
        return customer_name;
    }
    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public double getLoan_amount() {
        return loan_amount;
    }
    public void setLoan_amount(double loan_amount) {
        this.loan_amount = loan_amount;
    }
    public double getRate_of_interest() {
        return rate_of_interest;
    }
    public void setRate_of_interest(double rate_of_interest) {
        this.rate_of_interest = rate_of_interest;
    }
    public double getDisbursal_rate() {
        return disbursal_rate;
    }
    public void setDisbursal_rate(double disbursal_rate) {
        this.disbursal_rate = disbursal_rate;
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
}
