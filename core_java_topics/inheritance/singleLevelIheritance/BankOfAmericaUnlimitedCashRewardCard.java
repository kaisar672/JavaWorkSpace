package core_java_topics.inheritance.singleLevelIheritance;

public class BankOfAmericaUnlimitedCashRewardCard extends CreditCard{
    private double annual_fee;
    private String features;
    private double cash_back_offer;
    public double getAnnual_fee() {
        return annual_fee;
    }
    public void setAnnual_fee(double annual_fee) {
        this.annual_fee = annual_fee;
    }
    public String getFeatures() {
        return features;
    }
    public void setFeatures(String features) {
        this.features = features;
    }
    public double getCash_back_offer() {
        return cash_back_offer;
    }
    public void setCash_back_offer(double cash_back_offer) {
        this.cash_back_offer = cash_back_offer;
    }
}
