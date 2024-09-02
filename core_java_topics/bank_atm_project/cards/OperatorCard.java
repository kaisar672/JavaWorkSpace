package core_java_topics.bank_atm_project.cards;

import core_java_topics.bank_atm_project.customExceptions.InSufficientBalanceException;
import core_java_topics.bank_atm_project.customExceptions.InSufficientMachineBalanceException;
import core_java_topics.bank_atm_project.customExceptions.InvalidAmountException;
import core_java_topics.bank_atm_project.customExceptions.NotAOperatorException;
import core_java_topics.bank_atm_project.interfaces.IATMService;

public class OperatorCard implements IATMService{

	private int pinNumber;
	private long id;
	private String name;
	private final String type = "operator";//declared as final as this can't be changed
	
	public OperatorCard(long idn, int pin, String name) {
		id = idn;
		pinNumber = pin;
		this.name = name;
	}
	
	@Override
	public String getUserType() throws NotAOperatorException {
		return type;
	}

	@Override
	public double withdrawAmount(double wthAmt)
			throws InvalidAmountException, InSufficientBalanceException, InSufficientMachineBalanceException {
		return 0;
	}

	@Override
	public void depositAmount(double dptAmt) throws InvalidAmountException {
		
	}

	@Override
	public double checkAccountBalance() {
		return 0;
	}

	@Override
	public void changePinNumber(int pinNumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getPinNumber() {
		// TODO Auto-generated method stub
		return pinNumber;
	}

	@Override
	public void resetPinChances() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void generateMiniStatement() {
		
	}

	@Override
	public void decreaseChances() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getChances() {
		// TODO Auto-generated method stub
		return 0;
	}

}
