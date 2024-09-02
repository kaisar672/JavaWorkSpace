package core_java_topics.ioPackages.serialization.transientKeyword;

import java.io.Serializable;

public class FixedTermDepositAccount implements Serializable {
    private static final long serialVersionUID=1L;
    private long fda_acc_number;
    private String fda_cust_name;
    private String fda_branch_name;
    private String fda_city_name;
    private transient String fda_state;
    private transient long mobile_number;
    private transient double rate_of_interest;
    private double fda_amount;

    public FixedTermDepositAccount(long fda_acc_number, String fda_cust_name, String fda_branch_name, String fda_city_name, String fda_state, long mobile_number, double rate_of_interest, double fda_amount) {
        this.fda_acc_number = fda_acc_number;
        this.fda_cust_name = fda_cust_name;
        this.fda_branch_name = fda_branch_name;
        this.fda_city_name = fda_city_name;
        this.fda_state = fda_state;
        this.mobile_number = mobile_number;
        this.rate_of_interest = rate_of_interest;
        this.fda_amount = fda_amount;
    }
    public long getFda_acc_number() {
        return fda_acc_number;
    }
    public void setFda_acc_number(long fda_acc_number) {
        this.fda_acc_number = fda_acc_number;
    }
    public String getFda_cust_name() {
        return fda_cust_name;
    }
    public void setFda_cust_name(String fda_cust_name) {
        this.fda_cust_name = fda_cust_name;
    }
    public String getFda_branch_name() {
        return fda_branch_name;
    }
    public void setFda_branch_name(String fda_branch_name) {
        this.fda_branch_name = fda_branch_name;
    }
    public String getFda_city_name() {
        return fda_city_name;
    }
    public void setFda_city_name(String fda_city_name) {
        this.fda_city_name = fda_city_name;
    }
    public String getFda_state() {
        return fda_state;
    }
    public void setFda_state(String fda_state) {
        this.fda_state = fda_state;
    }
    public long getMobile_number() {
        return mobile_number;
    }
    public void setMobile_number(long mobile_number) {
        this.mobile_number = mobile_number;
    }
    public double getRate_of_interest() {
        return rate_of_interest;
    }
    public void setRate_of_interest(double rate_of_interest) {
        this.rate_of_interest = rate_of_interest;
    }
    public double getFda_amount() {
        return fda_amount;
    }
    public void setFda_amount(double fda_amount) {
        this.fda_amount = fda_amount;
    }
}
