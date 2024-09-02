package core_java_topics.exceptionHandling.customException;

public class InvalidAgeException extends Exception{
    public InvalidAgeException(String errorMsg){
        super(errorMsg);
    }
}
