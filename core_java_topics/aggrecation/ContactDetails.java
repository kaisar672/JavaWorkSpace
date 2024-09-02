package core_java_topics.aggrecation;
public class ContactDetails {
    String customer_name;
    String address;
    String city;
    String state;
    String panCard;
    long zipCode;

    public ContactDetails(String customer_name, String address, String city, String state, String panCard, long zipCode) {
        this.customer_name = customer_name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.panCard = panCard;
        this.zipCode = zipCode;
    }
    @Override
    public String toString(){
        return "Contact Details = [ "+ "Customer Name : "+customer_name +", address : "+address+",  City : "+city+ ",  State : "+state+",  panCard : "+panCard+ ",  ZipCode : "+zipCode +"]";
    }
}
