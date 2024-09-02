package core_java_topics.inheritance.singleLevelIheritance;

public class CreditCard {
    private long cc_number;
    private String  cc_holder_name;
    private String expiry_date;
    private double cc_limit;
    private int cvv_number;
    private int pin_number;
    public long getCc_number() {
        return cc_number;
    }
    public void setCc_number(long cc_number) {
        this.cc_number = cc_number;
    }
    public String getCc_holder_name() {
        return cc_holder_name;
    }
    public void setCc_holder_name(String cc_holder_name) {
        this.cc_holder_name = cc_holder_name;
    }
    public String getExpiry_date() {
        return expiry_date;
    }
    public void setExpiry_date(String expiry_date) {
        this.expiry_date = expiry_date;
    }
    public double getCc_limit() {
        return cc_limit;
    }
    public void setCc_limit(double cc_limit) {
        this.cc_limit = cc_limit;
    }
    public int getCvv_number() {
        return cvv_number;
    }
    public void setCvv_number(int cvv_number) {
        this.cvv_number = cvv_number;
    }
    public int getPin_number() {
        return pin_number;
    }
    public void setPin_number(int pin_number) {
        this.pin_number = pin_number;
    }
}
