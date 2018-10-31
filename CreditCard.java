/**
 * Credit Card
 * @author Krisi Hristova
 *
 */
public class CreditCard
{

	//fields
	private final int CARD_NUM;
	private double limit;
	private double balance;
	private double interestRate;
	private String holderName;
	
	
	//constructors
	
	public CreditCard(int cardNum, double lim, double intRate, String name)
	{
		balance = 0;
		CARD_NUM = cardNum;
		limit = lim;
		interestRate = intRate;
		holderName = name;
		
	}
	
	//methods
	public void charge(double price)
	{
		double newBalance = price + balance;
		
		if(newBalance < limit)
			balance += price;
	}
	
	public void credit(double cred)
	{
		balance -= cred;
	}
	
	public void chargeInterest()
	{
		double interest = interestRate * balance;
		balance += interest;
	}
	
	//accessors to each field
	public int getCardNumber()
	{
	 	return CARD_NUM;
	}
	public double getLimit() 
	{
		return limit;
	}
	public double getBalance()
	{
		return balance;
	}
	public double getInterestRate()
	{
		return interestRate;
	}
}
