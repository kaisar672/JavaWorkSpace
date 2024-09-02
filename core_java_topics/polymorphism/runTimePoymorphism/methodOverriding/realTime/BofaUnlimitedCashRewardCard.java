package core_java_topics.polymorphism.runTimePoymorphism.methodOverriding.realTime;

public class BofaUnlimitedCashRewardCard extends CreditCard{
    @Override
    public void getCreditCardDetails(){
        System.out.println("===========This is child class  BOFA Unlimited Cash Reward Card==============");
        System.out.println("Credit Card Number = 258741369");
        System.out.println("Credit Card Holder Name = Mohammad Sidiq");
        System.out.println("Credit Card Limit = 700000");
        System.out.println("Credit Card Pin: 2587");
        System.out.println("Features = $500 bonus cash reward offer");


    }
}
