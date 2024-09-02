package core_java_topics.ObjectCreation.newInstanceOfConstructor;

public class BusinessAdvantageFundamentalAccount {
    private long bafa_acc_number;
    private String bafa_cust_name;
    private String landMark1;
    private String landMark2;
    private String city;
    private double bafa_acc_balance;

    BusinessAdvantageFundamentalAccount(){
        System.out.println("This is BRFA class");
    }
    BusinessAdvantageFundamentalAccount(String str){
        System.out.println(str);
    }
    public long getBafa_acc_number() {
        return bafa_acc_number;
    }

    public void setBafa_acc_number(long bafa_acc_number) {
        this.bafa_acc_number = bafa_acc_number;
    }

    public String getBafa_cust_name() {
        return bafa_cust_name;
    }

    public void setBafa_cust_name(String bafa_cust_name) {
        this.bafa_cust_name = bafa_cust_name;
    }

    public String getLandMark1() {
        return landMark1;
    }

    public void setLandMark1(String landMark1) {
        this.landMark1 = landMark1;
    }

    public String getlandMark2() {
        return landMark2;
    }

    public void setlandMark2(String landMark2) {
        this.landMark2 = landMark2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getBafa_acc_balance() {
        return bafa_acc_balance;
    }

    public void setBafa_acc_balance(double bafa_acc_balance) {
        this.bafa_acc_balance = bafa_acc_balance;
    }
}
