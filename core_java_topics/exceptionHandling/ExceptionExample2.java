package core_java_topics.exceptionHandling;

public class ExceptionExample2 {
    public static void main(String[] args) {
        System.out.println("Important code 1");
        System.out.println("Important code 2");
        try{
            int arr[]={1,2,4,5,6,7,8,9};
            System.out.println("Element at 5th index is = "+arr[8]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("Important code 3 ");
        System.out.println("Important code 4");
    }
}
