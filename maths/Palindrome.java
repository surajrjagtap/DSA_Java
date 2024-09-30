package maths;

public class Palindrome {
	
	public static void main(String[]args) {
		
		int n =121;
		int no=0;
		int count=0;
		int temp= n;
		while(n>0) {
			no=n%10;
			count = (count*10)+no;
			
			n=n/10;
			
		}
		if(temp == count) {
			System.out.print(count + " palindrome");
		}else {
			System.out.print(count +"  not palindrome");
		}
		
	}

}
