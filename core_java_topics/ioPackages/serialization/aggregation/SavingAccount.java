package core_java_topics.ioPackages.serialization.aggregation;
import java.io.Serializable;

public class SavingAccount implements Serializable {
    private static final long serialVersionUID=1l;
    private long sav_acc_number;
    private String branch_name;
    private String cust_name;
    private double available_balance;
    private ContactDetails details;
    SavingAccount(){}
    public SavingAccount(long sav_acc_number, String branch_name, String cust_name, double available_balance, ContactDetails details) {
        this.sav_acc_number = sav_acc_number;
        this.branch_name = branch_name;
        this.cust_name = cust_name;
        this.available_balance = available_balance;
        this.details = details;
    }
    public long getSav_acc_number() {
        return sav_acc_number;
    }
    public void setSav_acc_number(long sav_acc_number) {
        this.sav_acc_number = sav_acc_number;
    }
    public String getBranch_name() {
        return branch_name;
    }
    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }
    public String getCust_name() {
        return cust_name;
    }
    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }
    public double getAvailable_balance() {
        return available_balance;
    }
    public void setAvailable_balance(double available_balance) {
        this.available_balance = available_balance;
    }
    public ContactDetails getDetails() {
        return details;
    }
    public void setDetails(ContactDetails details) {
        this.details = details;
    }
    @Override
    public String toString() {
        return "SavingAccount{" +
                "sav_acc_number=" + sav_acc_number +
                ", branch_name='" + branch_name + '\'' +
                ", cust_name='" + cust_name + '\'' +
                ", available_balance=" + available_balance +
                ", details=" + details +
                '}';
    }
}
