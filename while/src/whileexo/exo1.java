package whileexo;

import java.util.Scanner;

public class exo1 {

	public static void main(String[] args) {
	
		Scanner clavier = new Scanner(System.in); 
		
		System.out.println("Donner nbr");
		
		int nbr = clavier.nextInt();
	
		
		while(nbr < 0 || nbr > 3) {
		
		System.out.println("Merci de rentre nbr entre 1 et 3");
		nbr = clavier.nextInt();
		
	}
	

}
}