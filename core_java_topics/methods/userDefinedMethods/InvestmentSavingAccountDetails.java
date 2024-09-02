package core_java_topics.methods.userDefinedMethods;

public class InvestmentSavingAccountDetails {
    public static void main(String[] args) {
        InvestmentSavingAccount account1 =new InvestmentSavingAccount();
        InvestmentSavingAccount account2=new InvestmentSavingAccount();
        InvestmentSavingAccount account3=new InvestmentSavingAccount();

        account1.setIsa_acc_number(6582147);
        account1.setIsa_cust_name("Lokesh");
        account1.setIsa_branch_name("hyderabad");
        account1.setIsa_city_name("Hyderabad");
        account1.setPin_number(190002);
        account1.setSwift_code(753695147);
        account1.setIsa_acc_balance(8000000.0d);

        account2.setIsa_acc_number(25741369);
        account2.setIsa_cust_name("Mahesh");
        account2.setIsa_branch_name("Banglore");
        account2.setIsa_city_name("Banglore");
        account2.setPin_number(190087);
        account2.setSwift_code(72585147);
        account2.setIsa_acc_balance(8800000.0d);

        account3.setIsa_acc_number(25741369);
        account3.setIsa_cust_name("Mahesh");
        account3.setIsa_branch_name("Banglore");
        account3.setIsa_city_name("Banglore");
        account3.setPin_number(190087);
        account3.setSwift_code(72585147);
        account3.setIsa_acc_balance(8800000.0d);

        System.out.println("=============Account 1 Details============");
        System.out.println("Account Number = "+account1.getIsa_acc_number());
        System.out.println("Customer Name = "+account1.getIsa_cust_name());
        System.out.println("Branch Name = "+account1.getIsa_branch_name());
        System.out.println("City Name = "+account1.getIsa_city_name());
        System.out.println(" Pin Number = "+account1.getPin_number());
        System.out.println("Swift Code = "+account1.getSwift_code());
        System.out.println("Availabe Balance = "+account1.getIsa_acc_balance());
        account1.getLat5Transactions(123456789);
        account1.depositAmount(5000);

        System.out.println("=============Account 2 Details============");
        System.out.println("Account Number = "+account2.getIsa_acc_number());
        System.out.println("Customer Name = "+account2.getIsa_cust_name());
        System.out.println("Branch Name = "+account2.getIsa_branch_name());
        System.out.println("City Name = "+account2.getIsa_city_name());
        System.out.println(" Pin Number = "+account2.getPin_number());
        System.out.println("Swift Code = "+account2.getSwift_code());
        System.out.println("Availabe Balance = "+account2.getIsa_acc_balance());
        account1.getLat5Transactions(123485789);
        account1.depositAmount(3000);

        System.out.println("=============Account 3 Details============");
        System.out.println("Account Number = "+account3.getIsa_acc_number());
        System.out.println("Customer Name = "+account3.getIsa_cust_name());
        System.out.println("Branch Name = "+account3.getIsa_branch_name());
        System.out.println("City Name = "+account3.getIsa_city_name());
        System.out.println(" Pin Number = "+account3.getPin_number());
        System.out.println("Swift Code = "+account3.getSwift_code());
        System.out.println("Availabe Balance = "+account3.getIsa_acc_balance());
        account1.getLat5Transactions(123456789);
        account1.depositAmount(6000);





    }
}
