package core_java_topics.collectionFramework.comparableInterface;
public class Product implements Comparable<Product>{
    long prod_id;
    String prod_name;
    String prod_desc;
    double prod_price;
    public Product(long prod_id, String prod_name, String prod_desc, double prod_price) {
        this.prod_id = prod_id;
        this.prod_name = prod_name;
        this.prod_desc = prod_desc;
        this.prod_price = prod_price;
    }
    @Override
    public int compareTo(Product prod){
        if(prod_price>prod.prod_price)
            return 1;
        else if(prod_price<prod.prod_price)
            return -1;
        else
            return 0;
    }
    @Override
    public String toString() {
        return "Product{" +
                "prod_id=" + prod_id +
                ", prod_name='" + prod_name + '\'' +
                ", prod_desc='" + prod_desc + '\'' +
                ", prod_price=" + prod_price +
                '}';
    }
}





