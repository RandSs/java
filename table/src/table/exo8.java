package table;

import java.util.Scanner;

public class exo8 {

	public static void main(String[] args) {
	Scanner clavier = new Scanner(System.in);
	System.out.println("entree la taille de la table");
	
	int taille = clavier.nextInt();
	
	int tab[] = new int[taille];
	
	int grand = tab[0];
	int deu = tab[0];
	
	for(int i=0; i< tab.length; i++) {
		System.out.println("entree la valeur n° " + (i+1) );
		
		 tab[i]= clavier.nextInt();
		 
		 if(grand < tab[i]) {
			 grand = tab[i];
			 
		 }
		 
	for(int j =0; j< tab.length; j++) {
		
		if(deu < tab[i]) {
			
			deu = tab[j];
		}
	}
		
	}
	System.out.println(grand  +"   le deu est : "+  deu);
	}

}
