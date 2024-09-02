package core_java_topics.polymorphism.runTimePoymorphism.methodOverriding.realTime;

public class BofaCustomizedCashRewardCard extends CreditCard{
    @Override
    public void getCreditCardDetails(){
        System.out.println("=============This Child Class Bofa customized Cash Reward Card================");
        System.out.println("Credit Card number = 258741369");
        System.out.println("Credit Card Holder Name = Mohammad Quamruddin");
        System.out.println("Credit Card Limit = 500000");
        System.out.println("Features = $200 online cash reward bonus offer");

    }
}
