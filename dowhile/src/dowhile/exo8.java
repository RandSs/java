package dowhile;

import java.util.Scanner;

public class exo8 {

	public static void main(String[] args) {

		
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("Donner nbr");
		
		int nbr = clavier.nextInt();
		int taille = 1;
		
		
		if(nbr < 0) {
			
			nbr*=-1;
		}
		
		do{
			
			nbr/=10;
			
			taille++;
		}while(nbr>=10) ;
		System.out.println(taille);
	}

}
