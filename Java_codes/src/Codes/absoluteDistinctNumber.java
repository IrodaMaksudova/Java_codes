package Codes;

import java.util.HashSet;
import java.util.Set;

public class absoluteDistinctNumber {
	public static void main(String[] args) {
        //Write a java program to count the absolute distinct value in array
        int[] arr= {-2,-1,0,1,1,2,4};//-2 and 2 considered same based on the word obsolute
        int n=arr.length;
        //System.out.println(n);
        System.out.println(distinctCount(arr,arr.length));
        
    }
    
    static int distinctCount(int arr[], int n) {
        Set<Integer> s=new HashSet<Integer>();//dublicates are not allowed
        for(int i=0;i<n;i++) {
            s.add(Math.abs(arr[i]));//0,1,2,4
        }
        
        return s.size();
    }

}
