package core_java_topics.aggrecation;
public class SavingAccount {
    private long sav_acc_number;
    private String sav_customer_name;
    private String branch_name;
    private double sav_acc_balance;
    private ContactDetails contactDetails;
    public SavingAccount(long sav_acc_number, String sav_customer_name, String branch_name, double sav_acc_balance, ContactDetails contactDetails) {
        this.sav_acc_number = sav_acc_number;
        this.sav_customer_name = sav_customer_name;
        this.branch_name = branch_name;
        this.sav_acc_balance = sav_acc_balance;
        this.contactDetails = contactDetails;
    }
    public long getSav_acc_number() {
        return sav_acc_number;
    }
    public void setSav_acc_number(long sav_acc_number) {
        this.sav_acc_number = sav_acc_number;
    }
    public String getSav_customer_name() {
        return sav_customer_name;
    }
    public void setSav_customer_name(String sav_customer_name) {
        this.sav_customer_name = sav_customer_name;
    }
    public String getBranch_name() {
        return branch_name;
    }
    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }
    public double getSav_acc_balance() {
        return sav_acc_balance;
    }
    public void setSav_acc_balance(double sav_acc_balance) {
        this.sav_acc_balance = sav_acc_balance;
    }
    public ContactDetails getContactDetails() {
        return contactDetails;
    }
    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }
    @Override
    public String toString(){
        return "Saving Account\n [saving Account Number= "+sav_acc_number+" Customer Name = "+sav_customer_name+" Branch Name = "+branch_name+" Saving Account Balance = "+sav_acc_balance + "Contact Details = "+contactDetails+"]";
    }
}
