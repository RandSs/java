package dowhile;

import java.util.Scanner;

public class exo6 {

	public static void main(String[] args) {
		 Scanner clavier = new Scanner(System.in); 
			
			System.out.println("Donner nbr");
			System.out.println("chercher nbr ");
			
			int nbr = clavier.nextInt();
			int chercher = clavier.nextInt();
			
		do	{
				
				if(chercher > nbr) {
					System.out.println("plus grand réessayer");
					 chercher = clavier.nextInt();
				}
				
				else if(chercher < nbr) {
					System.out.println("plus petit réessayer");
					 chercher = clavier.nextInt();
					
				}
			}while(chercher != nbr ) ;
			 if(chercher == nbr) {
					
					System.out.println("correct " + nbr +" le nbr " + chercher);
				}
				
			
			
			

	}

}
