package core_java_topics.methods.userDefinedMethods;

public class InvestmentSavingAccount {
    private long isa_acc_number;
    private String isa_cust_name;
    private String isa_branch_name;
    private String isa_city_name;
    private int pin_number;
    private long swift_code;
    private double isa_acc_balance;
    public long getIsa_acc_number() {
        return isa_acc_number;
    }
    public void setIsa_acc_number(long isa_acc_number) {
        this.isa_acc_number = isa_acc_number;
    }
    public String getIsa_cust_name() {
        return isa_cust_name;
    }
    public void setIsa_cust_name(String isa_cust_name) {
        this.isa_cust_name = isa_cust_name;
    }
    public String getIsa_branch_name() {
        return isa_branch_name;
    }
    public void setIsa_branch_name(String isa_branch_name) {
        this.isa_branch_name = isa_branch_name;
    }
    public String getIsa_city_name() {
        return isa_city_name;
    }
    public void setIsa_city_name(String isa_city_name) {
        this.isa_city_name = isa_city_name;
    }
    public int getPin_number() {
        return pin_number;
    }
    public void setPin_number(int pin_number) {
        this.pin_number = pin_number;
    }
    public long getSwift_code() {
        return swift_code;
    }
    public void setSwift_code(long swift_code) {
        this.swift_code = swift_code;
    }
    public double getIsa_acc_balance() {
        return isa_acc_balance;
    }
    public void setIsa_acc_balance(double isa_acc_balance) {
        this.isa_acc_balance = isa_acc_balance;
    }
    public void getLat5Transactions(long accountNumber){
        if(accountNumber==123456789){
            System.out.println("===========Last 5 Transactions==================");
            System.out.println("400 Debited on 04/07/2024");
            System.out.println("6000 Debited on 05/07/2024");
            System.out.println("4000 Credited on 06/07/2024");
            System.out.println("400 Debited on 04/07/2024");
            System.out.println("400 Credited on 04/07/2024");
        }
        else{
            System.out.println("Please enter Valid Account Number");
        }
    }
    public void depositAmount(double amount){
        double after_deposit=isa_acc_balance+amount;
        System.out.println("After deposit Your acc_balance is = "+after_deposit);
    }
}
