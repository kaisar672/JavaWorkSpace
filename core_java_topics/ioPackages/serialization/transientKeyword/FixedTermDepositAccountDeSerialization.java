package core_java_topics.ioPackages.serialization.transientKeyword;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FixedTermDepositAccountDeSerialization {
    public static void main(String[] args) {
        try{
            FileInputStream file =new FileInputStream("C:\\java WorkSpace\\io packages\\test7.txt");
            ObjectInputStream oin=new ObjectInputStream(file);
            FixedTermDepositAccount account=(FixedTermDepositAccount) oin.readObject();
            System.out.println("=================Account Details===================");
            System.out.println("Account Number = "+account.getFda_acc_number());
            System.out.println("Customer Name = "+account.getFda_cust_name());
            System.out.println("Branch Name = "+account.getFda_branch_name());
            System.out.println("City Name = "+account.getFda_city_name());
            System.out.println("State Name = "+account.getFda_state());
            System.out.println("Mobile Number = "+account.getMobile_number());
            System.out.println("Rate of Interest = "+account.getRate_of_interest());
            System.out.println("Account Balance = "+account.getFda_amount());
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
