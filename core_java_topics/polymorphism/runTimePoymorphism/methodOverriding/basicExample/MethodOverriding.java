package core_java_topics.polymorphism.runTimePoymorphism.methodOverriding.basicExample;

public class MethodOverriding {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        Vehicle fourWheelerVehicle=new FourWheeler();
        Vehicle twoWheelerVehicle=new TwoWheeler();

        System.out.println("=================This is Parent Class Vehicle====================");
        vehicle.start();
        vehicle.stop();

        System.out.println("===============This is Four wheeler Vehicle======================");
        fourWheelerVehicle.start();
        fourWheelerVehicle.stop();

        System.out.println("===============This is Two wheeler Vehicle======================");
        twoWheelerVehicle.start();
        twoWheelerVehicle.stop();

    }
}
