package exosJourAccidentPack;


/* Write a Java method to check whether a string is a valid password. Go to the editor
Password rules:
A password must have at least ten characters. */

public class Exo7 {
	
	public static void checkForTen(String passw) {
		
		int passlgth = passw.length();
		
		if (passlgth < 11 ) {
			
			System.out.println("Password is too short :( type an other one plz...");
			
		} else 
			System.out.println(passw + " is a valid password !");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checkForTen("monpassestlong");
		checkForTen("passcourt");

	}

}
