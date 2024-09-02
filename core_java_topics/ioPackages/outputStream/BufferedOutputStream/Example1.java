package core_java_topics.ioPackages.outputStream.BufferedOutputStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Example1 {
    public static void main(String[] args) {
        try{
            File file=new File("C:\\java WorkSpace\\io packages\\test3.txt");
            FileOutputStream fout=new FileOutputStream(file);
            BufferedOutputStream bout=new BufferedOutputStream(fout);
            String sentence="Welcome to the java";
            byte[] arr=sentence.getBytes();
            bout.write(arr);
            bout.close();
            fout.close();
            System.out.println("Data Saved successfully");
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
}
