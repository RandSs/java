package table;

import java.util.Scanner;

public class exo6 {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("donner la taille du tableau");
		
		int tabt= clavier.nextInt();
		
		int taille[] = new int[tabt];
		
		System.out.println("entree la " + 1 + " : valeur");
		
		taille[0] = clavier.nextInt();
		int max =taille[0];
		int min= taille[0];
	
		
		for(int i=1; i< taille.length; i++) {
	System.out.println("entree la " + (i+1)+ " : valeur");
			
			taille[i]=clavier.nextInt();
		
		
			
			if(max < taille[i]) {
				
				max =taille[i];
			}
			
			if(min > taille[i]) {
				
				min = taille[i];
			}
		}
		
		System.out.println("le min est : " + min );
		
		System.out.println("le max est : " + max );

	}

}
