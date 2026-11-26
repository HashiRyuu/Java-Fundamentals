public class DiceCombinations
{
	public static void main(String[] args) {
		
		//Header 
		System.out.println("Dice 1" + "\t|" + "Dice 2" + " |");
		System.out.println("--------" +"|" + "-------" +"|");
		
		//print random numbers using Math.random
		for (int i = 1; i <= 10; i++) {
		int d1 = (int) (Math.random() * 6) + 1;
        int d2 = (int) (Math.random() * 6) + 1;
        System.out.println(d1 + "\t| " + d2 + "\t|");
		}

		System.out.println("--------" +"|" + "-------" +"|");
    }
}
