package core_java_topics.ObjectCreation.UsingCloneMethod;

public class CertificateOfDepositAccountDetails {
    public static void main(String[] args) {
        try {
            CertificateOfDepositAccount account1 = new CertificateOfDepositAccount();
            account1.setCda_acc_number(258741693);
            account1.setCda_customer_name("Ibrahim");
            account1.setCda_branch_name("Hyderabad");
            account1.setCda_city_name("Hyderabad");
            account1.setLandMark1("landMark1");
            account1.setLandMark2("landMark2");
            account1.setCda_balance(800000);

            System.out.println("===========Before Clonning The Object=============");
            System.out.println("Account Number = " + account1.getCda_acc_number());
            System.out.println("Customer Name = " + account1.getCda_customer_name());
            System.out.println("Branch Name = " + account1.getCda_branch_name());
            System.out.println("City Name = " + account1.getCda_city_name());
            System.out.println("Land Mark 1 = " + account1.getLandMark1());
            System.out.println("Land Mark2 = " + account1.getLandMark2());
            System.out.println("Available Balance = " + account1.getCda_balance());

            System.out.println("===========After Clonning The Object=============");
            CertificateOfDepositAccount account2 = (CertificateOfDepositAccount) account1.clone(); //it creates the copy of account 1

            System.out.println("Account Number = " + account2.getCda_acc_number());
            System.out.println("Customer Name = " + account2.getCda_customer_name());
            System.out.println("Branch Name = " + account2.getCda_branch_name());
            System.out.println("City Name = " + account2.getCda_city_name());
            System.out.println("Land Mark 1 = " + account2.getLandMark1());
            System.out.println("Land Mark2 = " + account2.getLandMark2());
            System.out.println("Available Balance = " + account2.getCda_balance());

            account2.setCda_acc_number(75395193);
            account2.setCda_customer_name("Hood");
            account2.setCda_branch_name("Indore");
            account2.setCda_city_name("indore");
            account2.setLandMark1("landMark1");
            account2.setLandMark2("landMark2");
            account2.setCda_balance(900000);

            System.out.println("Account Number = " + account2.getCda_acc_number());
            System.out.println("Customer Name = " + account2.getCda_customer_name());
            System.out.println("Branch Name = " + account2.getCda_branch_name());
            System.out.println("City Name = " + account2.getCda_city_name());
            System.out.println("Land Mark 1 = " + account2.getLandMark1());
            System.out.println("Land Mark2 = " + account2.getLandMark2());
            System.out.println("Available Balance = " + account2.getCda_balance());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
