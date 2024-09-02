package core_java_topics.inheritance.multiLevelInheritance;

public class BankingAccount extends Asset {
    private long acc_number;
    private String acc_holder_name;
    public long getAcc_number() {
        return acc_number;
    }
    public void setAcc_number(long acc_number) {
        this.acc_number = acc_number;
    }
    public String getAcc_holder_name() {
        return acc_holder_name;
    }
    public void setAcc_holder_name(String acc_holder_name) {
        this.acc_holder_name = acc_holder_name;
    }
    public void displayBankInfo(){
        super.displayAsset();
        System.out.println("Account Number = "+acc_number);
        System.out.println("Account Holder Name = "+acc_holder_name);
    }
}
