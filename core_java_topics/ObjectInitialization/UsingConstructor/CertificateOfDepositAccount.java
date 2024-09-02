package core_java_topics.ObjectInitialization.UsingConstructor;

public class CertificateOfDepositAccount {
    private  long cda_acc_number;
    private String cda_acc_holder_name;
    private String cda_acc_branch;
    private String cda_acc_city;
    private String cda_acc_state;
    private double cda_acc_balance;

    public CertificateOfDepositAccount(long cda_acc_number, String cda_acc_holder_name, String cda_acc_branch, String cda_acc_city, String cda_acc_state, double cda_acc_balance) {
        this.cda_acc_number = cda_acc_number;
        this.cda_acc_holder_name = cda_acc_holder_name;
        this.cda_acc_branch = cda_acc_branch;
        this.cda_acc_city = cda_acc_city;
        this.cda_acc_state = cda_acc_state;
        this.cda_acc_balance = cda_acc_balance;
    }
    public void cdaDisplayInfo(){
        System.out.println("=======================Account Details============================");
        System.out.println("Account Number "+cda_acc_number);
        System.out.println("Customer Name : "+cda_acc_holder_name);
        System.out.println("Branch Name : "+cda_acc_branch);
        System.out.println("City Name : "+cda_acc_city);
        System.out.println("State Name : "+cda_acc_state);
        System.out.println("Available Balance = "+cda_acc_balance);
    }
}
