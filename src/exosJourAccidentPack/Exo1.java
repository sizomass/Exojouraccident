package exosJourAccidentPack;

import java.util.Scanner;

public class Exo1 {
	
	
/* .Write a Java method to find the smallest number among 15 numbers.*/
		
		
	
	

	public static void main (String args[]) {
		
		int [] tab = new int [15];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 15; i++) {
			System.out.println("Tapez un nombre s'il vous plait");
			 tab[i] = sc.nextInt();
		}
		int smallest = tab[0];
		for (int x = 0; x < tab.length; x++) {
		
			if (tab[x] < smallest) {
				smallest = tab[x];
			}
		}
		System.out.println(smallest);
	}
	
}
