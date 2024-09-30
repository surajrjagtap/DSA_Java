package maths;

public class reverse_digit {
	
	public static void main(String[]args) {
		
		int n =123456789;
		int no=0;
		int count=0;
		
		while(n>0) {
			no=n%10;
			count = (count*10)+no;
			
			n=n/10;
			
		}
		System.out.print(count);
	}

}
