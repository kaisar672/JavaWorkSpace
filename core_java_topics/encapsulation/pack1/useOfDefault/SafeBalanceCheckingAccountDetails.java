package core_java_topics.encapsulation.pack1.useOfDefault;

import core_java_topics.encapsulation.pack1.useOfDefault.SafeBalanceCheckingAccount;

public class SafeBalanceCheckingAccountDetails {
    public static void main(String[] args) {
        SafeBalanceCheckingAccount account =new SafeBalanceCheckingAccount();
        account.displayAccInfo();
        account.cust_name="Mohammad Kamran";
        account.acc_number=258741369;
        account.branch_name="Nowhatta";
        account.city_name="Srinagar";
        account.state_name="J&k";
        account.available_balnce=800000.0d;

        account.displayAccInfo();
    }
}
