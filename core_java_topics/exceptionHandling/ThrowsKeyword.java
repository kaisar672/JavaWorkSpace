package core_java_topics.exceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsKeyword {
    public static void main(String[] args) {
        System.out.println("Important Code");
        try{
            getFile();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    static void getFile() throws FileNotFoundException{
        FileReader reader=new FileReader("C:\\java WorkSpace\\io packages\\test10.txt");
        BufferedReader bof=new BufferedReader(reader);
        System.out.println(bof);
    }
}
