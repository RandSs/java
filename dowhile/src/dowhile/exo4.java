package dowhile;

import java.util.Scanner;

public class exo4 {

	public static void main(String[] args) {
		
		   Scanner clavier = new Scanner(System.in); 
			
			System.out.println("Donner prix");
			System.out.println("Donner qte");
			System.out.println("Donner billet");
			
			int prix = clavier.nextInt();
			int qte =clavier.nextInt();
			int billet=clavier.nextInt();
			
		int some = prix * qte;
		int change = billet - some;
		int dix = 0;
		int cinque = 0;
	
		
	do	{
			System.out.println("Donner prix");
			System.out.println("Donner qte");
			System.out.println("Donner billet");
		     prix = clavier.nextInt();
		      qte =clavier.nextInt();
			 billet=clavier.nextInt();
		
		
			while(change >=5) {
				if(change >=10) {
					change -=10;
					dix++;
					
				}else {
					change -=5;
					cinque++;
				}
				
			}
			if(dix>0) {
				System.out.println(dix + " x 10 ");
				
			}
			
			if(cinque > 0) {
				System.out.println(cinque + " x 5 ");
				
			}
			
			if(change> 0) {
				
				System.out.println(change + " x 1 ");
			}
			
			
	}	while(prix !=0 ) ;
			
		
			

	}

}
