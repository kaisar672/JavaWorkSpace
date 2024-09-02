package core_java_topics.bank_atm_project.customExceptions;

public class InSufficientMachineBalanceException extends Exception {

	public InSufficientMachineBalanceException(String errorMsg) {
		super(errorMsg);
	}
}
