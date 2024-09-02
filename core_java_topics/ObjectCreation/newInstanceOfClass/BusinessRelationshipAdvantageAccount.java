package core_java_topics.ObjectCreation.newInstanceOfClass;

public class BusinessRelationshipAdvantageAccount {
    private long baa_acc_number;
    private String baa_acc_cust_name;
    private String baa_branch_name;
    private String baa_city_name;
    private String baa_state_name;
    private double baa_acc_balance;
    BusinessRelationshipAdvantageAccount(){
        System.out.println("This is Business Relationship Advantage Account class ");
    }
    BusinessRelationshipAdvantageAccount(String str){
        System.out.println(str);
    }
    public long getBaa_acc_number() {
        return baa_acc_number;
    }
    public void setBaa_acc_number(long baa_acc_number) {
        this.baa_acc_number = baa_acc_number;
    }

    public String getBaa_acc_cust_name() {
        return baa_acc_cust_name;
    }

    public void setBaa_acc_cust_name(String baa_acc_cust_name) {
        this.baa_acc_cust_name = baa_acc_cust_name;
    }

    public String getBaa_branch_name() {
        return baa_branch_name;
    }

    public void setBaa_branch_name(String baa_branch_name) {
        this.baa_branch_name = baa_branch_name;
    }

    public String getBaa_city_name() {
        return baa_city_name;
    }

    public void setBaa_city_name(String baa_city_name) {
        this.baa_city_name = baa_city_name;
    }

    public String getBaa_state_name() {
        return baa_state_name;
    }

    public void setBaa_state_name(String baa_state_name) {
        this.baa_state_name = baa_state_name;
    }

    public double getBaa_acc_balance() {
        return baa_acc_balance;
    }

    public void setBaa_acc_balance(double baa_acc_balance) {
        this.baa_acc_balance = baa_acc_balance;
    }
}
