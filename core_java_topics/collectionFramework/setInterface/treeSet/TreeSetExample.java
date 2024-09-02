package core_java_topics.collectionFramework.setInterface.treeSet;

import java.util.*;
import java.util.stream.Collectors;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> setObj1=new TreeSet<>();
        System.out.println("===================After add() method ==========================");
        setObj1.add(15);
        setObj1.add(47);
        setObj1.add(87);
        setObj1.add(90);
        setObj1.add(98);
        setObj1.add(100);
        for(Integer num: setObj1){
            System.out.println(num);
        }
        System.out.println("====================Student Names Set=================================");
        TreeSet<String> studentNames=new TreeSet<>();
        studentNames.add("Bindu");
        studentNames.add("Rita");
        studentNames.add("Susee");
        studentNames.add("ulfat");
        studentNames.add("Nitesha");
        studentNames.add("Aisha");
        studentNames.add("Bazila");
        Iterator<String>name=studentNames.iterator();
        while(name.hasNext()){
            System.out.println(name.next());
        }
        System.out.println("================first() method=====================");
        System.out.println("First Element = "+studentNames.first());
        System.out.println("==============Last() method=====================");
        System.out.println("Last element =  "+studentNames.last());
        System.out.println("===============================Iterate Student Names in descending order============================  ");
        Iterator<String>it=studentNames.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //HashSet<String> stNames=new HashSet<>();
        List<String> names=studentNames.stream().sorted().collect(Collectors.toList());
        System.out.println(names);
        Set<String> nam=studentNames.stream().sorted().collect(Collectors.toSet());
        System.out.println(nam);
        System.out.println("=============Adding suffix 'khan' in each name");
        studentNames.stream().map(str->str+" khan").forEach(System.out::println);
        System.out.println("====================================Display Names with only starts A or B=============================");
//        List<String>nameWithAB=studentNames.stream().filter(str->str.charAt(0)=='B' || str.charAt(0)=='A').collect(Collectors.toList());
//        Iterator<String> it1=nameWithAB.iterator();
//        while(it1.hasNext()){
//            System.out.println(it1.next());
//        }
        studentNames.stream().filter(str->str.charAt(0)=='A' || str.charAt(0)=='B').forEach(System.out::println);

    }
}
