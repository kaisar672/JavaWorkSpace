package core_java_topics.keywords.thisKeyword.currentClassInstanceVariable;

public class BOFACustomizedCashRewardCard {
    private long cc_number;
    private String cc_holder_name;
    private String cc_type;
    private String expiry_date;
    private int cvv_number;
    private int pinNumber;
    double cc_limit;
    double annual_fee;

    public BOFACustomizedCashRewardCard(long cc_number, String cc_holder_name, String cc_type, String expiry_date, int cvv_number, int pinNumber, double cc_limit, double annual_fee) {
        this.cc_number = cc_number;
        this.cc_holder_name = cc_holder_name;
        this.cc_type = cc_type;
        this.expiry_date = expiry_date;
        this.cvv_number = cvv_number;
        this.pinNumber = pinNumber;
        this.cc_limit = cc_limit;
        this.annual_fee = annual_fee;
    }
    public void displayInfo(){
        System.out.println("================Credit Card Details================");
        System.out.println("Credit Card Number = "+cc_number);
        System.out.println("Card Holder Name = "+cc_holder_name);
        System.out.println("Card Type = "+cc_type);
        System.out.println("Expiry Date = "+expiry_date);
        System.out.println("Cvv Number = "+cvv_number);
        System.out.println("Pin Number  = "+pinNumber);
        System.out.println("Credit Card Limit = "+cc_limit);
        System.out.println("Annual Fee = "+annual_fee);
    }
}
