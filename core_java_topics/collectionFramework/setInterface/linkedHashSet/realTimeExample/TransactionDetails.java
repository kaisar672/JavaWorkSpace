package core_java_topics.collectionFramework.setInterface.linkedHashSet.realTimeExample;

import java.util.LinkedHashSet;

public class TransactionDetails {
    public static void main(String[] args) {
        LinkedHashSet<TransactionStatement> setObj1=new LinkedHashSet<>();
        setObj1.add(new TransactionStatement(258741,"24/05/2024","PhonePe",23000.0d));
        setObj1.add(new TransactionStatement(54698725,"28/02/2021","google pe",480000.0d));
        setObj1.add(new TransactionStatement(753951,"15/02/2022","Paytm",60000.0d));
        setObj1.add(new TransactionStatement(853695,"16/03/2024","phonepe",70000.0d));
        int count=1;
        for(TransactionStatement obj:setObj1){
            System.out.println("===============================Transaction "+count+" Details===================================");
            System.out.println("Transaction id = "+obj.trans_id);
            System.out.println("Transaction Date = "+obj.trans_date);
            System.out.println("transaction Type = "+obj.trans_type);
            System.out.println("Transaction Amount = "+obj.trans_amount);
            count++;

        }
    }
}
