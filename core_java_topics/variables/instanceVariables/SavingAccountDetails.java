package core_java_topics.variables.instanceVariables;

public class SavingAccountDetails {
    public static void main(String[] args) {
        SavingAccount account1=new SavingAccount();
        SavingAccount account2=new SavingAccount();
        SavingAccount  account3=new SavingAccount();

         account1.setAcc_number(582369741);
         account1.setCust_name("Abu Bakr");
         account1.setBranch_name("HazratBal");
         account1.setCity("Srinagar");
         account1.setAcc_balance(9000000);

        account2.setAcc_number(7536951);
        account2.setCust_name("Hamza");
        account2.setBranch_name("Dal Lake");
        account2.setCity("Srinagar");
        account2.setAcc_balance(1000000);

        account3.setAcc_number(2587539);
        account3.setCust_name("Abbas");
        account3.setBranch_name("HazratBal");
        account3.setCity("Srinagar");
        account3.setAcc_balance(2000000);

        System.out.println("===========Account1 Details============");
        System.out.println("Account Number = "+account1.getAcc_number());
        System.out.println("Customer Name = "+account1.getCust_name());
        System.out.println("Branch Name = "+account1.getBranch_name());
        System.out.println("City Name= "+account1.getCity());
        System.out.println("Available Balance = "+account1.getAcc_balance());

        System.out.println("===========Account2 Details============");
        System.out.println("Account Number = "+account2.getAcc_number());
        System.out.println("Customer Name = "+account2.getCust_name());
        System.out.println("Branch Name = "+account2.getBranch_name());
        System.out.println("City Name= "+account2.getCity());
        System.out.println("Available Balance = "+account2.getAcc_balance());

        System.out.println("===========Account3 Details============");
        System.out.println("Account Number = "+account3.getAcc_number());
        System.out.println("Customer Name = "+account3.getCust_name());
        System.out.println("Branch Name = "+account3.getBranch_name());
        System.out.println("City Name= "+account3.getCity());
        System.out.println("Available Balance = "+account3.getAcc_balance());

    }
}
