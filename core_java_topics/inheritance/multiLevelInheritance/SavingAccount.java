package core_java_topics.inheritance.multiLevelInheritance;

public class SavingAccount extends BankingAccount {
    private double interest_rate;
    public double getInterest_rate() {
        return interest_rate;
    }
    public void setInterest_rate(double interest_rate) {
        this.interest_rate = interest_rate;
    }
    public void displaySavingAccInfo(){
        super.displayBankInfo();
        System.out.println("Rate of Interest = "+interest_rate);
    }
}
