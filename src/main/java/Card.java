public class Card{
	private Shade shade;
	private Value value;
	public Card(Shade shade, Value value){
		this.shade = shade;
		this.value = value;
	}

	public Shade getShade(){
		return this.shade;
	}
	public Value getValue(){
		return this.value;
	}

	public String toString(){
		return (this.value + " of " + this.shade);
	}
}