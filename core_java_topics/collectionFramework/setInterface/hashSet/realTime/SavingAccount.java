package core_java_topics.collectionFramework.setInterface.hashSet.realTime;

public class SavingAccount {
    private long saving_acc_number;
    private String saving_account_cust_name;
    private String saving_account_branch_name;
    private String saving_account_city_name;
    private double saving_account_balance;

    public SavingAccount(long saving_acc_number, String saving_account_cust_name, String saving_account_branch_name, String saving_account_city_name, double saving_account_balance) {
        this.saving_acc_number = saving_acc_number;
        this.saving_account_cust_name = saving_account_cust_name;
        this.saving_account_branch_name = saving_account_branch_name;
        this.saving_account_city_name = saving_account_city_name;
        this.saving_account_balance = saving_account_balance;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "saving_acc_number=" + saving_acc_number +
                ", saving_account_cust_name='" + saving_account_cust_name + '\'' +
                ", saving_account_branch_name='" + saving_account_branch_name + '\'' +
                ", saving_account_city_name='" + saving_account_city_name + '\'' +
                ", saving_account_balance=" + saving_account_balance +
                '}';
    }
}
