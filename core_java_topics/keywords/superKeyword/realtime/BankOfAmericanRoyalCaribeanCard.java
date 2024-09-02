package core_java_topics.keywords.superKeyword.realtime;

public class BankOfAmericanRoyalCaribeanCard extends CreditCard{
    double cc_limit;
    String cc_features;
    public BankOfAmericanRoyalCaribeanCard(long cc_num,String cc_holder_name,String expiry_date,int pin_num,double cc_limit,String cc_featurs){
        super(cc_num,cc_holder_name,expiry_date,pin_num);
        this.cc_limit=cc_limit;
        this.cc_features=cc_featurs;
    }
    public void ccInfo(){
        System.out.println("================Credit Card Details================");
        System.out.println("Credit Card Number = "+cc_num);
        System.out.println("Credit Card Holder Name = "+cc_holder_name);
        System.out.println("Expiry Date "+expiryDate);
        System.out.println("Pin Number = "+pin_num);
        System.out.println("Credit Card Limit = "+cc_limit);
        System.out.println("Feature = "+cc_features);
    }

    public static void main(String[] args) {
        BankOfAmericanRoyalCaribeanCard card1=new BankOfAmericanRoyalCaribeanCard(258741369,"Rphit","12-02-2026",5821,50000.0d,"Best for Airpot lounge");
        BankOfAmericanRoyalCaribeanCard card2=new BankOfAmericanRoyalCaribeanCard(587436951,"akshay","22/05/2027",5879,40000.0d,"Get Best deals on purchase");

        card1.ccInfo();
        card2.ccInfo();
    }
}
