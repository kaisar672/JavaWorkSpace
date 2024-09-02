package core_java_topics.polymorphism.runTimePoymorphism.methodOverriding.basicExample;

public class FourWheeler extends Vehicle {
    @Override
    public void start(){
        System.out.println("Four Wheeler vehicle is starting");
    }
    @Override
    public void stop(){
        System.out.println("Four Wheeler vehicle is stopping");
    }
}
