package table;

import java.util.Scanner;

public class exo14 {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
int tab[] = new int[5];




       for(int i = 0; i<tab.length; i++) {
	   System.out.println("merci de rentrer " + (i+1) + " valeur") ;
				tab[i]= clavier.nextInt();
			}
       
       for(int i =tab.length; i > 0 ; i--) {
    	   
    	 
    	 
    	   System.out.print(tab[i]);
       
       }
			

	}

}
