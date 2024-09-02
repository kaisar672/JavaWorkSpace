package core_java_topics.abstraction.interfaces.coupling.tightCoupling.realTimeExample;
public class PaymentManager {
    UPIPayment upiPayment;
    ChequePayment chequePayment;
    CreditCardPayment creditCardPayment;
    DebitCardPayment debitCardPayment;
    PayPalPayment payPalPayment;
    public PaymentManager(){
        upiPayment =new UPIPayment();
        chequePayment = new ChequePayment();
        creditCardPayment =new CreditCardPayment();
        debitCardPayment=new DebitCardPayment();
        payPalPayment=new PayPalPayment();
    }
    public void getPaymentManagerMethod(){
        System.out.println("===========This is From Payment Manager Class================");

        System.out.println("==============This is UPI Payment=======================");
        upiPayment.getUPIPayment();

        System.out.println("==================This is Checque Payment=================");
        chequePayment.getchequePayment();

        System.out.println("=====================This is Credit Card Payment================");
        creditCardPayment.getCreditCardPayment();

        System.out.println("====================This is Debit Card Payment===================");
        debitCardPayment.getDebitCardPayment();

        System.out.println("====================This is PAy Pal Method=========================");
        payPalPayment.getPAyPalPayment();
    }
}
