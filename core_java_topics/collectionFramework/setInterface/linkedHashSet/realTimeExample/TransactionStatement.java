package core_java_topics.collectionFramework.setInterface.linkedHashSet.realTimeExample;

public class TransactionStatement{
    long trans_id;
    String trans_date;
    String trans_type;
    double trans_amount;
    public TransactionStatement(long trans_id, String trans_date, String trans_type, double trans_amount) {
        this.trans_id = trans_id;
        this.trans_date = trans_date;
        this.trans_type = trans_type;
        this.trans_amount = trans_amount;
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
        return "TransactionStatement{" +
                "trans_id=" + trans_id +
                ", trans_date=" + trans_date +
                ", trans_type='" + trans_type + '\'' +
                ", trans_amount=" + trans_amount +
                '}';
    }
}

