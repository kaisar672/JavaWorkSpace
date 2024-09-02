package core_java_topics.copyValues.usingAssignmentOperator;

public class FixedTermCDAccount {
    long  fda_acc_number;
    String fda_cust_name;
    double fda_min_amount;
    String fda_branch_name;
    String fda_city;
    double fda_roi;
    double fda_amount;
    FixedTermCDAccount(){}
    public FixedTermCDAccount(long fda_acc_number, String fda_cust_name, double fda_min_amount, String fda_branch_name, String fda_city, double fda_roi, double fda_amount) {
        this.fda_acc_number = fda_acc_number;
        this.fda_cust_name = fda_cust_name;
        this.fda_min_amount = fda_min_amount;
        this.fda_branch_name = fda_branch_name;
        this.fda_city = fda_city;
        this.fda_roi = fda_roi;
        this.fda_amount = fda_amount;
    }
    public void displayInfo(){
        System.out.println("=================Account Details=================");
        System.out.println("Account Number = "+fda_acc_number);
        System.out.println("Customer Name = "+fda_cust_name);
        System.out.println("Minimum Amount = "+fda_min_amount);
        System.out.println("Branch Name = "+fda_branch_name);
        System.out.println("City = "+fda_city);
        System.out.println("Rate of Interest = "+fda_roi);
        System.out.println("Fixed Cd Amount : "+fda_amount);
    }
}
