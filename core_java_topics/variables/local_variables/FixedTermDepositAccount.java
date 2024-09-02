package core_java_topics.variables.local_variables;

public class FixedTermDepositAccount {
    private long  fda_acc_number;
    private String fda_customer_name;
    private String fda_branch_name;
    private String fda_city;
    private double fda_acc_balance;
    public static String bankName="Bank_of_America";
    public long getFda_acc_number() {
        return fda_acc_number;
    }
    public void setFda_acc_number(long fda_acc_number) {
        this.fda_acc_number = fda_acc_number;
    }
    public String getFda_customer_name() {
        return fda_customer_name;
    }
    public void setFda_customer_name(String fda_customer_name) {
        this.fda_customer_name = fda_customer_name;
    }
    public String getFda_branch_name() {
        return fda_branch_name;
    }
    public void setFda_branch_name(String fda_branch_name) {
        this.fda_branch_name = fda_branch_name;
    }
    public String getFda_city() {
        return fda_city;
    }
    public void setFda_city(String fda_city) {
        this.fda_city = fda_city;
    }
    public double getFda_acc_balance() {
        return fda_acc_balance;
    }
    public void setFda_acc_balance(double fda_acc_balance) {
        this.fda_acc_balance = fda_acc_balance;
    }
    public void depositAmount(double dptAmt){
        //declare Local variable
        double afterDeposit=fda_acc_balance+dptAmt;
        System.out.println("After Depositing = "+dptAmt+" Your Updated balance is "+afterDeposit);
    }
    //declare withdraw amount method
    public void withdrawAmount(double withAmountt){
        double afterWithdrawAmount=fda_acc_balance-withAmountt;
        System.out.println("After Withdrawing = "+withAmountt+" your updated balance is :"+afterWithdrawAmount);
    }
}
