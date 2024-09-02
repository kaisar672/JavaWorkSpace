package core_java_topics.copyValues.usingCloneMethod;

public class CurrentAccount implements Cloneable {
    private long curr_acc_number;
    private String cust_name;
    private String branch_name;
    private String landMark;
    private String city_name;
    private double curr_acc_balance;
    CurrentAccount(){}

    public CurrentAccount(long curr_acc_number, String cust_name, String branch_name, String landMark, String city_name, double curr_acc_balance) {
        this.curr_acc_number = curr_acc_number;
        this.cust_name = cust_name;
        this.branch_name = branch_name;
        this.landMark = landMark;
        this.city_name = city_name;
        this.curr_acc_balance = curr_acc_balance;
    }
    public void displayInfo(){
        System.out.println("=============Account Details==================");
        System.out.println("Account Number = "+curr_acc_number);
        System.out.println("Account Holder Name = "+cust_name);
        System.out.println("Branch Name = "+branch_name);
        System.out.println("LandMark = "+landMark);
        System.out.println("City Name = "+city_name);
        System.out.println("Available Balance = "+curr_acc_balance);
    }
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
