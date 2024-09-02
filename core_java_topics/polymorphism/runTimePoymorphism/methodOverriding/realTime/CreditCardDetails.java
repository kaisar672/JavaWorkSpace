package core_java_topics.polymorphism.runTimePoymorphism.methodOverriding.realTime;

public class CreditCardDetails {
    public static void main(String[] args) {
        CreditCard customizedCard=new BofaCustomizedCashRewardCard();
        CreditCard cashRewardCard=new BofaUnlimitedCashRewardCard();

        customizedCard.getCreditCardDetails();
        cashRewardCard.getCreditCardDetails();
    }
}
