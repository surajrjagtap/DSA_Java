package maths;

public class Gcd {
	public static void main(String[]args) {
		
		int n1=12,n2=15; 
		int gcd = 1;

	        
	        for (int i = 1; i <= Math.min(n1, n2); i++) {
	           
	            if (n1 % i == 0 && n2 % i == 0) {
	              
	                gcd = i;
	            }
	        }

	      
	        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
	    }

	}


