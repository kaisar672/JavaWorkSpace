package core_java_topics.variables.local_variables;

public class FixedTermDepositAccountDetails {
    public static void main(String[] args) {
        FixedTermDepositAccount account1 = new FixedTermDepositAccount();
        FixedTermDepositAccount account2 = new FixedTermDepositAccount();
        FixedTermDepositAccount account3 = new FixedTermDepositAccount();

        account1.setFda_acc_number(25871369);
        account1.setFda_customer_name("Hamza");
        account1.setFda_branch_name("Hyderabad");
        account1.setFda_city("Hyderabad");
        account1.setFda_acc_balance(500000);

        account2.setFda_acc_number(35741598);
        account2.setFda_customer_name("Abbas");
        account2.setFda_branch_name("Banglore");
        account2.setFda_city("Banglore");
        account2.setFda_acc_balance(700000);

        account3.setFda_acc_number(35741598);
        account3.setFda_customer_name("Fatima");
        account3.setFda_branch_name("Banglore");
        account3.setFda_city("Banglore");
        account3.setFda_acc_balance(900000);

        System.out.println("========================Account 1 Details====================");
        System.out.println("Account Number = "+account1.getFda_acc_number());
        System.out.println("Customer Name = "+account1.getFda_customer_name());
        System.out.println("Branch Name = "+account1.getFda_branch_name());
        System.out.println("City Name = "+account1.getFda_city());
        System.out.println("Account Balance = "+account1.getFda_acc_balance());

        System.out.println("========================Account 2 Details====================");
        System.out.println("Account Number = "+account2.getFda_acc_number());
        System.out.println("Customer Name = "+account2.getFda_customer_name());
        System.out.println("Branch Name = "+account2.getFda_branch_name());
        System.out.println("City Name = "+account2.getFda_city());
        System.out.println("Account Balance = "+account2.getFda_acc_balance());

        System.out.println("========================Account 3 Details====================");
        System.out.println("Account Number = "+account3.getFda_acc_number());
        System.out.println("Customer Name = "+account3.getFda_customer_name());
        System.out.println("Branch Name = "+account3.getFda_branch_name());
        System.out.println("City Name = "+account3.getFda_city());
        System.out.println("Account Balance = "+account3.getFda_acc_balance());
    }    
}
