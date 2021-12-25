package dowhile;


import java.util.Scanner;

public class exo2 {

	public static void main(String[] args) {
        

	Scanner clavier = new Scanner(System.in); 
		
		System.out.println("Donner nbr entre 10 et 20");
		
		int nbr = clavier.nextInt();
	
		
		do {
			
			if(nbr < 10 ) {
		
		System.out.println("plus petit");
		System.out.println("Donner nbr entre 10 et 20");
		nbr = clavier.nextInt();
		
			}
			else if (nbr > 20) {
				System.out.println("plus Grand");
				System.out.println("Donner nbr entre 10 et 20");
				nbr = clavier.nextInt();
				
				
			}
				
				
	} while(nbr < 10  || nbr > 20) ;
	
	}

}
