package war;

public class Card {
	
	private int value;
	private String name;
	
	//constructor
	public Card(int value, String name) {
		this.value = value;
		this.name = name;
		
	}
	
	public Card() {
		// TODO Auto-generated constructor stub
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	// should this be static too? 
	public void describe() {
			System.out.println("Card: " + name + ",  Value: " + value);
	}
}
