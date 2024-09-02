package core_java_topics.keywords.superKeyword.realtime;

public class CreditCard {
    long cc_num;
    String cc_holder_name;
    String expiryDate;
    int pin_num;
    public CreditCard(){}
    public CreditCard(long cc_num, String cc_holder_name, String expiryDate, int pin_num) {
        this.cc_num = cc_num;
        this.cc_holder_name = cc_holder_name;
        this.expiryDate = expiryDate;
        this.pin_num = pin_num;
    }
}
