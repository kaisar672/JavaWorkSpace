package core_java_topics.keywords.thisKeyword.currentClassMethod;

public class BOFAUnlimitedCashRewardCard {
    private long crc_cc_number;
    String crc_customer_name;
    String crc_expiry_date;
    String bank_name;
    int crc_cvv_number;
    int crc_cvv_pin_number;
    int crc_cc_limit;
    double crc_annual_fee;

    public BOFAUnlimitedCashRewardCard(long crc_cc_number, String crc_customer_name, String crc_expiry_date, String bank_name, int crc_cvv_number, int crc_cvv_pin_number, int crc_cc_limit, double crc_annual_fee) {
        this.crc_cc_number = crc_cc_number;
        this.crc_customer_name = crc_customer_name;
        this.crc_expiry_date = crc_expiry_date;
        this.bank_name = bank_name;
        this.crc_cvv_number = crc_cvv_number;
        this.crc_cvv_pin_number = crc_cvv_pin_number;
        this.crc_cc_limit = crc_cc_limit;
        this.crc_annual_fee = crc_annual_fee;
    }
    public void method(){
        System.out.println("======================Credit Card Details====================");
        this.displayCRInfo();
    }
    public void displayCRInfo(){
        System.out.println("Credit Card Number : "+crc_cc_number);
        System.out.println("Customer Name = "+crc_customer_name);
        System.out.println("Expiry Date = "+crc_expiry_date);
        System.out.println("Bank Name = "+bank_name);
        System.out.println("CVV Number = "+crc_cvv_number);
        System.out.println("Pin Number = "+crc_cvv_pin_number);
        System.out.println("Credit Card Limit = "+crc_cc_limit);
        System.out.println("Annual Fee= "+crc_annual_fee);
    }
}
