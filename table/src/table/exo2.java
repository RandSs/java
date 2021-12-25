package table;

import java.util.Scanner;

public class exo2 {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("merci de remplir la table tab");
		
		int tab[]= new int[7];
	
		for( int i=0 ; i<tab.length; i++) {
		
			
			tab[i] = clavier.nextInt();
              tab[i]*=0;
			System.out.println(" element " + (i+1) + " : "+ tab[i]);

		}
		
	}

}
