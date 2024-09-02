package core_java_topics.abstraction.abstractClass.exmp1;

import core_java_topics.abstraction.abstractClass.exmp1.Bike;

public class HondaActive extends Bike {
    @Override
    public void run() {
        System.out.println("This is Honda Active run() method of top speed 100kmph");
    }
}
