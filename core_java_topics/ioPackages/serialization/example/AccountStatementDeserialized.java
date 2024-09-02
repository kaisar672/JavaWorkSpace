package core_java_topics.ioPackages.serialization.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class AccountStatementDeserialized {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("C:\\java WorkSpace\\io packages\\test6.txt");
            ObjectInputStream ois=new ObjectInputStream(file);
            AccountStatement account=(AccountStatement) ois.readObject();
            System.out.println("==============Account Details=============================");
            System.out.println("Customer id = "+account.getAcc_number());
            System.out.println("Account Number = "+account.getAcc_number());
            System.out.println("Customer Name = "+account.getCust_name());
            System.out.println("Branch Name = "+account.getAccount_branch());
            System.out.println("Address = "+account.getAddress());
            System.out.println("City Name = "+account.getCity());
            System.out.println("State Name= "+account.getState());
            System.out.println("IFSC Code = "+account.getIfsc_code());
            System.out.println("Email Address = "+account.getEmail_address());
            System.out.println("Pan Card Nuber = "+account.getPanCard());
            System.out.println("Mobile Number = "+account.getRegistered_mobile_number());
            System.out.println("Balance = "+account.getAcc_balance());
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
