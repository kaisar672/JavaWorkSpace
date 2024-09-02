package core_java_topics.ObjectCreation.newInstanceOfClass;

public class BusinessRelationshipAdvantageAccountDetails {
    public static void main(String[] args) {
        try {
            BusinessRelationshipAdvantageAccount account1=BusinessRelationshipAdvantageAccount.class.newInstance();
            BusinessRelationshipAdvantageAccount account2=BusinessRelationshipAdvantageAccount.class.newInstance();
            BusinessRelationshipAdvantageAccount account3=BusinessRelationshipAdvantageAccount.class.newInstance();

            account1.setBaa_acc_number(125896347);
            account1.setBaa_acc_cust_name("Muneeb");
            account1.setBaa_branch_name("chandigarh");
            account1.setBaa_city_name("chandigarh");
            account1.setBaa_state_name("punjab");
            account1.setBaa_acc_balance(800000);

            account2.setBaa_acc_number(852963147);
            account2.setBaa_acc_cust_name("abrar");
            account2.setBaa_branch_name("hyderabad");
            account2.setBaa_city_name("Hderabad");
            account2.setBaa_state_name("Telangana");
            account2.setBaa_acc_balance(850000);

            account3.setBaa_acc_number(85275347);
            account3.setBaa_acc_cust_name("Fareed");
            account3.setBaa_branch_name("Indore");
            account3.setBaa_city_name("Indore");
            account3.setBaa_state_name("Madhya Pradesh");
            account3.setBaa_acc_balance(1000000);

            System.out.println("===================Account 1 Details=====================");
            System.out.println(account1.getBaa_acc_number());
            System.out.println(account1.getBaa_acc_cust_name());
            System.out.println(account1.getBaa_branch_name());
            System.out.println(account1.getBaa_city_name());
            System.out.println(account1.getBaa_state_name());
            System.out.println(account1.getBaa_acc_balance());
            System.out.println("===================Account 2 Details====================");
            System.out.println(account2.getBaa_acc_number());
            System.out.println(account2.getBaa_acc_cust_name());
            System.out.println(account2.getBaa_branch_name());
            System.out.println(account2.getBaa_city_name());
            System.out.println(account2.getBaa_state_name());
            System.out.println(account2.getBaa_acc_balance());
            System.out.println("===================Account 3 Details====================");
            System.out.println(account3.getBaa_acc_number());
            System.out.println(account3.getBaa_acc_cust_name());
            System.out.println(account3.getBaa_branch_name());
            System.out.println(account3.getBaa_city_name());
            System.out.println(account3.getBaa_state_name());
            System.out.println(account3.getBaa_acc_balance());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
