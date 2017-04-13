package pck;

public class Card {
	
	private int attackValue;
	private int tradeValue;
	
	public Card(int attackValue, int tradeValue){
		this.attackValue = attackValue;
		this.tradeValue = tradeValue;
	}
	
	public void setAttackValue(int attackValue){ this.attackValue = attackValue; }
	public int getAttackValue(){ return attackValue; }
	
	public void setTradeValue(int tradeValue){ this.tradeValue = tradeValue; }
	public int getTradeValue(){ return tradeValue; }
	
	public String toString(){
		String str = "";
		str += "AV: " + attackValue + " ";
		str += "TV: " + tradeValue + " ";
		return str;
	}
}
