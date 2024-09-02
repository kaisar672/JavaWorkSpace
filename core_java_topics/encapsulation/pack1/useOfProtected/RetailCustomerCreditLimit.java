package core_java_topics.encapsulation.pack1.useOfProtected;

public class RetailCustomerCreditLimit {
    protected long cust_sr_num=987456321;
    protected int limit_grp_number=1111;
    protected String limit_type="credit Type";
    protected double limit_amount=500000.0d;
    protected String starting_date="01-08-2024";
    protected String cust_name="Mohammad Kamran";
    protected void displayCreditLimit(){
        System.out.println("================Credit Card Limit===========================");
        System.out.println("Serial Number : "+cust_sr_num);
        System.out.println("Limit Group Number : "+limit_grp_number);
        System.out.println("Limit amount : "+limit_amount);
        System.out.println("Starting Date : "+starting_date);
        System.out.println("Starting Date = "+starting_date);
        System.out.println("Customer Name = "+cust_name);
    }

}
