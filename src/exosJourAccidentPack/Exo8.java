package exosJourAccidentPack;



public class Exo8 {
	
	/*Write a java method in order to find the middle character of a String*/
	public static char middle (String mot) {
		
		int x = mot.length();
		int indx = x / 2;
		
		char middleChar = mot.charAt(indx);
		return middleChar;
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println(middle("MimiJiji"));
	}

}
