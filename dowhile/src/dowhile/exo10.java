package dowhile;

import java.util.Scanner;

public class exo10 {

	public static void main(String[] args) {
	Scanner clavier = new Scanner(System.in);
	
	
	System.out.println("donner nbr");
	
	int nbr = clavier.nextInt();
	int first=0;
	int i = 0;

	int compter=nbr % 10;
	
	
	int last=-1;
	
	 while(nbr >= 10) {

         nbr/=10;
		 

	   }
   
	do{
		 nbr--;
		 i++;
		 
	 } while(nbr >=1) ;
	do  {
		   last++;
		  
	   } while(last < compter) ;
	
     System.out.println(i +" first " +  last +" last");
     }

}
