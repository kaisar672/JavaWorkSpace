package core_java_topics.collectionFramework.mapInterface.treeMap.realTimeExample;

import java.util.*;

public class MobileDetails {
    public static void main(String[] args) {
        TreeMap<String,List<Mobile>> treeMapObj=new TreeMap<String, List<Mobile>>();
        List<Mobile> mobileObj1=new ArrayList<>();
        mobileObj1.add(new Mobile("Samsung","S24 Ultra"," 2.4Ghz octaCore MediaTek","256GB","8GB",5.5,60000.0d));
        mobileObj1.add(new Mobile("iphon","iPhone 14 pro max","qualcom 2.2GHz octaCore","128GB","6GB",5.5,125000.0d));
        mobileObj1.add(new Mobile("OnePlus","OnePlus 10R 5G","QualCom 2.5GHz OctaCore","256GB","8GB",6.5,30000.0d));
        List<Mobile> mobileObj2=new ArrayList<>();
        mobileObj2.add(new Mobile("Xiaomi","12sUlTRA","Octa Core","64Gb","4GB",6.5,40000.0d));
        mobileObj2.add(new Mobile("RealMe","NARZO 7X 5G","octaCore","256GB","12GB",6.4,700000));
        mobileObj2.add(new Mobile("POCO","M6 5G","Media tek 2.4 GHz octaCore","128GB","8GB",6.2,70000.0d));
        List<Mobile>mobileObj3=new ArrayList<>();
        mobileObj3.add(new Mobile("MotoRola","Motorola","octaCore","256GB","16GB",7.2,450000));
        mobileObj3.add(new Mobile("IQOO","IQOO Z7 PRo 5G","OctaCore","64GB","4GB",6.5,50000.0d));
        List<Mobile>mobileObj4=new ArrayList<>();
        mobileObj4.add(new Mobile("Samsung","Galaxy A15 5G","Octa Core","128GB","6GB",6.5,350000.0d));
        mobileObj4.add(new Mobile("Nokia","Nokia G42 5G","OctaCore","128GB","4GB",6.5,80000.0d));

        treeMapObj.put("Kaisar",mobileObj1);
        treeMapObj.put("Fatima",mobileObj2);
        treeMapObj.put("Samren",mobileObj3);
        treeMapObj.put("Ulfat",mobileObj4);

        Iterator<Map.Entry<String,List<Mobile>>> itMap=treeMapObj.entrySet().iterator();
        while(itMap.hasNext()){
            Map.Entry<String,List<Mobile>>ent=itMap.next();
            //System.out.println("key = "+ent.getKey()+" value = "+ent.getValue());
            System.out.println("Key = "+ent.getKey());
            Iterator<Mobile> it1=ent.getValue().iterator();
            int count =1;
            while(it1.hasNext()){
                System.out.println("=============Mobile "+count+" details==================");
                Mobile mobile=it1.next();
                System.out.println("Brand Name = "+mobile.brand_name);
                System.out.println("Model = "+mobile.model);
                System.out.println("Processor = "+mobile.processor);
                System.out.println("Internal Memory = "+mobile.internal_memory);
                System.out.println("Ram = "+mobile.ram);
                System.out.println("Screen Size = "+mobile.screen_size);
                System.out.println("Price = "+mobile.price);
                count++;
                System.out.println("=========================================================================");
            }
        }
    }
}
