package table;

import java.util.Scanner;

public class exo5 {

	public static void main(String[] args) {

		Scanner clavier = new Scanner(System.in);
		System.out.println("donner la taille du tableau");
		
		int pos =0;
		int neg = 0;
		
		int taille[] = new int[clavier.nextInt()];
		
		for(int i = 0; i< taille.length; i++) {
			System.out.println("entree la " + (i+1)+ " : valeur");
			
			taille[i]=clavier.nextInt();
			
			if(taille[i] > 0) {
				
				pos++;
			}
			
			if(taille[i] < 0) {
				
				neg++;
			}
			
			
			
			
		}
	

		System.out.println("le nombre des positif est :" + pos);
		System.out.println("le nombre desnegatif est :" + neg);
		
		

	}

}
