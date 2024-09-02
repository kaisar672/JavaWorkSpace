package core_java_topics.inheritance.singleLevelIheritance;

public class BankOfAmericaUnlimitedCashRewardCardDetails {
    public static void main(String[] args) {
        BankOfAmericaUnlimitedCashRewardCard card1=new BankOfAmericaUnlimitedCashRewardCard();
        BankOfAmericaUnlimitedCashRewardCard card2=new BankOfAmericaUnlimitedCashRewardCard();
        BankOfAmericaUnlimitedCashRewardCard card3=new BankOfAmericaUnlimitedCashRewardCard();

        card1.setCc_number(257536941);
        card1.setCc_holder_name("Abrar");
        card1.setExpiry_date("02/05/2028");
        card1.setCc_limit(50000);
        card1.setCvv_number(254);
        card1.setPin_number(2587);
        card1.setAnnual_fee(20000);
        card1.setCash_back_offer(10000);
        card1.setFeatures("1500 CashBack Points");

        card2.setCc_number(52496321);
        card2.setCc_holder_name("Anees");
        card2.setExpiry_date("26/03/2027");
        card2.setCc_limit(400000);
        card2.setCvv_number(567);
        card2.setPin_number(2546);
        card2.setAnnual_fee(20000);
        card2.setCash_back_offer(100.0d);
        card2.setFeatures("1000 CashBack Points");

        card3.setCc_number(654123987);
        card3.setCc_holder_name("Tazkiya");
        card3.setExpiry_date("28/03/2025");
        card3.setCc_limit(600000);
        card3.setCvv_number(256);
        card3.setPin_number(8962);
        card3.setAnnual_fee(20000);
        card3.setCash_back_offer(500.0d);
        card3.setFeatures("2000 CashBack Points");

        System.out.println("==================Card 1 Details===============");
        System.out.println("Card Number = "+card1.getCc_number());
        System.out.println("Card holder Number= "+card1.getCc_holder_name());
        System.out.println("Card Expiry Date = "+card1.getExpiry_date());
        System.out.println("Card CVV Number = "+card1.getCvv_number());
        System.out.println("Card Cc Limit = "+card1.getCc_limit());
        System.out.println("Card Pin number = "+card1.getPin_number());
        System.out.println("Card Annual Fee = "+card1.getAnnual_fee());
        System.out.println("Card CashBack Offer = "+card1.getCash_back_offer());
        System.out.println("Card Features = "+card1.getFeatures());

        System.out.println("===================Card2 Details==================");
        System.out.println("Card Number = "+card2.getCc_number());
        System.out.println("Card holder Number= "+card2.getCc_holder_name());
        System.out.println("Card Expiry Date = "+card2.getExpiry_date());
        System.out.println("Card CVV Number = "+card2.getCvv_number());
        System.out.println("Card Cc Limit = "+card2.getCc_limit());
        System.out.println("Card Pin number = "+card2.getPin_number());
        System.out.println("Card Annual Fee = "+card2.getAnnual_fee());
        System.out.println("Card CashBack Offer = "+card2.getCash_back_offer());
        System.out.println("Card Features = "+card2.getFeatures());

        System.out.println("===================Card3 Details==================");
        System.out.println("Card Number = "+card3.getCc_number());
        System.out.println("Card holder Number= "+card3.getCc_holder_name());
        System.out.println("Card Expiry Date = "+card3.getExpiry_date());
        System.out.println("Card CVV Number = "+card3.getCvv_number());
        System.out.println("Card Cc Limit = "+card3.getCc_limit());
        System.out.println("Card Pin number = "+card3.getPin_number());
        System.out.println("Card Annual Fee = "+card3.getAnnual_fee());
        System.out.println("Card CashBack Offer = "+card3.getCash_back_offer());
        System.out.println("Card Features = "+card3.getFeatures());
    }

}
