package dowhile;


import java.util.Scanner;

public class exo3 {

	public static void main(String[] args) {
		
		
   Scanner clavier = new Scanner(System.in); 
		
		System.out.println("Donner 3 nums");
		
		int nbr = clavier.nextInt();
		int compteur =0;
		int grand=nbr;
	
		
	do	{
			System.out.println("Donner num");
	     	 nbr = clavier.nextInt();
			   
			if(grand < nbr) {
				
				grand = nbr;
				
				compteur ++;
				
			}
	             		
		
		}while(nbr !=0 ) ;
	
		System.out.println(grand + "  " + compteur);
	}

}
