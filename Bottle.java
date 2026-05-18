public class Bottle{
	private double capacity;
	private double liquidPresent;
	private double quater;
		
	public Bottle(double capacity){
		this.capacity = capacity;
		liquidPresent = capacity;
		quater = 0.25* capacity;
	}
		
	public double updateAmount(double ml){
		liquidPresent -= ml;
		if(liquidPresent < quater){
			liquidPresent = capacity;
			return capacity;
		}
		else{
			return liquidPresent;
		}
	}
	
	
}