package core_java_topics.ObjectCreation.newInstanceOfConstructor;

import java.lang.reflect.Constructor;

public class BusinessAdvantageFundamentalAccountDetails {
    public static void main(String[] args) {
        try{
            Constructor<BusinessAdvantageFundamentalAccount> conObj=BusinessAdvantageFundamentalAccount.class.getConstructor();
            BusinessAdvantageFundamentalAccount account1= conObj.newInstance();
            BusinessAdvantageFundamentalAccount account2= conObj.newInstance();

            account1.setBafa_acc_number(5826763);
            account1.setBafa_cust_name("Lokesh");
            account1.setLandMark1("Texas1");
            account1.setlandMark2("texas2");
            account1.setCity("Texas");
            account1.setBafa_acc_balance(900000);

            account2.setBafa_acc_number(5826763);
            account2.setBafa_cust_name("Lokesh");
            account2.setLandMark1("Texas1");
            account2.setlandMark2("texas2");
            account2.setCity("Texas");
            account2.setBafa_acc_balance(900000);

            System.out.println("=============Account1 Details==============");
            System.out.println("Account Number= "+account1.getBafa_acc_number());
            System.out.println("Customer Name= "+account1.getBafa_cust_name());
            System.out.println("Land Mark 1 ="+account1.getLandMark1());
            System.out.println("Land Mark 2 ="+account1.getlandMark2());
            System.out.println("Account Balance= "+account1.getBafa_acc_balance());

            System.out.println("=============Account2 Details==============");
            System.out.println("Account Number= "+account2.getBafa_acc_number());
            System.out.println("Customer Name= "+account2.getBafa_cust_name());
            System.out.println("Land Mark 1 ="+account2.getLandMark1());
            System.out.println("Land Mark 2 ="+account2.getlandMark2());
            System.out.println("Account Balance= "+account2.getBafa_acc_balance());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }


}
