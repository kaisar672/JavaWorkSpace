package core_java_topics.polymorphism.staticPolymorphism.methodOverloading.basicExample;

public class Addition {
    static int add(int a,int b){
        return a+b;
    }
    static double add(double a,double b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("Addition of Two Numbers is = "+Addition.add(2,5));
        System.out.println("Addition of Two Numbers is = "+Addition.add(4.5,8.7));
    }
}
