package core_java_topics.keywords.thisKeyword.currentClassMethod;

public class BOFAUnlimitedCashRewardCardDetails {
    public static void main(String[] args) {
        BOFAUnlimitedCashRewardCard card1=new BOFAUnlimitedCashRewardCard(12334987,"Rita Jadhav","12-02-2030","Bank-of America",277,5824,500000,1000.0d);
        BOFAUnlimitedCashRewardCard card2 =new BOFAUnlimitedCashRewardCard(986347,"shramona","12/02/2025","Axis Bank",888,5698,600000,50000.0d);
        BOFAUnlimitedCashRewardCard card3=new BOFAUnlimitedCashRewardCard(6985247,"Bindu","26/03/2025","HDFC Bank",254,2587,400000,80000.0d);

        card1.method();
        card2.method();
        card3.method();

    }
}
