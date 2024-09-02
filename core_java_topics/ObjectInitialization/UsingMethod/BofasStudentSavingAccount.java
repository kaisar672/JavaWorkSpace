package core_java_topics.ObjectInitialization.UsingMethod;

public class BofasStudentSavingAccount {
    private  long ssa_acc_number;
    private String ssa_acc_holder_name;
    private String ssa_acc_branch;
    private String ssa_acc_city;
    private String ssa_acc_state;
    private double ssa_acc_balance;

    //declaring method to initialise the object
    public void insertAccInfo(long ssa_acc_number,String ssa_acc_holder_name,String ssa_acc_branch,String ssa_acc_city,String ssa_acc_state,long ssa_acc_balance){
        this.ssa_acc_number=ssa_acc_number;
        this.ssa_acc_holder_name=ssa_acc_holder_name;
        this.ssa_acc_branch=ssa_acc_branch;
        this.ssa_acc_city=ssa_acc_city;
        this.ssa_acc_state=ssa_acc_state;
        this.ssa_acc_balance=ssa_acc_balance;
    }
    public void displayInfo(){
        System.out.println("======================Account Details=============================");
        System.out.println("Account Number "+ssa_acc_number);
        System.out.println("Customer Name : "+ssa_acc_holder_name);
        System.out.println("Branch Name : "+ssa_acc_branch);
        System.out.println("City Name : "+ssa_acc_city);
        System.out.println("State Name : "+ssa_acc_state);
        System.out.println("Available Balance = "+ssa_acc_balance);
    }
}
