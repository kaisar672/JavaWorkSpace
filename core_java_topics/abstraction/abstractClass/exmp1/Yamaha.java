package core_java_topics.abstraction.abstractClass.exmp1;

import core_java_topics.abstraction.abstractClass.exmp1.Bike;

public class Yamaha extends Bike {
    @Override
    public void run(){
        System.out.println("This is Yamaha run() method of top speed is 160 kmph");
    }
}
