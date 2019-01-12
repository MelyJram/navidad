package ejericio;

import java.util.Scanner;

public class navidad2 {
	
	public static void DibujameLaNavidad(int n) {
		
	
		String c = "*";
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Inserta un numero: ");
		n= sc.nextInt();
		
		for(int i=0; i<n; i++);{
			System.out.println();
		}
		for (int j=0; j<n-n; j++);{
			System.out.println(" ");
			}
		for (int k = 0; k < (2 * n + 1); k++) {

			
			System.out.print(c); 
			System.out.println(); 
			} 
			System.out.println("   | | |   ");
			}	
	
}


