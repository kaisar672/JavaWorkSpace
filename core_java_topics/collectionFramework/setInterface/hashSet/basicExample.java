package core_java_topics.collectionFramework.setInterface.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class basicExample {
    public static void main(String[] args) {
        HashSet<String> cityNames=new HashSet<>();
        cityNames.add("Delhi");
        cityNames.add("Banglore");
        cityNames.add("Mumbai");
        cityNames.add("Hyderabad");
        cityNames.add("Chennai");
        cityNames.add(null);
        cityNames.add("Hyderabad");

        for(String city:cityNames){
            System.out.println(city);
        }

        HashSet<String> setObj2=new HashSet<>();
        setObj2.add("Raichur");
        setObj2.add("Goa");
        setObj2.add("Kerla");
        System.out.println("==================Using addAll(Collection c)method to add new Object to already existing Object");
        cityNames.addAll(setObj2);
        Iterator<String>it=cityNames.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("To check the size of 'cityNames' Object is "+cityNames.size());
        System.out.println("To Check the if the element exits in the 'cityNames' object is = "+cityNames.contains("hyderabad"));
        System.out.println("To check if the size is empty or not = "+cityNames.isEmpty());
        cityNames.remove("Delhi");
        System.out.println("After Removing The Elements from the list is : ");
        Iterator<String>it1=cityNames.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
        cityNames.removeAll(setObj2);
        System.out.println("After using removeAll() method :");
        Iterator<String>it2=cityNames.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
        System.out.println("");
        Object object=(Object) cityNames.clone();
        System.out.println("Clone Object= "+object);
        Object obj[]=cityNames.toArray();
        for(Object ob:obj){
            System.out.println(ob);
        }





    }
}
