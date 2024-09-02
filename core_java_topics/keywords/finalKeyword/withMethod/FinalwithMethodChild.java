package core_java_topics.keywords.finalKeyword.withMethod;

public class FinalwithMethodChild extends FinalWithMethod{
//    @Override
//    public final void method1(){
//        System.out.println("This is child Class");
//    }
    public void display(){
        System.out.println("This is display method");
    }

    public static void main(String[] args) {
        FinalwithMethodChild obj=new FinalwithMethodChild();
        obj.method1();
        obj.display();
    }
}
