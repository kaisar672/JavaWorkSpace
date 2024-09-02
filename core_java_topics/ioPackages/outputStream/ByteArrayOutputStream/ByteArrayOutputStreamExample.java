package core_java_topics.ioPackages.outputStream.ByteArrayOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class ByteArrayOutputStreamExample {
    public static void main(String[] args) {
        try{
            File file1=new File("C:\\java WorkSpace\\io packages\\test4.txt");
            File file2=new File("C:\\java WorkSpace\\io packages\\test5.txt");

            FileOutputStream fout1=new FileOutputStream(file1);
            FileOutputStream fout2=new FileOutputStream(file2);

            ByteArrayOutputStream bout=new ByteArrayOutputStream();

            String statement="This is common data written to multiple files";
            byte arr[]=statement.getBytes();

            bout.write(arr);
            bout.writeTo(fout1);
            bout.writeTo(fout2);

            bout.close();
            fout1.close();
            fout2.close();
            System.out.println("Data Written sucessfully to multiple files");
        }
        catch(Exception e){
            e.printStackTrace();
        }


    }
}
