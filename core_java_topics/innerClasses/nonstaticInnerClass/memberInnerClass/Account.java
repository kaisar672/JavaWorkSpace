package core_java_topics.innerClasses.nonstaticInnerClass.memberInnerClass;

public class Account {
    private String bankName="Bank Of America";
    class SavingAccount{
        private long sav_acc_number=258741369;
        private String sav_customer_name="Mohammad Kamran";
        private String branchName="Raichur";
        public void displayInfo(){
            System.out.println("=============This is Saving Account Info====================");
            System.out.println("Account Number = "+sav_acc_number);
            System.out.println("Customer Name = "+sav_customer_name);
            System.out.println("Branch Name = "+branchName);
            System.out.println("Bank Name = "+bankName);
        }
    }
    class CheckingAccount{
        private long ca_acc_number=75369546;
        private String ca_customer_name="Saba Naaz";
        private String branchName="Raichur";
        public void displayInfo(){
            System.out.println("==================This is checking Account Details==================");
            System.out.println("Account Number = "+ca_acc_number);
            System.out.println("Customer Name = "+ca_customer_name);
            System.out.println("Branch Name = "+branchName);
            System.out.println("Bank Name = "+bankName);
        }
    }
    public void method(){
        System.out.println("This is method of our outer class");
    }
    public static void main(String[] args) {
        Account account=new Account();
        account.method();
        Account.SavingAccount savingAccount=account.new SavingAccount();
        savingAccount.displayInfo();
        Account.CheckingAccount checkingAccount= account.new CheckingAccount();
        checkingAccount.displayInfo();
    }
}
