package core_java_topics.abstraction.abstractClass.exmp1;

public class BikeDetails {
    public static void main(String[] args) {

        HondaActive hondaBike=new HondaActive();
        Bike pulsarBike=new Pulsar() ;
        Bike yamahaBike=new Yamaha();

        System.out.println("=============Honda bike Details================================");
        hondaBike.run();
        hondaBike.bikeName("Hero Honda");
        hondaBike.price(70000);

        System.out.println("=============Pulsar bike Details================================");
        pulsarBike.run();
        pulsarBike.bikeName("Pulsar");
        pulsarBike.price(120000);

        System.out.println("=============Yamaha bike Details================================");
        yamahaBike.run();
        yamahaBike.bikeName("Yamaha");
        yamahaBike.price(800000);

    }

}
