package core_java_topics.encapsulation.pack1.useOfDefault;

public class SafeBalanceCheckingAccount {
    long acc_number=258741369;
    String cust_name="OWais";
    String branch_name="khanyar";
    String city_name="Srinagar";
    String state_name="J&k";
    double available_balnce=500000.0d;
    void displayAccInfo(){
        System.out.println("============Saving Bank Account Details===========");
        System.out.println("Account Number = "+acc_number);
        System.out.println("customer Name = "+cust_name);
        System.out.println("Branch Name = "+branch_name);
        System.out.println("City Name = "+city_name);
        System.out.println("state Name = "+state_name);
        System.out.println("Available Balance = "+available_balnce);
    }
}
