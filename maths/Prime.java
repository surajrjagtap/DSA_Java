package maths;

public class Prime {
	public static void main(String[]args) {
		
		int n=13;
		int count=0;
		for(int i=1;i<=n;i++) {
			
			if( n % i == 0) {
				count =count+1;
			}
		}
		
		if( count == 2) {
			System.out.print(n +" is Prime");
		}else {
			System.out.print(n +" is not Prime");
		}
	}

}
