package core_java_topics.classes_and_objects;

public class BusinessAdvantagePlusAccountDetails {
    public static void main(String[] args){
        BusinessAdvantagePlusAccount account1=new BusinessAdvantagePlusAccount();
        BusinessAdvantagePlusAccount account2=new BusinessAdvantagePlusAccount();
        BusinessAdvantagePlusAccount account3=new BusinessAdvantagePlusAccount();

        //call the setter method to set the value
        account1.setBapa_acc_num(23456789);
        account1.setBapa_acc_holder_name("usman");
        account1.setBapa_acc_branch_name("khanyar");
        account1.setBapa_acc_city_name("srinagar");
        account1.setBapa_acc_balance(400000);

        account2.setBapa_acc_num(659874123);
        account2.setBapa_acc_holder_name("Abrar");
        account2.setBapa_acc_branch_name("Hyderabad");
        account2.setBapa_acc_city_name("Hyderabad");
        account2.setBapa_acc_balance(800000);

        account3.setBapa_acc_num(852369741);
        account3.setBapa_acc_holder_name("Abu Bakr");
        account3.setBapa_acc_branch_name("chennai");
        account3.setBapa_acc_city_name("Chennai");
        account3.setBapa_acc_balance(50000);

        //call the getter method to get the value
        System.out.println("Account Number = "+account1.getBapa_acc_num());
        System.out.println("Account Holder Name = "+account1.getBapa_acc_holder_name());
        System.out.println("Branch Name = "+account1.getBapa_acc_branch_name());
        System.out.println("City Name = "+account1.getBapa_acc_city_name());
        System.out.println("Account Balance = "+account1.getBapa_acc_balance());

        System.out.println("******************************");

        System.out.println("Account Number = "+account2.getBapa_acc_num());
        System.out.println("Account Holder Name = "+account2.getBapa_acc_holder_name());
        System.out.println("Branch Name = "+account2.getBapa_acc_branch_name());
        System.out.println("City Name = "+account2.getBapa_acc_city_name());
        System.out.println("Account Balance = "+account2.getBapa_acc_balance());

        System.out.println("***********************************");

        System.out.println("Account Number = "+account3.getBapa_acc_num());
        System.out.println("Account Holder Name = "+account3.getBapa_acc_holder_name());
        System.out.println("Branch Name = "+account3.getBapa_acc_branch_name());
        System.out.println("City Name = "+account3.getBapa_acc_city_name());
        System.out.println("Account Balance = "+account3.getBapa_acc_balance());


    }
}
