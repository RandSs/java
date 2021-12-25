package table;

import java.util.Scanner;

public class exo15 {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		int tab1[]= {4,8,7,9,1};
		int tab2[]= {7,6,5,2,1};
		
		int some[]= new int[5];
		
		for(int i=0; i< some.length; i++) {
			some[i]=  tab1[i]+tab2[i];
			
			System.out.println(some[i]);
			
		}

	}

}
