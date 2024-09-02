package core_java_topics.ioPackages.inputStream.fileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("C:\\java WorkSpace\\io packages\\test1.txt");
            int i=file.read();
            System.out.println((char)i);
            file.close();

        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }
}
