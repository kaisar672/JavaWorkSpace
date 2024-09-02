package core_java_topics.inheritance.hierarchicalInheritance;
public class HealthInsurance extends Insurance{
    private String hospitals;
    private int number_of_hospitals;
    public String getHospitals() {return hospitals;}
    public void setHospitals(String hospitals) {
        this.hospitals = hospitals;
    }
    public int getNumber_of_hospitals() {
        return number_of_hospitals;
    }
    public void setNumber_of_hospitals(int number_of_hospitals) {
        this.number_of_hospitals = number_of_hospitals;
    }
}
