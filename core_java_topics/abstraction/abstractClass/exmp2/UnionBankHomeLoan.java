package core_java_topics.abstraction.abstractClass.exmp2;

public class UnionBankHomeLoan extends BankBazaar{
    @Override
    public double rateOfInterest(){
        return 10.10d;
    }
    @Override
    public String processingFee(){
        return "0.50% of loan amount";
    }
}
