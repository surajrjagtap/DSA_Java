package Sorting;

public class InsertionSort {
	
	 public static void main(String args[]) {
	        int arr[] = {13, 46, 24, 52, 20, 9};
	        int n = arr.length;
	        
	        System.out.println("Before Using insertion Sort: ");
	        for (int i = 0; i < n; i++) {
	        	
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	        
	        insertion_sort(arr, n);
	    }

	 static void insertion_sort(int[] arr, int n) {
		 
	        for (int i = 0; i <= n - 1; i++) {
	            
	        	int j = i;
	            while (j > 0 && arr[j - 1] > arr[j]) {
	            	 System.out.println("While loop I value: "+ i);
	            	System.out.println("Every while loop swap between : "+ arr[j - 1] +"  "+ arr[j]);
	                int temp = arr[j - 1];
	                arr[j - 1] = arr[j];
	                arr[j] = temp;
	                j--;
	             
	                for (int k = 0; k < n; k++) {
			            System.out.print(arr[k] + " ");
			        }
			        System.out.println();
	            }
	            System.out.println("Every insertion sort: "+ i);
		        for (int k = 0; k < n; k++) {
		            System.out.print(arr[k] + " ");
		        }
		        System.out.println();
	        }

	        System.out.println("After insertion sort: ");
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }
	 
	   

}
