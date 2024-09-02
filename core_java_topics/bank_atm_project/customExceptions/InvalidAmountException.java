package core_java_topics.bank_atm_project.customExceptions;

public class InvalidAmountException extends Exception {

	public InvalidAmountException(String errorMsg) {
		super(errorMsg);
	}
}
