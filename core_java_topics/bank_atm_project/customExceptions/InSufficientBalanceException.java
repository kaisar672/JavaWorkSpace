package core_java_topics.bank_atm_project.customExceptions;

public class InSufficientBalanceException extends Exception{

	public InSufficientBalanceException(String errorMsg) {
		super(errorMsg);
	}
}
