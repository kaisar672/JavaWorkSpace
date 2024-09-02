package core_java_topics.innerClasses.nonstaticInnerClass.anonymousClass;

public class TestAnonymousClass {
    public static void main(String[] args) {
        ITransferService service =new ITransferService() {
            @Override
            public void thirdPartyPayment() {
                System.out.println("This is third Party Payment");
            }
            @Override
            public void impsTransfer() {
                System.out.println("This is ImPs Transfer ");
            }
        };
        service.thirdPartyPayment();
        service.impsTransfer();
    }
}
