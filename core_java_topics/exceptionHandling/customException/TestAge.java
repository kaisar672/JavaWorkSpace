package core_java_topics.exceptionHandling.customException;

public class TestAge {
    public static void main(String[] args) {
        try{
            validateAge(15);
        }
        catch(InvalidAgeException e){
            e.printStackTrace();
        }
        System.out.println("Important Code 2");
    }
    public static void validateAge(int age) throws InvalidAgeException{
        if(age<20){
            throw new InvalidAgeException("Please Enter Valid age above 20 ");
        }
        else{
            System.out.println("Valid age");
        }
    }
}
