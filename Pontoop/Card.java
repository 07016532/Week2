package Pontoop;

public class Card {
	
	int cardNo;
	
	public Card() {
		
		this.createCard();
		
	}
	
	public void createCard() {
		
		cardNo = (int)(Math.random()*10)+1;
	}

}
