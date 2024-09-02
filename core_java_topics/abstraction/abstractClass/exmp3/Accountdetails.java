package core_java_topics.abstraction.abstractClass.exmp3;

public class Accountdetails extends ForexDemataccount{
    public Accountdetails(){
        //super class constructor will be called implicitly here
        System.out.println("This is Constructor of AccountDetails Class");
    }
    @Override
    public void displayAccInfo(){
        System.out.println("Account Number = 2587413690");
        System.out.println("Customer Name = Kaisar");
        System.out.println("Area= Khanyar");
        System.out.println("City = Srinagar");
        System.out.println("State = Jammu and Kashmir");
    }
    public static void main(String[] args) {
        ForexDemataccount acc1=new Accountdetails();
        acc1.displayAccInfo();
        acc1.method1();
    }
}
