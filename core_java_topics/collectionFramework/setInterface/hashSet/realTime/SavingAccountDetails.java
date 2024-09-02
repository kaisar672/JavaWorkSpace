package core_java_topics.collectionFramework.setInterface.hashSet.realTime;

import java.util.HashSet;

public class SavingAccountDetails {
    public static void main(String[] args) {
        SavingAccount account1=new SavingAccount(123654789,"Lokesh","hyderbad branch","Hyderabad city",10000.0d);
        SavingAccount account2=new SavingAccount(58246934,"Kaisar","Khanyar Branch","Srinagar Branch",120000.0d);
        SavingAccount account3=new SavingAccount(549513575,"Susee","chennai Branch","Chennai city",14700.0d);
        SavingAccount account4=new SavingAccount(46951258,"Bindu","Andhra Branch","Andhra City",50000.0d);
        System.out.println("hashCode of Account 4= "+account4.hashCode());
        System.out.println("hashCode of Account 3= "+account3.hashCode());

        HashSet<SavingAccount>setObj=new HashSet<SavingAccount>();
        setObj.add(account1);
        setObj.add(account2);
        setObj.add(account3);
        setObj.add(account4);
        for(SavingAccount account:setObj){
            System.out.println(account);
        }
        System.out.println(account4.equals(account2));
    }
}
