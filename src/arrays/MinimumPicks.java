package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumPicks {

public int solve(ArrayList<Integer> A) {
        
        int[] arr=A.stream().mapToInt(i ->i).toArray();
        
        int maxEven=Arrays.stream(arr).filter(a ->a%2 ==0).max().orElse(-1);
        
        
        int minOdd=Arrays.stream(arr).filter(a ->a%2!=0).min().orElse(-1);
        
        return maxEven-minOdd;
        
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Problem description
				/*You are given an array of integers A of size N.
				Return the difference between the maximum among all even numbers of A and 
				the minimum among all odd numbers in A.*/
				
				MinimumPicks m=new MinimumPicks();
			
				ArrayList<Integer> a=new ArrayList<>();
				
				//[5, 17, 100, 1]
				a.add(5);
				a.add(17);
				a.add(100);
				a.add(1);
				 
				int result=m.solve(a);
				System.out.println(result);
				
	}

}
