package core_java_topics.copyValues.usingAssignmentOperator;

public class FixedTermCDAccountDetails {
    public static void main(String[] args) {
        FixedTermCDAccount account1=new FixedTermCDAccount(2587413,"Hyder",100000,"Khanyar","Srinagar",7.5,500000);
        FixedTermCDAccount account2=new FixedTermCDAccount();
         //copy the values account 1 into account
        account2.fda_acc_number=account1.fda_acc_number;
        account2.fda_cust_name=account1.fda_cust_name;
        account2.fda_min_amount=account1.fda_min_amount;
        account2.fda_branch_name=account1.fda_branch_name;
        account2.fda_city=account1.fda_city;
        account2.fda_roi=account1.fda_roi;
        account2.fda_amount=account1.fda_amount;

        account1.displayInfo();
        account2.displayInfo();
    }
}
