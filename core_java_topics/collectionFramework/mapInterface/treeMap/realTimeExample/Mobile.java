package core_java_topics.collectionFramework.mapInterface.treeMap.realTimeExample;

public class Mobile {
    String brand_name;
    String model;
    String processor;
    String internal_memory;
    String ram;
    double screen_size;
    double price;

    public Mobile(String brand_name, String model, String processor, String internal_memory, String ram,double screen_size, double price) {
        this.brand_name = brand_name;
        this.model = model;
        this.processor = processor;
        this.internal_memory = internal_memory;
        this.ram = ram;
        this.screen_size = screen_size;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Mobile{" +
                "brand_name='" + brand_name + '\'' +
                ", model='" + model + '\'' +
                ", processor='" + processor + '\'' +
                ", internal_memory='" + internal_memory + '\'' +
                ", ram='" + ram + '\'' +
                ", screen_size=" + screen_size +
                ", price=" + price +
                '}';
    }
}
