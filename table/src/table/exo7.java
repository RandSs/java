package table;

import java.util.Scanner;

public class exo7 {

	public static void main(String[] args) {
Scanner  clavier = new Scanner(System.in); 

System.out.println("donner la taille du tableau");

		int taille= clavier.nextInt();
		
		int tab[] = new int[taille];
		
		
	
		
		int paire = 0; 
		
		int impaire= 0;
		   for(int i=0; i< tab.length; i++) {
			   
			   System.out.println("entree la " + (i+1)+ " : valeur");
				
				tab[i]=clavier.nextInt();
				
				if(tab[i] % 2 == 0) {
					paire++;
					
				}
				if(tab[i] % 2 != 0) {
					impaire++;
					
				}
				
				 System.out.println(tab[i]);
				 
				 
		   }
		   
		   System.out.println("nbr paire est : "+paire );
		
		   System.out.println("nbr impaire est : "+impaire );		  
	}

}
