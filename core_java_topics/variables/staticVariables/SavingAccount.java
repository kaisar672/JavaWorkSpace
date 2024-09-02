package core_java_topics.variables.staticVariables;

public class SavingAccount {
    private long acc_number;
    private String cust_name;
    private String branch_name;
    private String city;
    private double acc_balance;
    public static String bankName;

    public long getAcc_number() {
        return acc_number;
    }
    public void setAcc_number(long acc_number) {
        this.acc_number = acc_number;
    }
    public String getCust_name() {
        return cust_name;
    }
    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }
    public String getBranch_name() {
        return branch_name;
    }
    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public double getAcc_balance() {
        return acc_balance;
    }
    public void setAcc_balance(double acc_balance) {
        this.acc_balance = acc_balance;
    }

}

