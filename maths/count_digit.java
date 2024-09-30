package maths;

public class count_digit {

	public static void main(String[]args) {
		
		int n =4512451;
		
		int count=0;
		
		while(n>0) {
			
			count = count+1;
			
			n=n/10;
			
		}
		System.out.print(count);
	}
}
