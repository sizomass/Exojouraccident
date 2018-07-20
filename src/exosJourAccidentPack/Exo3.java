package exosJourAccidentPack;

/*Write a Java method to compute the sum of the digits in an integer.*/

public class Exo3 {
	
	public static int sumDigit(int nb) {
		
		int nmbDgt = Integer.toString(nb).length();
		int lastNumb = nb % 10;
		int sum = 0;
		int divi = 1;
		int operat = 0;
		
		for (int i = 0; i < nmbDgt; i++ ) {
			
			
			divi = divi * 10;
			 		
			operat = (nb / divi) % 10;
			 
			sum += operat;
			 		
		}
		
		
		sum = sum + lastNumb;
		return sum;
		
		
	}

	public static void main(String args[]) {
		
		System.out.println(sumDigit(121212));
		
	}
	
	
}


