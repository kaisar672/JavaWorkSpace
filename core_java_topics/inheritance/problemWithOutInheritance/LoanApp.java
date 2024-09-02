package core_java_topics.inheritance.problemWithOutInheritance;

public class LoanApp {
    public static void main(String[] args) {
        BusinessLoan businessLoan=new BusinessLoan();
        HomeLoan homeLoan=new HomeLoan();
        GoldLoan goldLoan=new GoldLoan();
        ConsumerLoan consumerLoan=new ConsumerLoan();

        businessLoan.setLoan_number(258741300);
        businessLoan.setApplicant_name("Haider");
        businessLoan.setLoan_amount(2000000.0d);
        businessLoan.setLoan_type("Business Loan");
        businessLoan.setAddress("Khanyar");
        businessLoan.setTenure(5);
        businessLoan.setDisbursal_date("21/03/2024");
        businessLoan.setRate_of_interest(5);

        homeLoan.setLoan_number(852147963);
        homeLoan.setApplicant_name("Hussain");
        homeLoan.setLoan_amount(3500000.0d);
        homeLoan.setLoan_type("Home Loan");
        homeLoan.setAddress("Ganderbal");
        homeLoan.setTenure(7);
        homeLoan.setDisbursal_date("15/02/2023");
        homeLoan.setRate_of_interest(5);
        homeLoan.setEmi_amount(25000);

        goldLoan.setLoan_number(35425896);
        goldLoan.setApplicant_name("Hassan");
        goldLoan.setLoan_amount(2000000.0d);
        goldLoan.setLoan_type("Gold Loan");
        goldLoan.setAddress("Bandipora");
        goldLoan.setTenure(5);
        goldLoan.setDisbursal_date("10/03/2024");
        goldLoan.setRate_of_interest(8);
        goldLoan.setEmi_amount(22000);
        goldLoan.setFeature("Low Rate Of Interest");

        consumerLoan.setLoan_number(25136479);
        consumerLoan.setApplicant_name("Waseem");
        consumerLoan.setLoan_type("consumer Loan");
        consumerLoan.setLoan_amount(5000000);
        consumerLoan.setAddress("Gandhi Nagar Jammu");
        consumerLoan.setDisbursal_date("25/01/2023");
        consumerLoan.setRate_of_interest(9);
        consumerLoan.setTenure(6);
        consumerLoan.setEmi_amount(24000);
        consumerLoan.setProcessing_fee(1000.0d);


        System.out.println("=====================Business Loan details====================");
        System.out.println("Loan Number = "+businessLoan.getLoan_number());
        System.out.println("Applicant Name = "+businessLoan.getApplicant_name());
        System.out.println("Loan Type= "+businessLoan.getLoan_type());
        System.out.println("Address = " +businessLoan.getAddress());
        System.out.println("Amount = "+businessLoan.getLoan_amount());
        System.out.println("Disbursal Rate = "+businessLoan.getDisbursal_date());
        System.out.println("Rate of Interest = "+businessLoan.getRate_of_interest());
        System.out.println("Tenure = "+businessLoan.getTenure());

        System.out.println("=====================Consumer Loan details====================");
        System.out.println("Loan Number = "+consumerLoan.getLoan_number());
        System.out.println("Applicant Name = "+consumerLoan.getApplicant_name());
        System.out.println("Address = "+consumerLoan.getAddress());
        System.out.println("Loan Type= "+consumerLoan.getLoan_type());
        System.out.println("Loan amount = "+consumerLoan.getLoan_amount());
        System.out.println("Disbursal Rate = "+consumerLoan.getDisbursal_date());
        System.out.println("Tenure = "+consumerLoan.getTenure());
        System.out.println("Rate of Interest = "+consumerLoan.getRate_of_interest());
        System.out.println("EMI AMount = "+consumerLoan.getEmi_amount());
        System.out.println("Processing Fee = "+consumerLoan.getProcessing_fee());


        System.out.println("=======================Gold Loan Details=======================");
        System.out.println("Loan Number = "+goldLoan.getLoan_number());
        System.out.println("Applicant Name = "+goldLoan.getApplicant_name());
        System.out.println("Address = "+goldLoan.getAddress());
        System.out.println("Loan Type= "+goldLoan.getLoan_type());
        System.out.println("Disbursal Rate = "+goldLoan.getDisbursal_date());
        System.out.println("Disbursal Rate = "+goldLoan.getLoan_amount());
        System.out.println("EMI Amount = "+goldLoan.getEmi_amount());
        System.out.println("Rate of Interest = "+goldLoan.getRate_of_interest());
        System.out.println("Tenure = "+goldLoan.getTenure());
        System.out.println("Feature = "+goldLoan.getFeature());

        System.out.println("=======================Home Loan Details=======================");
        System.out.println("Loan number = "+homeLoan.getLoan_number());
        System.out.println("Applicant Name = "+goldLoan.getApplicant_name());
        System.out.println("Address = "+goldLoan.getAddress());
        System.out.println("LoanType = "+goldLoan.getLoan_type());
        System.out.println("Loan Amount = "+goldLoan.getLoan_amount());
        System.out.println("Disbursal Rate = "+goldLoan.getDisbursal_date());
        System.out.println("Rate of Interest = "+goldLoan.getRate_of_interest());
        System.out.println("EMI Amount = "+goldLoan.getEmi_amount());
        System.out.println("Tenure= "+goldLoan.getTenure());
        System.out.println("Feature = "+goldLoan.getFeature());

    }
}
