package core_java_topics.ObjectInitialization.UsingConstructor;

public class CertificateOfDepositAccountDetails {
    public static void main(String[] args){
        CertificateOfDepositAccount account1=new CertificateOfDepositAccount(234567,"Abu Bakr","Fatehkadal","Srinagar","Jammu and Kashmir",900000);
        CertificateOfDepositAccount account2=new CertificateOfDepositAccount(258741,"usman","india Gate","New Delhi","Delhi",500000);
        CertificateOfDepositAccount account3=new CertificateOfDepositAccount(582693,"Umar","khanyar","Srinagar","Jammu and Kashmir",800000);

        account1.cdaDisplayInfo();
        account2.cdaDisplayInfo();
        account3.cdaDisplayInfo();
    }
}
