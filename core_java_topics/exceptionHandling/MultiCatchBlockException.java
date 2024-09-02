package core_java_topics.exceptionHandling;

public class MultiCatchBlockException {
    public static void main(String[] args) {
        System.out.println("Important code 1");
        System.out.println("Important code 2");
        try{
            String name=null;
            int number=100/0;
            int arr[]={2,4,7,9,3,4,6};
            System.out.println("length of name = "+name.length());
            System.out.println("After Division= "+number);
            System.out.println("Element at 7 index is = "+arr[7]);
        }
        catch(NullPointerException e){
            e.printStackTrace();
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("Important code 3");
        System.out.println("Important code 4");
    }
}
