package core_java_topics.abstraction.interfaces.hundredPercentAbstraction.example2;
public interface IBeneficiaryService extends IAccountService{
    void getAccountDetails(int acc_num);

    public void addBeneficiery();
    public void deleteBeneficiery();
    public void updateBeneficiery();
}
