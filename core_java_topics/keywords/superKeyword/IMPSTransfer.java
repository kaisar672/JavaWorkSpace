package core_java_topics.keywords.superKeyword;

public class IMPSTransfer extends Pay{
    long imps_id=987456321;
    String imps_description="Made imps transfer to another account";
    String date_of_transfer="12-02-2025";
    double transfer_amount=50000.0d;

    public IMPSTransfer() {
        System.out.println("This is child class IMPS Transfer Constructor......");
    }
    public void displayIMPSInfo(){
        System.out.println("===============IMPS Transfer====================");
        System.out.println("IMPS id : "+imps_id);
        System.out.println("IMPS description = "+imps_description);
        System.out.println("Transfer Date = "+date_of_transfer);
        System.out.println("Transfer Amount = "+transfer_amount);

        System.out.println("============Pay class Instance Variables===========");
        System.out.println("Payment id "+payment_id);
        System.out.println("Remarks : "+super.remarks);
        System.out.println("Mode of Payment :"+super.mode_of_payment);
        System.out.println("Bill Amount = "+super.bill_amount);
        System.out.println("Pin Number = "+super.pin_num);

        //calling parent class method using super keyword
        super.method_pay();
        super.m();

    }

    public static void main(String[] args) {
        IMPSTransfer transfer=new IMPSTransfer();
        transfer.displayIMPSInfo();
    }
}

