package core_java_topics.collectionFramework.mapInterface.hashMap.basicExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String>map1=new HashMap<>();
        map1.put(101,"Athar Kuchay");
        map1.put(102,"Rakesh");
        map1.put(103,"Kaisar");
        map1.put(104,"Fatima");
        map1.put(105,"Bindu");
        map1.put(106,"Tanzeela");
        System.out.println("Using Put() method to add key/value pair to map1");
        for(Map.Entry<Integer,String>obj:map1.entrySet()){
            System.out.println("key = "+obj.getKey()+" Value = "+obj.getValue());
        }
        System.out.println("========================Using KeySet in forEach Loop=========================");
        for(Integer key:map1.keySet()){
            System.out.println("key = "+key+" value = "+map1.get(key));
        }
        System.out.println("====================Using Iterator over EntrySet()============================");
        Iterator<Map.Entry<Integer,String>>ob= map1.entrySet().iterator();
        while(ob.hasNext()){
            Map.Entry<Integer,String> entry=ob.next();
            System.out.println("key = "+entry.getKey()+" Value = "+entry.getValue());
        }
        System.out.println("========================Using Iterator over KeySet=======================");
        Iterator<Integer>keys=map1.keySet().iterator();
        while(keys.hasNext()){
            int key= keys.next();
            System.out.println("key = "+key+" value = "+map1.get(key));
        }
        System.out.println("========================Using Iterator over Values=======================");
        Iterator<String>val=map1.values().iterator();
        while(val.hasNext()){
            //System.out.println("key = "+map1.get);
            System.out.println("Values= "+val.next());
        }
        map1.replace(105,"sussee");
        System.out.println("====================Using Iterator over EntrySet() after Replacing Value============================");
        Iterator<Map.Entry<Integer,String>>ob1= map1.entrySet().iterator();
        while(ob1.hasNext()){
            Map.Entry<Integer,String> entry=ob1.next();
            System.out.println("key = "+entry.getKey()+" Value = "+entry.getValue());
        }
        map1.remove(106);
        System.out.println("====================Using Iterator over EntrySet() after Removing Value============================");
        Iterator<Map.Entry<Integer,String>>ob4= map1.entrySet().iterator();
        while(ob4.hasNext()){
            Map.Entry<Integer,String> entry=ob4.next();
            System.out.println("key = "+entry.getKey()+" Value = "+entry.getValue());
        }
    }
}
