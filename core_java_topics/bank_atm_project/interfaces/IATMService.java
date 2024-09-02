package core_java_topics.bank_atm_project.interfaces;

import core_java_topics.bank_atm_project.customExceptions.InSufficientBalanceException;
import core_java_topics.bank_atm_project.customExceptions.InSufficientMachineBalanceException;
import core_java_topics.bank_atm_project.customExceptions.InvalidAmountException;
import core_java_topics.bank_atm_project.customExceptions.NotAOperatorException;
public interface IATMService {

	//To get the user type. Whether the user is Operator or Normal User
	public abstract String getUserType() throws NotAOperatorException;
	//To withdraw the Amount
	//1) Will throw InvalidAmountException if the amount is not valid denomination
	//2) Will throw InsufficientBalanceException, If the customer has insufficient amount in his/her account
	//3) Will throw InsufficientMachineBalanceException. If the Machine has insufficient cash
	public abstract double withdrawAmount(double wthAmount) throws InvalidAmountException,InSufficientBalanceException, InSufficientMachineBalanceException;
	//To Deposit Amount
	public abstract void depositAmount(double dptAmount) throws InvalidAmountException;
	//To check account balance
	public abstract double checkAccountBalance();
	//To change PIN Number
	public abstract void changePinNumber(int pinNumber);
	//To get the PIN number
	public abstract int getPinNumber();
	//To get the user name
	public abstract String getUserName();
	//to decrease the number of chances when entered wrong PIN Number
	public abstract void decreaseChances();
	//to get the chances of PIN number
	public abstract int getChances();
	//to reset the pin number chances by the bank operator
	public abstract void resetPinChances();
	//to get the mini statement of an account
	public abstract void generateMiniStatement();
	
	
	
}

