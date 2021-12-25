package dowhile;

import java.util.Scanner;

public class exo9 {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("aimer vous les frittes ?");
		
	    char rep = clavier.next().charAt(0);
	    
	  do{
	    	System.out.println("repender par o ou n ?");
	    	
	    	rep = clavier.next().charAt(0);
	    	
	    	
	    	
	    }  while(rep != 'o' && rep != 'n') ;
	    System.out.println("votre reponse est "+rep);

	}

}
