package exosJourAccidentPack;

/* Write a Java method to compute the sum of the first 20 impairs number.

 Write a Java method to display the first 50 pair numbers.*/


public class Exo4et5 {
	
	
	public static int sumImpair() {
		
		int sum = 0;
		
		for (int x = 1; x < 40; x++ ) {
			
			if ( x % 2 != 0)  {
				
				sum = sum + x;	
			
			}
			
		}
		return sum;
	}
	
	
	
	
	
	public static void displayPair() {
		
		for (int x = 1; x < 102 ; x++) {
			
			if(x % 2 == 0) {
				
				System.out.println(x);
				
			} 
			
		}
		
		
	}

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		displayPair();
		System.out.println(sumImpair());
	}

}
