package core_java_topics.ObjectInitialization.UsingMethod;

public class BofasStudentSavingAccountDetails {
    public static void main(String[] args){
        BofasStudentSavingAccount account1=new BofasStudentSavingAccount();
        BofasStudentSavingAccount account2 =new BofasStudentSavingAccount();
        BofasStudentSavingAccount account3 =new BofasStudentSavingAccount();

        account1.insertAccInfo(234567,"Abu Bakr","Fatehkadal","Srinagar","Jammu and Kashmir",900000);
        account2.insertAccInfo(546987123,"Haidar","Residency Road","Srinagar","Jammu and Kashmir",500000);
        account3.insertAccInfo(58214793,"Kamran","Bhogal","newDelhi","Delhi",1000000);

        account1.displayInfo();
        account2.displayInfo();
        account3.displayInfo();
    }
}
