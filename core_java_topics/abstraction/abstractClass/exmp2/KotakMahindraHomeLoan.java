package core_java_topics.abstraction.abstractClass.exmp2;

public class KotakMahindraHomeLoan extends BankBazaar{
    @Override
    public double rateOfInterest(){
        return 9.50d;
    }
    @Override
    public String processingFee(){
        return "Salaried : 0.50% plus taxes, self employed/commercial:1% plus taxes";
    }
}
