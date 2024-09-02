package core_java_topics.collectionFramework.comparatorInterface;

import java.util.ArrayList;
import java.util.Collections;

public class TransactionsSorting {
    public static void main(String[] args) {
        ArrayList<Transactions> listOfTransactions=new ArrayList<>();
        listOfTransactions.add(new Transactions(2587414,"PhonePe","01/02/2024",5429.0d));
        listOfTransactions.add(new Transactions(456321,"Google Pay","01/02/2025",10000.0d));
        listOfTransactions.add(new Transactions(456321,"Phone PE","07/02/2024",1200.0d));
        listOfTransactions.add(new Transactions(456321,"PAyTM","09/0/2024",7000.0d));
        listOfTransactions.add(new Transactions(456987,"Google pay","10/08/2024",15000.0d));
        listOfTransactions.add(new Transactions(852147,"Google Pay","17/01/2024",3000.0d));

        System.out.println("======================Sorting based on TransactionId==================");
        Collections.sort(listOfTransactions,new TransIdComparator());
        for(Transactions obj1:listOfTransactions){
            System.out.println(obj1);
        }
        System.out.println("======================Sorting based on TransactionAmount==================");
        Collections.sort(listOfTransactions,new TransAmountcomparator());
        for(Transactions obj1:listOfTransactions){
            System.out.println(obj1);
        }


    }
}
