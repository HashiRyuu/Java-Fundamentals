public class TallyCounterDemo {
	public static void main(String[] args) {
		//instantiate two TallyCounter objects
		TallyCounter concert = new TallyCounter();
		TallyCounter bus = new TallyCounter();
		
		//invoking methods for TallyCounter class
		//concert.color = "yellow";
		//bus.color = "Blue";
		concert.setColor("Blue");
		bus.setColor("Yellow");
		concert.displayColor();
		bus.displayColor();
		concert.displayCounter();
		for (int i = 0; i < 5; i++) {
            concert.increaseCounter();
        }
		concert.displayCounter();
		
		
		
	}

}
