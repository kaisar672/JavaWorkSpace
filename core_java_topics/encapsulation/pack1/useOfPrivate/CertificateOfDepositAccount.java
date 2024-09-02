package core_java_topics.encapsulation.pack1.useOfPrivate;

public class CertificateOfDepositAccount {
    private long cda_acc_number=874125858;
    private String cda_cust_name="Mohammad Kamran";
    private String address="Raichur Karnatka";
    private String city="Raichur";
    private String state="Karnatka";
    private double cda_acc_balance=100000.0d;
    private void displayAccInfo(){
        System.out.println("================Account Details================");
        System.out.println("Account Number = "+cda_acc_number);
        System.out.println("Customer Name = "+cda_cust_name);
        System.out.println("Address = "+address);
        System.out.println("City = "+city);
        System.out.println("State = "+state);
        System.out.println("Account Balance = "+cda_acc_balance);
    }
    public static void main(String[] args) {
        CertificateOfDepositAccount account1=new CertificateOfDepositAccount();
        account1.displayAccInfo();
    }

}
//class TestVariables{
//    public static void main(String[] args) {
//        CertificateOfDepositAccount account=new CertificateOfDepositAccount();
//        account.cda_acc_nuber=258743695;
//    }
//}
