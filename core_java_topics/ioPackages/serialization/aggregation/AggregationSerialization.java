package core_java_topics.ioPackages.serialization.aggregation;
import java.io.*;

public class AggregationSerialization {
    public static void main(String[] args) {
        try {
//            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("C:\\java WorkSpace\\io packages\\test9.txt"));
//
//            ContactDetails contactDetails=new ContactDetails("Afshan","khanyar","Srinagar","Rozbal khanyar","khanyar Srinagr",190003,"Jamu and kashmir");
//            SavingAccount account=new SavingAccount(258741369,"khanyar","Afshan",800000,contactDetails);
//
//            //serialize the object successfully
//            out.writeObject(account);
//            out.close();
//            System.out.println("Aggrecation Serialized successfully");

            //deserialize the object
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\java WorkSpace\\io packages\\test9.txt"));
            SavingAccount account1 = (SavingAccount) ois.readObject();
            System.out.println(account1);
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
