package core_java_topics.abstraction.abstractClass.exmp2;

public class HDFCHomeLoan extends BankBazaar  {
    @Override
    public double rateOfInterest(){
        return 8.70d;
    }
    @Override
    public String processingFee(){
        return "upto 0.5% or Rs 3000 plus taxes , whichever is higher";
    }
}
