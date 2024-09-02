package core_java_topics.ioPackages.outputStream.FileOutputStream;

import java.io.FileOutputStream;

public class FileOutputStreamExample2 {
    public static void main(String[] args) {
        try{
            FileOutputStream fout=new FileOutputStream("C:\\java WorkSpace\\io packages\\test2.txt");
            String statement="This is Io Packages class";
            byte[] b=statement.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Data Saved Successfully");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
