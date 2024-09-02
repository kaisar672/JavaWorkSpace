package core_java_topics.ObjectCreation.UsingCloneMethod;

public class CertificateOfDepositAccount implements Cloneable{
    private long cda_acc_number;
    private String cda_customer_name;
    private String cda_branch_name;
    private String cda_city_name;
    private String landMark1;
    private String landMark2;
    private double cda_balance;
    public long getCda_acc_number() {
        return cda_acc_number;
    }
    public void setCda_acc_number(long cda_acc_number) {
        this.cda_acc_number = cda_acc_number;
    }
    public String getCda_customer_name() {
        return cda_customer_name;
    }
    public void setCda_customer_name(String cda_customer_name) {
        this.cda_customer_name = cda_customer_name;
    }
    public String getCda_branch_name() {
        return cda_branch_name;
    }
    public void setCda_branch_name(String cda_branch_name) {
        this.cda_branch_name = cda_branch_name;
    }
    public String getCda_city_name() {
        return cda_city_name;
    }
    public void setCda_city_name(String cda_city_name) {
        this.cda_city_name = cda_city_name;
    }
    public String getLandMark1() {
        return landMark1;
    }
    public void setLandMark1(String landMark1) {
        this.landMark1 = landMark1;
    }
    public String getLandMark2() {
        return landMark2;
    }
    public void setLandMark2(String landMark2) {
        this.landMark2 = landMark2;
    }
    public double getCda_balance() {
        return cda_balance;
    }
    public void setCda_balance(double cda_balance) {
        this.cda_balance = cda_balance;
    }
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

