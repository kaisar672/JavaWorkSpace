package core_java_topics.abstraction.interfaces.hundredPercentAbstraction.example2;

public class AccountBeneficiaryDetails implements IBeneficiaryService{
    @Override
    public void getAccountDetails(int acc_num){
        System.out.println("Account number = "+acc_num);
        System.out.println("Customer Name = Mohammad Quamruddin");
        System.out.println("Branch Name = Raichur Branch");
        System.out.println("State = Hyderabad");
        System.out.println("Account Balance = 500000.0d");
    }
    @Override
    public void isAccountActive(){
        System.out.println("Your HDFC salary Account is active");
    }
    @Override
    public void addBeneficiery(){
        System.out.println("==================Adding Beneficiery================");
        System.out.println("Account Number = 25874136900");
        System.out.println("Customer Name= Owais");
        System.out.println("Branch Name = Hyderabad");
        System.out.println("City = Hyderabad");
        System.out.println("Available Balance  = 800000.0d");
    }
    @Override
    public void deleteBeneficiery(){
        System.out.println("This is Delete Beneficiary Method");
    }
    @Override
    public void updateBeneficiery(){
        System.out.println("This is Update BeneficiaryMethod");
    }
    public static void main(String[] args) {
        IBeneficiaryService service=new AccountBeneficiaryDetails();
        System.out.println("===========================Account Details===================");
        service.getAccountDetails(25874136);
        service.isAccountActive();
        service.addBeneficiery();
        service.updateBeneficiery();
        service.deleteBeneficiery();
    }
}
