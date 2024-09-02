package core_java_topics.Constructor.defaultConstructor;

public class SavingIndividualRetirementAccount {
    private long cust_id;
    private long sra_acc_number;
    private String cust_name;
    private String branch_name;
    private String password;
    private String facility_sk;
    private double sra_acc_balance;
    private int org_id;
    private float rate_of_interest;
    public SavingIndividualRetirementAccount() {
        System.out.println("This is default Constructor......");
    }
    public void displayAccountInfo(){
        System.out.println("============Account Details=================");
        System.out.println("Customer id "+this.cust_id);
        System.out.println("Customer Name = "+this.cust_name);
        System.out.println("Branch Name = "+this.cust_name);
        System.out.println("Password = "+this.password);
        System.out.println("Facility sk = "+this.facility_sk);
        System.out.println("Account Balance = "+this.sra_acc_balance);
        System.out.println("Organisation id = "+this.org_id);
        System.out.println("Rate of Interst = "+this.rate_of_interest);
    }
    public static void main(String[] args) {
        SavingIndividualRetirementAccount account=new SavingIndividualRetirementAccount();
        account.displayAccountInfo();
    }
}
