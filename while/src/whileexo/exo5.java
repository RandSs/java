package whileexo;

import java.util.Scanner;

public class exo5 {

	public static void main(String[] args) {
		 Scanner clavier = new Scanner(System.in); 
			
			System.out.println("Donner nbr");
			
			int nbr = clavier.nextInt();
			int max = nbr;
			int min = nbr;
			int total =nbr;
			
			while(nbr >0) {
			
				System.out.println("Donner nbr");
				nbr = clavier.nextInt();
				if(nbr > 0 ) {
				
				total +=nbr;
				
				if( nbr > max) {
					max = nbr;
				
				}
				
				if(nbr < min) {
					
					min = nbr;
					
				}
				
				}
			}
			
			
			System.out.println(max + " "+ min + " " + total );
		
			System.out.println("bye bey");
		
		
	}

}
