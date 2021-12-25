package table;

import java.util.Scanner;

public class exo13 {

	public static void main(String[] args) {
Scanner clavier = new Scanner(System.in);

int tab[] = new int[5];
int compteur = 0;
int uni;



for(int i = 0; i<tab.length; i++) {
	   System.out.println("merci de rentrer " + (i+1) + " valeur") ;
				
				
				tab[i]= clavier.nextInt();
			}
			
			
			for(int i=0; i< tab.length; i++) {
				
				for(int j=0; j<tab.length; j++) {
					
					if(tab[j] == tab[i]) {
						
						compteur++;
						
						
						
					}
					
			
				}
				
				if(compteur == 1) {
					
					System.out.println(tab[i] );
					
				}
		
			compteur=0;
				
			}
	}

}
