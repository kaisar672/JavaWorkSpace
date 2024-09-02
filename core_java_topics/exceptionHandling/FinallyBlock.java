package core_java_topics.exceptionHandling;

public class FinallyBlock {
    public static void main(String[] args) {
        System.out.println("Important 1");
        System.out.println("Important code 2");
        try{
            int number=100/0;
            System.out.println("After division : "+number);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("This Block gets always executed irrespective of the Exception occurs or not , handled or not");
        }
        System.out.println("Statement 3");
        System.out.println("Statement 4");
    }

}
