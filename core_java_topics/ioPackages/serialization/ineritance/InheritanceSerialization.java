package core_java_topics.ioPackages.serialization.ineritance;

import java.io.*;

public class InheritanceSerialization {
    public static void main(String[] args) {
//        try {
//            HomeLoan homeLoan=new HomeLoan(25874135,"Home Loan","HDFC Bank",759258425,"Priya","Rozabal Khanyar",8000000,5.0d,2,30000,8);
//
//            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("C:\\java WorkSpace\\io packages\\test8.txt"));
//            out.writeObject(homeLoan);
//            out.close();
//            System.out.println("Parent and child classes serialised successfully");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        //Deserialized
        try {
            ObjectInputStream oin=new ObjectInputStream(new FileInputStream("C:\\java WorkSpace\\io packages\\test8.txt"));
            HomeLoan homeLoan=(HomeLoan)oin.readObject();
            System.out.println("=========================Home Loan details====================================");
            System.out.println("loan id= "+homeLoan.getLoan_id());
            System.out.println("Loan Type = "+homeLoan.getLoan_type());
            System.out.println("Bank Name = "+homeLoan.getBank_name());
            System.out.println("Loan Number = "+homeLoan.getLoan_number());
            System.out.println("Applicant Name = "+homeLoan.getCustomer_name());
            System.out.println("Address = "+homeLoan.getAddress());
            System.out.println("Loan amount = "+homeLoan.getLoan_amount());
            System.out.println("Rate Of Interest = "+homeLoan.getRate_of_interest());
            System.out.println("Disbursal Rate = "+homeLoan.getDisbursal_rate());
            System.out.println("EMI Amount = "+homeLoan.getEmi_amount());
            System.out.println("Tenure = "+homeLoan.getTenure());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
