package table;

import java.util.Scanner;

public class exo1 {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("merci de remplir la table tab");
		
		int tab[]= new int[5];
	
		for( int i=0 ; i<tab.length; i++) {
		
			
			tab[i] = clavier.nextInt();

			System.out.println(" element " + (i+1) + " : "+ tab[i]);

		}
		
	}

}
