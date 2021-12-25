package table;

import java.util.Scanner;

public class exo11 {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		
		
		int tab[] = {3,4,5,6,7 };
		
		int some=0;
		
		for(int i = 0; i<tab.length; i++) {
  
			
			
			some+=tab[i];
			
			
		}
		
		System.out.println(some);

	}

}
