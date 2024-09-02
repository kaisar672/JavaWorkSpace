package core_java_topics.abstraction.abstractClass.exmp2;

public class HomeLoanDetails {
    public static void main(String[] args) {
        BankBazaar hdfc=new HDFCHomeLoan();
        BankBazaar kotak=new KotakMahindraHomeLoan();
        BankBazaar union=new UnionBankHomeLoan();

        System.out.println("==============HDFC Details===================");
        System.out.println("Rate of Interest : "+hdfc.rateOfInterest()+"    Processing Fee : "+ hdfc.processingFee());
        System.out.println("==============Kotak Details===================");
        System.out.println("Rate Of Interest : "+kotak.rateOfInterest()+"   Processing Fee : "+ kotak.processingFee());
        System.out.println("==================Union Rate Of Interest===================");
        System.out.println("Rate Of Interest : "+union.rateOfInterest()+"   Processing Fee : "+ union.processingFee());
    }
}
