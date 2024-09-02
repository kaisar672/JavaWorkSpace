package core_java_topics.bank_atm_project.customExceptions;

public class InvalidCardException extends Exception {

	public InvalidCardException(String errorMsg) {
		super(errorMsg);
	}
}
