package core_java_topics.innerClasses.staticInnerclass;
public class OuterClass {

    private static int CUST_Id =57786;
    private static String DOMESTIC_CUSTOMER_BRANCH = "Raichur Branch";
    private static long SECURITY_SOCIAL_NUMBER = 89764676985l;
    private static String VALUATION_DATE = "27-08-2024";
    private static String GURANTOR_BRANCH = "Station Road, Raichur";

    //declare static inner class
    static class WholeSaleCollateralBasic{

        static void displayInfo() {
            System.out.println("Cust id : " + CUST_Id);
            System.out.println("Domestic Customer Branch : " + DOMESTIC_CUSTOMER_BRANCH);
            System.out.println("Security Social Number : " + SECURITY_SOCIAL_NUMBER);
            System.out.println("Valuation Date : " + VALUATION_DATE);
            System.out.println("Gurantor Branch : " + GURANTOR_BRANCH);
        }
    }

    public static void main(String[] args) {

        OuterClass.WholeSaleCollateralBasic.displayInfo();
    }
}

