package core_java_topics.keywords.thisKeyword.currentClassInstanceVariable;

import core_java_topics.keywords.thisKeyword.currentClassInstanceVariable.BOFACustomizedCashRewardCard;

public class BOFACustomizedCashRewardCardDetails {
    public static void main(String[] args) {
        BOFACustomizedCashRewardCard account1=new BOFACustomizedCashRewardCard(25874369,"Owais","Credit Card","24/04/2027",245,5612,500000,1200);
        BOFACustomizedCashRewardCard account2=new BOFACustomizedCashRewardCard(2596147,"Abu Bakr","Debit Card","21/11/2026",0412,3456,500000,10000);
        account1.displayInfo();
        account2.displayInfo();
    }
}
