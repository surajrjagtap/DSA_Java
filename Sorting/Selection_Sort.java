package Sorting;

public class Selection_Sort {
	
	public static void main(String [] args) {
		
		int n= 6;
		int arr[]= {13,46,24,52,20,9};
		selectSort(arr,n);
	}
	
	public static void selectSort(int arr[],int n) {
		
		for(int i=0; i<n-1; i++) {
			int min=i;
			for(int j=i+1; j<n; j++) {
				
				if(arr[i]>arr[j]) {
//					swap(arr, i, j);
//					int a= arr[i];
//					arr[i]=arr[j];
//					arr[j]=a;
					min = j;
				}
				
			}
			 swap(arr, i, min);
			 System.out.println("step:"+(i+1));
		        for (int k = 0; k < n; k++) {
		            System.out.print(arr[k] + " ");
		        }
		        System.out.println();
		}
		
		 System.out.println("After selection sort:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	}
	
	 public static void swap(int arr[], int i, int j) {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }

}
