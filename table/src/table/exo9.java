package table;

import java.util.Scanner;

public class exo9 {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		int tab1[]=new int[5]; 
		int tab2[]=new int[5]; 
		
		
		System.out.println("merci de remplir le premier tableau !");
	
		for(int i =0; i< tab1.length; i++) {
			
			System.out.println("merci de rentrer " + i + " valeur") ;
			
			
			tab1[i]= clavier.nextInt();
			System.out.println(tab1[i]);
		}
	
		
	
		
	for(int i =0; i< tab2.length; i++) {
			
	
			
			tab2[i]= tab1[i];
			System.out.println(tab2[i]);
			
		}
	
	
	
	
	}

}
