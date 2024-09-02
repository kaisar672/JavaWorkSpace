package core_java_topics.polymorphism.staticPolymorphism.methodOverloading.realTime;

public class BillAndRecharge {
    //These properties are used to recharge the mobile
    long mobile_number;
    String service_provider;
    double recharge_amount;
    String validity;

    //these properties are used to make DTH payment
    long cust_id;
    long dth_number;
    long registered_customer_mobile_number;
    String dth_Service_Provider;
    double monthly_Bill_Amount;
    String dth_expiry_date;

    //These properties are used to make fastTag Payment
    long car_number;
    String customer_name;
    long ac_number;

    //These properties are used to make Credit card Payment
    long cc_number;
    String expiry_date;
    String card_holder_name;
    double cc_bill;

    //this method is used to make mobile recharge
    public static void makePayment(long mobile_number,String service_provider,double recharge_amount,String validity){
        System.out.println("============This is Mobile Recharge=================");
        System.out.println("Mobile Number = "+mobile_number);
        System.out.println("Srevice Provider = "+service_provider);
        System.out.println("Recharge Amount = "+recharge_amount);
        System.out.println("Validity = "+validity);
    }
    public static void makePayment(long cust_id, long dth_number,long registered_customer_mobile_number,String dth_Service_Provider,double monthly_Bill_Amount,String dth_expiry_date){
        System.out.println("=====================This is DTH Payment====================");
        System.out.println("Customer id = "+cust_id);
        System.out.println("DTH Number = "+dth_number);
        System.out.println("Registered Mobile number = "+registered_customer_mobile_number);
        System.out.println("DTH Service PRovider = "+dth_Service_Provider);
        System.out.println("Monthly Bill amount = "+monthly_Bill_Amount);
        System.out.println("DTH Expiry Date = "+dth_expiry_date);
    }
    public static void makePayment(long car_number,String customer_name,long ac_number){
        System.out.println("=====================This is FastTag Payment=====================");
        System.out.println("Car Number = "+car_number);
        System.out.println("Customer Name = "+customer_name);
        System.out.println("Account Number = "+ac_number);
    }
    public static void makePayment(long cc_number,String expiry_date,String card_holder_name,double cc_bill){
        System.out.println("==============This is Credit Card Payment================");
        System.out.println("Credit Card Number = "+cc_number);
        System.out.println("Expiry Date = "+expiry_date);
        System.out.println("Card Holder Name = "+card_holder_name);
        System.out.println("Credit CArd Bill = "+cc_bill);
    }

    public static void main(String[] args) {
        BillAndRecharge.makePayment(97256662,"AIRTEL",666.0d,"84");
        BillAndRecharge.makePayment(87536951,582147654,700633513,"Jio",300.0d,"25/06/2025");
        BillAndRecharge.makePayment(5847237,"Rafiq Ahmad",22588759);
        BillAndRecharge.makePayment(28741369,"04/02/2026","Mohammad osman",600.0d);
    }

}
