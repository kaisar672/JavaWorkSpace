package core_java_topics.collectionFramework.mapInterface.treeMap.basicExample;

import java.awt.image.ImageProducer;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeObj=new TreeMap<>();
        System.out.println("=======================Using put(key k , value v) method() to store key-value pair===============");
        treeObj.put(187,"Hyderabad");
        treeObj.put(167,"Raichur");
        treeObj.put(157,"Ranchi");
        treeObj.put(120,"chandigarh");
        treeObj.put(121,"Goa");
        treeObj.put(125,"pune");
        treeObj.put(130,"Banglore");
        treeObj.put(105,"Chennai");
        treeObj.put(104,null);
        treeObj.put(101,null);
        for(Map.Entry<Integer,String> entry:treeObj.entrySet()){
            System.out.println("key = "+entry.getKey()+" value = "+entry.getValue());
        }
        System.out.println("To check Whether key is present or not = "+treeObj.containsKey(101));
        System.out.println("To check whether the value is present or not = "+treeObj.containsValue("chandigarh"));
        System.out.println("==============using putAll(Collection c) method to add new Map Object to already existing object============");
        TreeMap<Integer,String>treeObj2=new TreeMap<>();
        treeObj2.put(200,"Nagpur");
        treeObj2.put(201,"Kerla");
        treeObj2.put(202,"Delhi");
        treeObj2.putAll(treeObj);
        Iterator<Map.Entry<Integer,String>> entry =treeObj2.entrySet().iterator();
        while(entry.hasNext()){
            Map.Entry<Integer,String> ob=entry.next();
            System.out.println("key = "+ob.getKey()+" value = "+ob.getValue());
        }
        System.out.println("================Using Descending keySet===============================");
        Set<Integer> keySet=treeObj2.descendingKeySet();
        for(Integer key:keySet){
            System.out.println("key = "+key);
        }
        Map.Entry<Integer,String> firstEntry=treeObj2.pollFirstEntry();
        System.out.println("================================First Entry=================================");
        System.out.println("key = "+firstEntry.getKey()+" value = "+firstEntry.getValue());
        Map.Entry<Integer,String> secondentry=treeObj2.pollLastEntry();
        System.out.println("================================Second Entry=================================");
        System.out.println("key = "+secondentry.getKey()+" value = "+secondentry.getValue());
        Map<Integer,String>map1=treeObj2.subMap(105,167);
        System.out.println("=================Sub Map===========================");
        Iterator<Map.Entry<Integer,String>> it1=map1.entrySet().iterator();
        while(it1.hasNext()){
            Map.Entry<Integer,String>en=it1.next();
            System.out.println("Key = "+en.getKey()+"  value = "+en.getValue());
        }
        System.out.println("==================Ceiling Entry======================");
        Map.Entry<Integer,String>ent=treeObj2.ceilingEntry(105);
        System.out.println("Key = "+ent.getKey()+" value = "+ent.getValue());

    }
}
