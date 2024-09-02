package core_java_topics.exceptionHandling;

public class ExceptionExample3 {
    public static void main(String[] args) {
        System.out.println("Important code 1");
        System.out.println("Important code 2");
        try{
            String name="kamran";
            System.out.println("The length of string is = "+name.length());
        }
        catch(NullPointerException e){
            e.printStackTrace();
        }
        System.out.println("Important code 3");
        System.out.println("Important code 4");
    }
}
