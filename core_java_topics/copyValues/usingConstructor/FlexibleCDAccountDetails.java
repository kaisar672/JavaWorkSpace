package core_java_topics.copyValues.usingConstructor;

public class FlexibleCDAccountDetails {
    public static void main(String[] args) {
        FlexibleCDAccount account1=new FlexibleCDAccount(95125558,"Waseem","Khanyar","Srinagar",500000,50000,true,5.2);
        FlexibleCDAccount account2=new FlexibleCDAccount(account1);
        account1.displayInfo();
        account2.displayInfo();

    }

}
