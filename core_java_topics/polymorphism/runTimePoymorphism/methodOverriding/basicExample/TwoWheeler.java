package core_java_topics.polymorphism.runTimePoymorphism.methodOverriding.basicExample;

public class TwoWheeler extends Vehicle {
    @Override
    public void start(){
        System.out.println("Two Wheeler Vehicle is Starting");
    }
    @Override
    public void stop(){
        System.out.println("Two Wheeler Vehicle is Stopping");
    }
}
