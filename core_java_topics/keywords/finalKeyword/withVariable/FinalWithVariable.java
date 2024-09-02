package core_java_topics.keywords.finalKeyword.withVariable;

public class FinalWithVariable {
    final long cc_number=258741369;
    String cc_holder_name="Mohammad Kamran";
    String expiry_date="12/02/2025";
    int cvv_number=272;
    int pin_number=5879;
    double cc_limit=500000;
    public void displayCCInfo(){
        System.out.println("==================Credit Card Details=================");
        System.out.println("CC Number = "+cc_number);
        System.out.println("Customer Name = "+cc_holder_name);
        System.out.println("Expiry Date = "+expiry_date);
        System.out.println("CVV Number = "+cvv_number);
        System.out.println("Pin Number = "+pin_number);
        System.out.println("CC Limit = "+cc_limit);
    }

    public static void main(String[] args) {
        FinalWithVariable obj=new FinalWithVariable();
        //obj.cc_number=258741369;
        obj.displayCCInfo();
    }

}
