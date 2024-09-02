package core_java_topics.ioPackages.outputStream.FileOutputStream;

import java.io.FileOutputStream;

public class FileOutputStreamExample1 {
    public static void main(String[] args) {
        try{
            FileOutputStream fout=new FileOutputStream("C:\\java WorkSpace\\io packages\\test1.txt");
            fout.write(66);
            fout.close();
            System.out.println("Data Written Succssfully");

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
