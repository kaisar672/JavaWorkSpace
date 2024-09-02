package core_java_topics.ioPackages.serialization.example;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class AccountStatementSerialization {
    public static void main(String[] args) {
        try {
            AccountStatement account=new AccountStatement(58753,1596357453,"Mohammad Kamran","khanyar","Rozabal khanyar Srinagar","Srinagar","J&k","Axapl3340h",97972569,"m.kaiserlone@gmail.com",25875369,80000000);
            FileOutputStream fout=new FileOutputStream("C:\\java WorkSpace\\io packages\\test6.txt");
            ObjectOutputStream o_out=new ObjectOutputStream(fout);

            o_out.writeObject(account);
            o_out.close();
            fout.close();

            System.out.println("Account Object statement serialized successfully");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
