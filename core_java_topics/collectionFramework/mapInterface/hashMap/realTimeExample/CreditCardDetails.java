package core_java_topics.collectionFramework.mapInterface.hashMap.realTimeExample;
import java.util.*;
public class CreditCardDetails {
    public static void main(String[] args) {
        HashMap<Long,List<CreditCard>> mapObj=new HashMap<>();
        List<CreditCard> cardObj1=new ArrayList<>();
        cardObj1.add(new CreditCard(258741,"Abu Bakr","25/04/2029",456,678,50000));
        cardObj1.add(new CreditCard(258741369,"Usame Mir","25/02/2028",546,258,400000));
        cardObj1.add(new CreditCard(4536951,"Hamza","26/02/2025",452,573,400000));
        List<CreditCard>cardObj2=new ArrayList<>();
        cardObj2.add(new CreditCard(456321,"Abbas","26/05/2028",489,875,35000));
        cardObj2.add(new CreditCard(2587539,"Hassan","21/08/2026",452,582,450000));
        List<CreditCard>cardObj3=new ArrayList<>();
        cardObj3.add(new CreditCard(456321,"Hussain","26/02/2026",485,587,4200000));
        cardObj3.add(new CreditCard(547852,"Abbas","24/03/2024",753,951,380000));
        cardObj3.add(new CreditCard(582471,"Asghar","24/02/2027",159,357,50000));

        mapObj.put(123456789L,cardObj1);
        mapObj.put(13579L,cardObj2);
        mapObj.put(24680L,cardObj3);
        Iterator<Map.Entry<Long,List<CreditCard>>> objIt= mapObj.entrySet().iterator();
        while(objIt.hasNext()){
            Map.Entry<Long,List<CreditCard>> entry=objIt.next();
            System.out.println("========Key = "+entry.getKey()+"===========");
            Iterator<CreditCard> cc =entry.getValue().iterator();
            int count=1;
            while(cc.hasNext()){
                System.out.println("================Card Details "+count+"=======================");
                CreditCard card=cc.next();
                System.out.println("Card Number = "+card.cc_number);
                System.out.println("Card Holder Name = "+card.cc_holder_name);
                System.out.println("Expiry Date = "+card.expiry_date);
                System.out.println("CVV Number = "+card.cvv_number);
                System.out.println("Pin number = "+card.pin_number);
                System.out.println("CVV Limit = "+card.cc_limit);
                count++;
                System.out.println("=================================================================================");
            }
        }
    }
}
