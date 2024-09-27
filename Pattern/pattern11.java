package Pattern;

public class pattern11 {
	
	public static void main(String[]args){
		
		int n=5;
		int no=1;
		for(int i=1; i<=n;i++) {
			int no2=i;
						
			for(int j=1;j<=i;j++) {
				
				if(no2%2==0) {
					no=0;
									
				}else {
					no=1;
							
				}
				System.out.print(no);
				no2--;
				
			}
			System.out.println();
		}
		
	}

}
