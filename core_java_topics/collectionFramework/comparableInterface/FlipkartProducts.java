package core_java_topics.collectionFramework.comparableInterface;
import java.util.ArrayList;
import java.util.Collections;

public class FlipkartProducts {
    public static void main(String[] args) {
        ArrayList<Product> productList=new ArrayList<>();
        productList.add(new Product(258741369,"Samsung Galaxy z fold 5G","You can elevate Your style with this fold 6",200000.0d));
        productList.add(new Product(4569851,"Samsung Galaxy s23 5G","Give Yourself smartPhone that recognizes your emeotions",59999.0d));
        productList.add(new Product(456951258,"Samsung Galaxy Z Flip6 5G","This Flip6 smartPhone from galaxy is a real game changer",109999.0d));
        productList.add(new Product(2545696,"Samsung galaxy z fold ","This SmartPhone can be holded to attain a compact size",176999.0d));
        productList.add(new Product(45289852,"Samsung galaxy 523 FE","EPIc moments are accessible to all",44999.0d));
        productList.add(new Product(87536951,"Samsung Galaxy Z fold6 5G (pink 256 GB)","12 GB RAM | 245 ROM",164999.0d));
        Collections.sort(productList);
        for(Product prod : productList){
            System.out.println(prod);
        }
//        ArrayList<Integer> numbers=new ArrayList<>();
//        numbers.add(45);
//        numbers.add(65);
//        numbers.add(75);
//        numbers.add(101);
//        numbers.add(102);
//        numbers.add(105);
//        numbers.add(58);
//        Collections.sort(numbers);
//        for(Integer num:numbers){
//            System.out.println(num);
//        }

    }
}
