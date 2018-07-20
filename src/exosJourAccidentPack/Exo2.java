package exosJourAccidentPack;

public class Exo2 {
	
	
	/*énoncé : Write a Java method to compute the average of three impairs numbers. */
	
	
	public static double average (double a, double b, double c) {
		
		double aver = 0;

/*vérifion si tous les chiffres sont bien impairs*/
		
		if ( (a % 2) != 0  && (b % 2) != 0  && (c % 2) != 0) {
			
			
			aver = (a + b + c) / 3;
			
			
		} else {
			
			System.out.println("les nombres ne sont pas tous impairs");
				
		}
		
		return aver;
	}
	
	
	public static void main(String args[]) {
		
		System.out.println(average(3, 5, 7));
		
	}

}
