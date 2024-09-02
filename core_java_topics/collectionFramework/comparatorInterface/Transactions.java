package core_java_topics.collectionFramework.comparatorInterface;

public class Transactions {
    long trans_id;
    String trans_remarks;
    String trans_date;
    double trans_amount;
    public Transactions(long trans_id, String trans_remarks, String trans_date, double trans_amount) {
        this.trans_id = trans_id;
        this.trans_remarks = trans_remarks;
        this.trans_date = trans_date;
        this.trans_amount = trans_amount;
    }
    @Override
    public String toString() {
        return "Transactions{" +
                "trans_id=" + trans_id +
                ", trans_remarks='" + trans_remarks + '\'' +
                ", trans_date='" + trans_date + '\'' +
                ", trans_amount=" + trans_amount +
                '}';
    }
}
