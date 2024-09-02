package core_java_topics.exceptionHandling;
public class NestedTryBlock {
    public static void main(String[] args) {
        System.out.println("Statement 1");
        System.out.println("Statement 2");
        try{
            try{
                System.out.println("Nested Try Block 1");
                int number =23/0;
                System.out.println("After Division : "+number);
            }
            catch(ArithmeticException e){
                e.printStackTrace();
            }
            try{
                System.out.println("Nested Try Block 2");
                String name=null;
                System.out.println("Length of name is = "+name.length());
            }
            catch(NullPointerException e){
                e.printStackTrace();
            }
            System.out.println("Main Try Block");
            int arr[]={2,5,8,9,5,6};
            System.out.println("value at 6th index is  = "+arr[6]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("Statement 5");
    }
}
