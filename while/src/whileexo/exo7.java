package whileexo;

import java.util.Scanner;

public class exo7 {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("Merci de donner nb");
		
		int nbr = clavier.nextInt();
		
		int un=0;
		   while( un != nbr  )
		   {
			   un++;
			   System.out.println(un);
			   
		   }
	}

}
