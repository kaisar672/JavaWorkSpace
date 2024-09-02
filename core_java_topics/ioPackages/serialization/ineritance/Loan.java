package core_java_topics.ioPackages.serialization.ineritance;

import java.io.Serializable;

public class Loan implements Serializable {
    private static final long serialVersionUID=1l;
    private long loan_id;
    private String loan_type;
    private String bank_name;
    Loan(){}
    public Loan(long loan_id, String loan_type, String bank_name) {
        this.loan_id = loan_id;
        this.loan_type = loan_type;
        this.bank_name = bank_name;
    }
    public long getLoan_id() {
        return loan_id;
    }
    public void setLoan_id(long loan_id) {
        this.loan_id = loan_id;
    }
    public String getLoan_type() {
        return loan_type;
    }
    public void setLoan_type(String loan_type) {
        this.loan_type = loan_type;
    }
    public String getBank_name() {
        return bank_name;
    }
    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }
}
