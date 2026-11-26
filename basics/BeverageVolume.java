public class BeverageVolume {

	public static void main(String[] args) {
		 int cansPerPack = 6;
	     final double CAN_VOLUME = 0.355; 
	     double totalVolume = cansPerPack * CAN_VOLUME;

	     System.out.println("A six-pack of 12-ounce cans contains " + totalVolume + " liters.");
	    
	     final double BOTTLE_VOLUME = 2; 

	     totalVolume = totalVolume + BOTTLE_VOLUME;

	     System.out.print("A six-pack and a two-liter bottle contain " + totalVolume + " liters.");
	    
	   
	}

}
