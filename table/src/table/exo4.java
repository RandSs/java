package table;

import java.util.Scanner;

public class exo4 {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("merci de remplir la table tab");
		
		int tab[]= new int[5];
		int some =0;
	
		for( int i=0 ; i<tab.length; i++) {
		
			
			tab[i] = clavier.nextInt();
           some += tab[i];
           
		}
		
		System.out.println("la some est : " +some);
		
	}

}
