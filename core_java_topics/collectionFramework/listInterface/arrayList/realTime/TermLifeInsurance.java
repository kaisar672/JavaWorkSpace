package core_java_topics.collectionFramework.listInterface.arrayList.realTime;

import java.util.ArrayList;

public class TermLifeInsurance {
    public static void main(String[] args) {
        ArrayList<PolicyBazar> listOfInsurance=new ArrayList<>();
        listOfInsurance.add(new PolicyBazar(258741369,"Abu Bakr","TATA",1200.0d,3000000.0d,60,400000.0d,98.0d));
        listOfInsurance.add(new PolicyBazar(582469513,"Osama Mir","HDFC",1350.0d,400000.0d,65,1500000.0d,96.0d));
        listOfInsurance.add(new PolicyBazar(58246951,"Umar","PNB METLifE",1850.0d,4000000.0d,70,200000.0d,99.0d));
        listOfInsurance.add(new PolicyBazar(789513558,"Hamza","ICICI",1350.0d,6000000.0d,65,2500000.0d,92.0d));
        listOfInsurance.add(new PolicyBazar(456951357,"Owais","AXIS",1800.0d,5000000.0d,70,3000000.0d,99.0d));
        for(PolicyBazar insurance:listOfInsurance){
            System.out.println(insurance);
        }

    }
}
