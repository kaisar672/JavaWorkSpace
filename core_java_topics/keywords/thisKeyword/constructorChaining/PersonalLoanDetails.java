package core_java_topics.keywords.thisKeyword.constructorChaining;

public class PersonalLoanDetails {
    public static void main(String[] args) {
        PersonalLoan loan1=new PersonalLoan(52871456,25774656,"Haider","Hyderabad","Saving","HYderabd",5,5000000,250000,5.8,200.0d);
        PersonalLoan loan2=new PersonalLoan(658123,8951357,"Hamza","Srinagar","current","srinagar",7,1000000,20000,5.5,80000);
        loan1.displayInfo();
        loan2.displayInfo();
    }
}
