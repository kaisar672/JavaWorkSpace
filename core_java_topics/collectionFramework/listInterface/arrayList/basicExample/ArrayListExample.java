package core_java_topics.collectionFramework.listInterface.arrayList.basicExample;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> listOfNames=new ArrayList<>();

        listOfNames.add("lokesh");
        listOfNames.add("rupesh");
        listOfNames.add("Bindu");
        listOfNames.add("kaisar");
        listOfNames.add("Shromona");
        listOfNames.add("Susee");

        //print the names
        System.out.println("use enehanced for loop : ");
        for(String str:listOfNames){
            System.out.println(str);
        }
        System.out.println("=========================Displaying Using Traditional For Loop : =========================");
        for(int i=0;i<listOfNames.size();i++){
            System.out.println(listOfNames.get(i));
        }

        System.out.println("=======================Displaying Using Iterator : ==============================");
        Iterator<String> it=listOfNames.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("========================Using ForEach============================================");
        listOfNames.forEach((String str)->System.out.println(str));

        System.out.println("============================Displaying using Streams================================");
        listOfNames.stream().forEach(str->System.out.println(str));

        System.out.println("=====================Displaying using get Method==================================");
        System.out.println(listOfNames.get(0));
        System.out.println(listOfNames.get(1));
        System.out.println(listOfNames.get(2));
        System.out.println(listOfNames.get(3));
        System.out.println(listOfNames.get(4));
        System.out.println(listOfNames.get(5));
        //System.out.println(listOfNames.get(6));
        List<String> boysNames=new ArrayList<>(Arrays.asList("Abu Bakr","Usman","Muneeb","Umar"));
        listOfNames.addAll(boysNames);
        System.out.println("=======================Displaying After addAll() method Using Iterator : ==============================");
        Iterator<String> it1=listOfNames.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
        listOfNames.remove("Abu Bakr");
        System.out.println(listOfNames);
        System.out.println("Size of List is = "+listOfNames.size());
//        listOfNames.clear();
//        System.out.println(listOfNames);
        Spliterator<String> split=listOfNames.spliterator();


    }
}
