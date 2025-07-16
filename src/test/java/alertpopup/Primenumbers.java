package alertpopup;

import java.util.Scanner;

public class Primenumbers {
	
	public static void main (String [] args) {
		
		int number;
		int flat = 0;
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		if (number == 0 || number == 1) {
			
			System.out.println("Number is not Prime");
			
			
		}
		
		else {
			
			int middlenumber = number / 2;
			for (int i = 2;i<=middlenumber;i++) {
				
				if(number % i==0) {
					
					System.out.println("Number is not prime");
					flat=1;
					break;
				}
					}
			
			if (flat==0) {
				
				System.out.println("Number is prime");
			}
		      }

		    }
	      }
