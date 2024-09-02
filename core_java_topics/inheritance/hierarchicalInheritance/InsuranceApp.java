package core_java_topics.inheritance.hierarchicalInheritance;

public class InsuranceApp {
    public static void main(String[] args) {
        TermLifeInsurance termLifeInsurance=new TermLifeInsurance();
        HealthInsurance healthInsurance=new HealthInsurance();

        termLifeInsurance.setInsurance_id(25875369);
        termLifeInsurance.setApplicant_name("kaisar");
        termLifeInsurance.setInsurance_type("Term Life Insurance");
        termLifeInsurance.setInsurance_provider("HDFC Life Insurance");
        termLifeInsurance.setInsurance_amount(500000);
        termLifeInsurance.setInsurance_emi(20000.0d);
        termLifeInsurance.setDescription("For Your Life");

        healthInsurance.setInsurance_id(546951357);
        healthInsurance.setApplicant_name("Hamza");
        healthInsurance.setInsurance_provider("TATA AIA");
        healthInsurance.setInsurance_type("Health Insurance");
        healthInsurance.setInsurance_amount(4500000);
        healthInsurance.setHospitals("Care Hospital");
        healthInsurance.setNumber_of_hospitals(3);

        System.out.println("=================Term Life Insurance================");
        System.out.println("Insurance Id = "+termLifeInsurance.getInsurance_id());
        System.out.println("Applicant Name = "+termLifeInsurance.getApplicant_name());
        System.out.println("Insurance Type = "+termLifeInsurance.getInsurance_type());
        System.out.println("Insurance Provider = "+termLifeInsurance.getInsurance_provider());
        System.out.println("Insurance Amount = "+termLifeInsurance.getInsurance_amount());
        System.out.println("Insurance EMI = "+termLifeInsurance.getInsurance_emi());
        System.out.println("Insurance description = "+termLifeInsurance.getDescription());

        System.out.println("==================Health Insurance Details==============");
        System.out.println("Insurance Id = "+healthInsurance.getInsurance_id());
        System.out.println("Applicant Name = "+healthInsurance.getApplicant_name());
        System.out.println("Insurance Type = "+healthInsurance.getInsurance_type());
        System.out.println("Insurance Provider = "+healthInsurance.getInsurance_provider());
        System.out.println("Insurance Amount = "+healthInsurance.getInsurance_amount());
        System.out.println("Hospital = "+healthInsurance.getHospitals());
        System.out.println("Number Of Hospitals = "+healthInsurance.getNumber_of_hospitals());
    }
}
