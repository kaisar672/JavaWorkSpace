package core_java_topics.abstraction.interfaces.multipleInheritance;
public class TransferDetails implements IFundTransferService,IVisaCardPay{
    @Override
    public void transferWithBank(){
        System.out.println("===============Fund Transfer Within Bank===============");
        System.out.println("Account Number : 5028741369");
        System.out.println("Account Holder Name : Mohammad Zeeshan");
        System.out.println("Transfer Date : 16-07-2024");
        System.out.println("Transfer Amount : 10000.0d");
    }
    @Override
    public void cardPay() {
        System.out.println("===========This is card Pay Method=============");
        System.out.println("Sender Name : Mohammad Quamruddin");
        System.out.println("Receiver Name : Saba Naaz");
        System.out.println("Amount: 50000.0d");
    }
    @Override
    public void impsTransfer(){
        System.out.println("============IMps Transfer==============");
        System.out.println("Transfer id = 57369514789");
        System.out.println("Remark : Transferred to Iran");
        System.out.println("Amount : 1000000.0");
    }
    @Override
    public void neftTransfer(){
        System.out.println("================neft Tranafer===============");
        System.out.println("This is neft Transfer");
    }
}
