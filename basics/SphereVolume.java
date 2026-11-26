public class SphereVolume {

	public static void main(String[] args) {
		double radius = Math.pow(5, 3);
		double Volume = (4.0 /3.0) * Math.PI *radius;
		double roundedVolume = Math.round(Volume * 1000.0) / 1000.0; 
        System.out.println(roundedVolume);
		
		
	}

}
