package core_java_topics.exceptionHandling;

public class ExceptionExample1 {
    public static void main(String[] args) {
        System.out.println("Important code 1");
        System.out.println("Important code 2");
        try{
            int number=20/0;
            System.out.println("Value after division = "+number);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Important code 3");
        System.out.println("Important code 4");
    }
}
