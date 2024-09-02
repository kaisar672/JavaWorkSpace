package core_java_topics.collectionFramework.setInterface.linkedHashSet.basicExample;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer>setObj1=new LinkedHashSet<>();
        System.out.println("Using add() method to add the element to the linked hash set Object");
        setObj1.add(56);
        setObj1.add(40);
        setObj1.add(48);
        setObj1.add(78);
        setObj1.add(90);
        setObj1.add(95);
        for(Integer num:setObj1){
            System.out.println(num);
        }
        LinkedHashSet<Integer> numbers=new LinkedHashSet<>();
        numbers.add(74);
        numbers.add(58);
        numbers.add(85);
        numbers.add(null);
        System.out.println("Using addAll(collection c) method to add the collection");
        setObj1.addAll(numbers);

        Iterator<Integer> num=setObj1.iterator();
        while(num.hasNext()){
            System.out.println(num.next());
        }
        System.out.println("To check if the element Exits in the set Object or not : "+setObj1.contains(85));
        System.out.println("Size of Linked Hash Set Object is  = "+setObj1.size());
        System.out.println("After Removing the Element from the object is = ");
        setObj1.remove(90);
        Iterator<Integer> num1=setObj1.iterator();
        while(num1.hasNext()){
            System.out.println(num1.next());
        }
    }
}
