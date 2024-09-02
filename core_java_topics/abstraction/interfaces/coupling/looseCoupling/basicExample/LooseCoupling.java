package core_java_topics.abstraction.interfaces.coupling.looseCoupling.basicExample;

public class LooseCoupling {
    public static void main(String[] args) {
       // Show b=new B();
       // Show c=new C();
       //  Show d=new D();
        Show e = new E();
        A a = new A(e);
        a.display();
    }
}
