package core_java_topics.keywords.thisKeyword.constructorChaining;

public class PersonalLoan {
    long loan_id;
    long loan_number;
    String application_name;
    String mailing_address;
    String loan_type;
    String address;
    int tenure;
    double loan_amount;
    double emi_amount;
    double rate_of_interest;
    double processing_fee;

    public PersonalLoan(long loan_id, long loan_number, String application_name, String mailing_address, String loan_type, String address, int tenure, double loan_amount, double emi_amount, double rate_of_interest) {
        this.loan_id = loan_id;
        this.loan_number = loan_number;
        this.application_name = application_name;
        this.mailing_address = mailing_address;
        this.loan_type = loan_type;
        this.address = address;
        this.tenure = tenure;
        this.loan_amount = loan_amount;
        this.emi_amount = emi_amount;
        this.rate_of_interest = rate_of_interest;
    }

    public PersonalLoan(long loan_id, long loan_number, String application_name, String mailing_address, String loan_type, String address, int tenure, double loan_amount, double emi_amount, double rate_of_interest, double processing_fee) {
        this(loan_id, loan_number,application_name, mailing_address,loan_type,address,tenure, loan_amount,emi_amount,rate_of_interest);
        this.loan_id = loan_id;
        this.loan_number = loan_number;
        this.application_name = application_name;
        this.mailing_address = mailing_address;
        this.loan_type = loan_type;
        this.address = address;
        this.tenure = tenure;
        this.loan_amount = loan_amount;
        this.emi_amount = emi_amount;
        this.rate_of_interest = rate_of_interest;
        this.processing_fee = processing_fee;
    }
    public void displayInfo(){
        System.out.println("=================Loan Details==============");
        System.out.println("Loan id= "+loan_id);
        System.out.println("Loan Number = "+loan_number);
        System.out.println("applicant Name = "+application_name);
        System.out.println("Mailing address = "+mailing_address);
        System.out.println("Loan type = "+loan_type);
        System.out.println("Address = "+address);
        System.out.println("Tenure = "+tenure);
        System.out.println("Loan amount = "+loan_amount);
        System.out.println("Emi amount = "+emi_amount);
        System.out.println("Rate of interest = "+rate_of_interest);
    }
}
