package core_java_topics.abstraction.interfaces.hundredPercentAbstraction.example1;

public class HomeLoanDetails {
    public static void main(String[] args) {
        BankOfBaroda bankOfBaroda=new BankOfBaroda();
        BankBazar iciciBank=new ICICIBank();
        BankBazar axisBank=new AxisBank();

        System.out.println("This is Bank of Baroda Rate of Interest = "+bankOfBaroda.getHomeLoanRoI("Bank Of Baroda"));
        System.out.println("This is ICICi Bank Rate of Interest = "+iciciBank.getHomeLoanRoI("ICICI Bank"));
        System.out.println("This is Axis Bank Rate of Interest = "+axisBank.getHomeLoanRoI("Axis Bank"));
    }
}

