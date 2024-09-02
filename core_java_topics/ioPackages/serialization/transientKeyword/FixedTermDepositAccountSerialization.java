package core_java_topics.ioPackages.serialization.transientKeyword;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class FixedTermDepositAccountSerialization {
    public static void main(String[] args) {
        try{
            FixedTermDepositAccount account=new FixedTermDepositAccount(258741369,"Owais","Hyderabad","Hyderabad","Telangana",7006335,7.4,20000000.0d);
            FileOutputStream fout = new FileOutputStream("C:\\java WorkSpace\\io packages\\test7.txt");
            ObjectOutputStream o_out = new ObjectOutputStream(fout);
            o_out.writeObject(account);
            o_out.close();
            fout.close();
            System.out.println("Data Saved Successfully");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
