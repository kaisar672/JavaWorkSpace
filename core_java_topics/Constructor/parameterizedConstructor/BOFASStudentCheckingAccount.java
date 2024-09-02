package core_java_topics.Constructor.parameterizedConstructor;

public class BOFASStudentCheckingAccount {
    private long bsca_acc_num;
    private String cust_name;
    private String bsca_branch_name;
    private String bsca_city_name;
    private String bsca_mailing_address;
    private double rate_of_interest;
    private String landMark1;
    private String landMark2;
    private String panCard;
    private double bsca_acc_balance;

    public BOFASStudentCheckingAccount(long bsca_acc_num, String cust_name,
                                       String bsca_branch_name, String bsca_city_name,
                                       String bsca_mailing_address, double rate_of_interest,
                                       String landMark1, String landMark2, String panCard,
                                       double bsca_acc_balance) {
        this.bsca_acc_num = bsca_acc_num;
        this.cust_name = cust_name;
        this.bsca_branch_name = bsca_branch_name;
        this.bsca_city_name = bsca_city_name;
        this.bsca_mailing_address = bsca_mailing_address;
        this.rate_of_interest = rate_of_interest;
        this.landMark1 = landMark1;
        this.landMark2 = landMark2;
        this.panCard = panCard;
        this.bsca_acc_balance = bsca_acc_balance;
    }
    public BOFASStudentCheckingAccount(){}
    public void displayAccInfo(){
        System.out.println("=======================Account Details===================");
        System.out.println("Account Number = "+bsca_acc_num);
        System.out.println("Customer Name = "+cust_name);
        System.out.println("Branch Name = "+bsca_branch_name);
        System.out.println("City Name = "+bsca_city_name);
        System.out.println("Mailing Address = "+bsca_mailing_address);
        System.out.println("Rate of Interest = "+rate_of_interest);
        System.out.println("LandMark1 = "+landMark1);
        System.out.println("LandMark2 = "+landMark2);
        System.out.println("PanCard Number = "+panCard);
        System.out.println("Available Balance = "+bsca_acc_balance);
    }
}
