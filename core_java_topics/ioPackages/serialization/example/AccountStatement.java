package core_java_topics.ioPackages.serialization.example;

import java.io.Serializable;

public class AccountStatement implements Serializable {
    private static final long serialVersionUID=1L;
    private long cust_id;
    private long acc_number;
    private String cust_name;
    private String account_branch;
    private String address;
    private String city;
    private String state;
    private String panCard;
    private long registered_mobile_number;
    private String email_address;
    private long ifsc_code;
    private double acc_balance;

    public AccountStatement(long cust_id, long acc_number, String cust_name, String account_branch, String address, String city, String state, String panCard, long registered_mobile_number, String email_address, long ifsc_code, double acc_balance) {
        this.cust_id = cust_id;
        this.acc_number = acc_number;
        this.cust_name = cust_name;
        this.account_branch = account_branch;
        this.address = address;
        this.city = city;
        this.state = state;
        this.panCard = panCard;
        this.registered_mobile_number = registered_mobile_number;
        this.email_address = email_address;
        this.ifsc_code = ifsc_code;
        this.acc_balance = acc_balance;
    }
    public long getCust_id() {
        return cust_id;
    }
    public void setCust_id(long cust_id) {
        this.cust_id = cust_id;
    }
    public long getAcc_number() {
        return acc_number;
    }
    public void setAcc_number(long acc_number) {
        this.acc_number = acc_number;
    }
    public String getCust_name() {
        return cust_name;
    }
    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }
    public String getAccount_branch() {
        return account_branch;
    }
    public void setAccount_branch(String account_branch) {
        this.account_branch = account_branch;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getPanCard() {
        return panCard;
    }
    public void setPanCard(String panCard) {
        this.panCard = panCard;
    }
    public long getRegistered_mobile_number() {
        return registered_mobile_number;
    }
    public void setRegistered_mobile_number(long registered_mobile_number) {
        this.registered_mobile_number = registered_mobile_number;
    }
    public String getEmail_address() {
        return email_address;
    }
    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }
    public long getIfsc_code() {
        return ifsc_code;
    }
    public void setIfsc_code(long ifsc_code) {
        this.ifsc_code = ifsc_code;
    }
    public double getAcc_balance() {
        return acc_balance;
    }
    public void setAcc_balance(double acc_balance) {
        this.acc_balance = acc_balance;
    }
}
