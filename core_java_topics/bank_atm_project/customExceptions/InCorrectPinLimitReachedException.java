package core_java_topics.bank_atm_project.customExceptions;

public class InCorrectPinLimitReachedException extends Exception{

	public InCorrectPinLimitReachedException(String errorMsg) {
		super(errorMsg);
	}
}
