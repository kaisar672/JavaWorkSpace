package core_java_topics.Constructor.parameterizedConstructor;

public class BOFASStudentCheckingAccountDetails {
    public static void main(String[] args) {
        BOFASStudentCheckingAccount account1=new BOFASStudentCheckingAccount(25871369,"Osman","khanyar","Srinagar","Rozabal Khanyar",2.5,"Dastgeer Sahib","punjab National Bank","tyu6789345",5000000);
        BOFASStudentCheckingAccount account2=new BOFASStudentCheckingAccount(852369147,"Abu Bakr","Fatehkadal","Srinagar","Malik Angan Fatehkadal",3.5,"Fatehkadal Police Station","JKBank","AXApl58247",9000000);
        BOFASStudentCheckingAccount account=new BOFASStudentCheckingAccount();
        account1.displayAccInfo();
        account2.displayAccInfo();
    }
}
