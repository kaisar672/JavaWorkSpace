package core_java_topics.collectionFramework.listInterface.linkedList.basicExample;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> numbers=new LinkedList<>();
        System.out.println("======================using add(e) method to add the elements to linkedList Object=================");
        numbers.add(105);
        numbers.add(106);
        numbers.add(108);
        numbers.add(107);
        numbers.add(100);
        numbers.add(null);
        numbers.add(205);
        numbers.add(305);
        numbers.add(309);
        for(Integer num1:numbers){
            System.out.println(num1);
        }
        System.out.println("Using add(int index,Element e) method to add element at specified location");
        numbers.add(3,700);
        for(Integer num1:numbers){
            System.out.println(num1);
        }

        System.out.println("===============Using addAll(Collection c) method");
        LinkedList<Integer>numbers2=new LinkedList<>();
        numbers2.add(1000);
        numbers2.add(1001);
        numbers.add(1002);
        numbers.add(1003);

        numbers.addAll(numbers2);

        for(Integer num1:numbers){
            System.out.println(num1);
        }
        System.out.println("==================Displaying Using Iterator==========================");
        Iterator<Integer> num=numbers.iterator();
        while(num.hasNext()){
            System.out.println(num.next());
        }
        LinkedList<Integer> numbers3=new LinkedList<>();
        numbers3.add(405);
        numbers3.add(406);
        numbers3.add(407);
        System.out.println("======================/using addAll(int index,Collection c) method to add collection at specified location");
        numbers.addAll(4,numbers3);
        Iterator<Integer> num2=numbers.iterator();
        while(num2.hasNext()){
            System.out.println(num2.next());
        }
        System.out.println("================Using AddFirst() and addLast() method===================== ");
        numbers.addFirst(1);
        numbers.addLast(4000);
        Iterator<Integer> num3=numbers.iterator();
        while(num3.hasNext()){
            System.out.println(num3.next());
        }
        System.out.println("Size of list is = "+numbers.size());
        System.out.println("To check whether the element is present or Not = "+numbers.contains(4000));
        System.out.println("To get the First Element is = "+numbers.getFirst());
        System.out.println("To Check the Last the Element is = "+numbers.getLast());
        System.out.println("To get the Specific element at specific index is = "+numbers.get(4));



    }


}
