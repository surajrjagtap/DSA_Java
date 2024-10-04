//package Hashing;
//
//public class Hashing {
//	
//	public static void main(String []args) {
//	
//
//        int n= 5;
//        int count = 0;
//        int[] myNum = {1,3,2,1,3};
//        int[] myQuery = {1,4,2,3,12};
//        for(int i=0;i<myQuery.length;i++) {
//        	for(int j=0;j<myNum.length;j++) {
//        		if(myNum[j] == myQuery[i]) {
//            		count =count+1;
//            	}
//        	}
//        	 System.out.println(count);
//        	 count =0;
//        }
//       
//       
//	}
//
//}


package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Hashing {

    public static void main(String[] args) {

        // Initialize the array of numbers
        int[] myNum = {1, 3, 2, 1, 3};
        
        // Initialize the array of queries
        int[] myQuery = {1, 4, 2, 3, 12};

        // Create a HashMap to store the frequency of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Populate the frequencyMap with counts from myNum
        for (int num : myNum) {
            // If the number is already in the map, increment its count
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                // If the number is not in the map, add it with a count of 1
                frequencyMap.put(num, 1);
            }
            
            // Alternatively, you can use the following one-liner:
            // frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Process each query and print the result
        for (int query : myQuery) {
            // Retrieve the frequency from the map; default to 0 if not found
            int count = frequencyMap.getOrDefault(query, 0);
            System.out.println(count);
        }
    }
}
