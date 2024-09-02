package core_java_topics.ioPackages.serialization.aggregation;

import java.io.Serializable;

public class ContactDetails implements Serializable {
    private static final long serialVersionUID=1l;
    private String customer_name;
    private String branch;
    private String city;
    private String mailing_address;
    private String address;
    private long zip_code;
    private String state;

    public ContactDetails(String customer_name, String branch, String city, String mailing_address, String address, long zip_code, String state) {
        this.customer_name = customer_name;
        this.branch = branch;
        this.city = city;
        this.mailing_address = mailing_address;
        this.address = address;
        this.zip_code = zip_code;
        this.state = state;
    }
    public String getCustomer_name() {
        return customer_name;
    }
    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getMailing_address() {
        return mailing_address;
    }
    public void setMailing_address(String mailing_address) {
        this.mailing_address = mailing_address;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public long getZip_code() {
        return zip_code;
    }
    public void setZip_code(long zip_code) {
        this.zip_code = zip_code;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
}
