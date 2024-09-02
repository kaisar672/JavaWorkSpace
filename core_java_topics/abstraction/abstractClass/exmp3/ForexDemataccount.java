package core_java_topics.abstraction.abstractClass.exmp3;

public abstract class ForexDemataccount {
    public ForexDemataccount() {
        System.out.println("This is default /no argument Constructor");
    }
    public abstract void displayAccInfo();
    public void method1(){
        System.out.println("This is no-abstract method ");
    }
}
