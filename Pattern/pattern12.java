package Pattern;

public class pattern12 {
	public static void main(String[]args) {
		
		int n=5;
			int no=n*2;
		for(int i=1; i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(j);
				
				
			}
			for(int k=1;k<no-i;k++) {
				System.out.print(" ");
			}
			
			
			for(int j=i;j>=1;j--) {
				System.out.print(j);
				
				
			
			}
//			System.out.print(i);
			no--;
			System.out.println();
		}
	}

}
