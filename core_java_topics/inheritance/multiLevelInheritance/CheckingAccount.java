package core_java_topics.inheritance.multiLevelInheritance;

public class CheckingAccount extends BankingAccount {
    private double overDraftLimit;

    public double getOverDraftLimit() {
        return overDraftLimit;
    }
    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }
    public void displayCheckingAccInfo(){
        super.displayBankInfo();
        System.out.println("OverDraft Limit = "+overDraftLimit);
    }
}
