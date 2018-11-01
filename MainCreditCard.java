/**
 * 
 * @author Krisi Hristova PD 6
 *Main Credit Card
 */
public class MainCreditCard 
{

	public static void main(String[] args) 
	{
		CreditCard[] cards = new CreditCard[5];
		

		//parameters(card number, limit, interest rate, name)
		cards[0] = new  CreditCard(210267, 500.00, 0.03, "Krisi");
		cards[1] = new  CreditCard(567890, 250.00, 0.11, "Lizzy");
		cards[2] = new  CreditCard(123456, 555.00, 0.23, "Katya");
		cards[3] = new  CreditCard(357913, 113.00, 0.05, "Brinda");
		cards[4] = new  CreditCard(223366, 670.00, 0.07, "Aspen");
		
		
		//choose a card number and charge it $300
		int targetNum =  123456;
		for(CreditCard card : cards)
		{
			int num = card.getCardNumber();
			if(num == targetNum)
				card.charge(300.00);	
		}
		
		//charge another card $600
		int anotherCard = 223366;
		for(CreditCard card : cards)
		{
			int num = card.getCardNumber();
			if(num == targetNum)
				card.charge(600.00);
		}
		
		//
		
	}

}
