package Recursion;

public class Recursion4 {
	 static int sum=0;
	 static void func( int n){
	        
        
         if(n<1) return;
         	sum=sum+n;
         System.out.println(n);
       
         func(n-1);

	 }
	 public static void main(String[] args) {

   
		 int n = 5;
    	func(n);
    	 System.out.println(sum);
	 }

}
