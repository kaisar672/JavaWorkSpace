package core_java_topics.copyValues.usingCloneMethod;

public class CurrentAccountDetails {
    public static void main(String[] args) {
        try{
            CurrentAccount account1=new CurrentAccount(2587413,"IShaq","HyderaBad","Hydrabad","Hyderabad",8000000.0d);
            CurrentAccount account2=(CurrentAccount) account1.clone();
            account1.displayInfo();
            account2.displayInfo();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
