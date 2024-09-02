package core_java_topics.keywords.superKeyword;

public class Pay {
    long payment_id=36985147;
    String remarks="paid for fuel";
    String mode_of_payment="phone pe";
    double bill_amount=400.0d;
    int pin_num=1234;

    public Pay() {
        System.out.println("This is super class constructor");
    }
    public void method_pay(){
        System.out.println("This is pay method() of pay class of parent class");
    }
    public void m(){
        System.out.println("This is another method of super class pay");
    }
}
