package core_java_topics.innerClasses.nonstaticInnerClass.localInnerClass;

import javax.security.auth.login.AccountExpiredException;

public class PaymentSettings {
    private long cell_number=258741369;
    private String customer_name="Mohmmad Kamran";
    private String city="Raichur city";
    public void airtelPaymentSettings(){
        class AirtelPayment{
            public void displayAirtelPaymentSettings(){
                System.out.println("=================This is Airtel Payment Settings================");
                System.out.println("Mobile number = "+cell_number);
                System.out.println("Customer Name = "+customer_name);
                System.out.println("city = "+city);
            }
        }
        AirtelPayment airtelPayment=new AirtelPayment();
        airtelPayment.displayAirtelPaymentSettings();
    }
    public void PaytmPaymentSettings(){
        class PaytmPayment{
            public void displayPaytmPaymentSettings(){
                System.out.println("================This is Paytm Payment Settings==================");
                System.out.println("Mobile Number = "+cell_number);
                System.out.println("Customer Name = "+customer_name);
                System.out.println("City = "+city);
            }
        }
        PaytmPayment payment=new PaytmPayment();
        payment.displayPaytmPaymentSettings();
    }
    public void amazonPaymentSettings(){
        class AmazonPayment{
            public void displayAmazonPaymentSettings(){
                System.out.println("========================Amazon Payment Settings====================");
                System.out.println("Mobile Number = "+cell_number);
                System.out.println("Customer Name = "+customer_name);
                System.out.println("City = "+city);
            }
        }
        AmazonPayment amazonPayment=new AmazonPayment();
        amazonPayment.displayAmazonPaymentSettings();
    }

    public static void main(String[] args) {
        PaymentSettings paymentSettings=new PaymentSettings();
        paymentSettings.airtelPaymentSettings();
        paymentSettings.PaytmPaymentSettings();
        paymentSettings.amazonPaymentSettings();
    }


}
