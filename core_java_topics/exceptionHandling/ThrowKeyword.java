package core_java_topics.exceptionHandling;

public class ThrowKeyword {
    public static void main(String[] args) {
        try{
            checkage(15);
        }
        catch(ArithmeticException e) {
            e.printStackTrace();
        }
    }
    static void checkage(int age){
        if(age<18){
            throw new ArithmeticException("You are Not Eligible to cast your Vote");
        }
        else{
            System.out.println("You are eligible to cast Your Vote");
        }
    }
}

