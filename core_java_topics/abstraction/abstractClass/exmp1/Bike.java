package core_java_topics.abstraction.abstractClass.exmp1;

public abstract class Bike {
    public abstract void run();
    public void price(double amount){
        System.out.println("The price of Bike is = "+amount);
    }
    public void bikeName(String bikeName){
        System.out.println("The Bike Name is : "+bikeName);
    }


}
