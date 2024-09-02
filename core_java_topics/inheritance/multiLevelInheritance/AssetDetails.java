package core_java_topics.inheritance.multiLevelInheritance;

public class AssetDetails {
    public static void main(String[] args) {
        CheckingAccount  checkingAccount=new CheckingAccount();
        SavingAccount savingAccount=new SavingAccount();

        checkingAccount.setAsset_id(258741);
        checkingAccount.setAsset_type("Account");
        checkingAccount.setAcc_number(39517538);
        checkingAccount.setAcc_holder_name("Abrar");
        checkingAccount.setOverDraftLimit(500000);

        savingAccount.setAsset_id(75395141);
        savingAccount.setAsset_type("Account");
        savingAccount.setAcc_number(759517538);
        savingAccount.setAcc_holder_name("Waseem");
        savingAccount.setInterest_rate(5);

        checkingAccount.displayCheckingAccInfo();
        savingAccount.displaySavingAccInfo();

    }
}
