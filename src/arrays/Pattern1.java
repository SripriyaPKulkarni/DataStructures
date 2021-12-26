package patternprinting;

import java.util.ArrayList;

public class Pattern1 {

 public ArrayList<ArrayList<Integer>> solve(int A) {
         
         // Declaring 2D ArrayList
        int[][] arr=new int[A][A];
        ArrayList<ArrayList<Integer>> arrayList=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(j+1<=i+1){
                    arr[i][j]=j+1;
                }
            }
        }
        
        for(int i=0;i<arr.length;i++){
            ArrayList<Integer> arrayList1=new ArrayList<>();
            for(int j=0;j<arr.length;j++){
                arrayList1.add(arr[i][j]);
            }
            arrayList.add(arrayList1);
        }
        
        return arrayList;       
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Pattern1 p=new Pattern1();
		
		 ArrayList<ArrayList<Integer>> arrayList2=new ArrayList<>();
		 
		 arrayList2=p.solve(3);
		 
		 System.out.println(arrayList2);
	}

}
