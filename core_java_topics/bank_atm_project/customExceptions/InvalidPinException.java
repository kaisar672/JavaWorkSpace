package core_java_topics.bank_atm_project.customExceptions;

public class InvalidPinException extends Exception{

	public InvalidPinException(String errorMsg) {
		super(errorMsg);
	}
}
