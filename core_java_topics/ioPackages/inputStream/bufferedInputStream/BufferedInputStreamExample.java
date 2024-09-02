package core_java_topics.ioPackages.inputStream.bufferedInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream("C:\\java WorkSpace\\io packages\\test2.txt");
            BufferedInputStream bis=new BufferedInputStream(fis);

            int i=0;
            while((i=bis.read())!=-1){
                System.out.print((char)i);
            }
            bis.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
