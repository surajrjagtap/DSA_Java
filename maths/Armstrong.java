package maths;

public class Armstrong {
	
	public static void main(String[]args) {
		int num=548834;
		int n=num;
		int no,sum=0;
		int len=String.valueOf(n).length();
		while(n>0) {
			
			no = n%10;
			sum +=Math.pow(no, len);
			 n = n / 10;
		}
		
		if(sum==num) {
			System.out.print("Armstrong");
		}else {
			System.out.print(sum+" "+num+"Not Armstrong");
		}
	}

}
