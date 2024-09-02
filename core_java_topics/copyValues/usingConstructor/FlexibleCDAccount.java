package core_java_topics.copyValues.usingConstructor;

public class FlexibleCDAccount {
    private long fca_acc_number;
    private String fca_cust_name;
    private String branch_name;
    private String city_name;
    private double fca_acc_balance;
    private double minimum_deposit;
    private boolean additional_deposit_allowed;
    private double rate_of_interest;

    public FlexibleCDAccount(long fca_acc_number, String fca_cust_namne, String branch_name, String city_name, double fca_acc_balance, double minimum_deposit, boolean additional_deposit_allowed, double rate_of_interest) {
        this.fca_acc_number = fca_acc_number;
        this.fca_cust_name = fca_cust_name;
        this.branch_name = branch_name;
        this.city_name = city_name;
        this.fca_acc_balance = fca_acc_balance;
        this.minimum_deposit = minimum_deposit;
        this.additional_deposit_allowed = additional_deposit_allowed;
        this.rate_of_interest = rate_of_interest;
    }
    public FlexibleCDAccount(FlexibleCDAccount account){
        fca_acc_number=account.fca_acc_number;
        fca_cust_name=account.fca_cust_name;
        branch_name=account.branch_name;
        city_name=account.city_name;
        fca_acc_balance=account.fca_acc_balance;
        minimum_deposit=account.minimum_deposit;
        additional_deposit_allowed=account.additional_deposit_allowed;
        rate_of_interest= account.rate_of_interest;
    }
    public void displayInfo(){
        System.out.println("=============Account Details==============");
        System.out.println("Account Number = "+fca_acc_number);
        System.out.println("Customer Name = "+fca_cust_name);
        System.out.println("Branch Name = "+branch_name);
        System.out.println("City Name = "+city_name);
        System.out.println("Account Balance = "+fca_acc_balance);
        System.out.println("Minimum Deposit = "+minimum_deposit);
        System.out.println("Additional deposit Allowed = "+additional_deposit_allowed);
        System.out.println("Rate of Interest = "+rate_of_interest);
    }
}
