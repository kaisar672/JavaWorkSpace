package core_java_topics.aggrecation;

import core_java_topics.aggrecation.SavingAccount;

public class SavingAccountDetails {
    public static void main(String[] args) {
        ContactDetails details1=new ContactDetails("Mohammed Kamran","shalimar","Srinagar","J&k","Axapl776gh",190035);
        SavingAccount account1=new SavingAccount(581654987,"Mohammad Kamran","Shalimar",780000.0d,details1);

        ContactDetails details2=new ContactDetails("kaisar","khanyar","Srinagar","J&k","apxcf789g",19022587);
        SavingAccount account2=new SavingAccount(58741369,"kaisar","khanyar",800000.0d,details2);

        System.out.println("================Account 1 Details =======================");
        System.out.println("Account Number = "+account1.getSav_acc_number());
        System.out.println("Customer Name= "+account1.getSav_customer_name());
        System.out.println("Branch name = "+account1.getBranch_name());
        System.out.println("Account Balance = "+account1.getSav_acc_balance());
        System.out.println(details1);

        System.out.println("================Account 2 Details =======================");
        System.out.println("Account Number = "+account2.getSav_acc_number());
        System.out.println("Customer Name= "+account2.getSav_customer_name());
        System.out.println("Branch name = "+account2.getBranch_name());
        System.out.println("Account Balance = "+account2.getSav_acc_balance());
        System.out.println(details2);


    }
}
