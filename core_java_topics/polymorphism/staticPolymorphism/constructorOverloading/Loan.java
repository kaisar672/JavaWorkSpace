package core_java_topics.polymorphism.staticPolymorphism.constructorOverloading;

public class Loan {
    private long loan_number;
    private String applicant_name;
    private String loan_type;
    private String disbursal_rate;
    private int tenure;
    private double loan_amount;
    private double processing_fee;

    public Loan(long loan_number, String applicant_name, String loan_type, String disbursal_rate, int tenure, double loan_amount) {
        this.loan_number = loan_number;
        this.applicant_name = applicant_name;
        this.loan_type = loan_type;
        this.disbursal_rate = disbursal_rate;
        this.tenure = tenure;
        this.loan_amount = loan_amount;
    }

    public Loan(long loan_number, String applicant_name, String loan_type, String disbursal_rate, int tenure, double loan_amount, double processing_fee) {
        this(loan_number,applicant_name,loan_type,disbursal_rate,tenure,loan_amount);
        this.processing_fee = processing_fee;
    }
    public void displayInfo(){
        System.out.println("========================Loan Details===========================");
        System.out.println("Loan Number : "+loan_number);
        System.out.println("Applicant Name : "+applicant_name);
        System.out.println("Loan Type : "+loan_type);
        System.out.println("Disbursal Rate : "+disbursal_rate);
        System.out.println("Tenure : "+tenure);
        System.out.println("LoanAmount : "+loan_amount);
        System.out.println("Processing Fee : "+processing_fee);
    }

    public static void main(String[] args) {
        Loan loan1=new Loan(258741369,"KAisar","House Loan","4.5%",7,1000000,2000);
        Loan loan2=new Loan(456951357,"Azhar","Gold Loan","5%",5,500000);
        loan1.displayInfo();
        loan2.displayInfo();
    }
}
