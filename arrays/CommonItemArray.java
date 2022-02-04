package arrays;

public class CommonItemArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1={'a','b','c','d'};
		int[] array2={'x','y','f','z'};
		
		//containsCommonItem(array1,array2);
		System.out.println(containsCommonItem(array1,array2));
	}
	public static  boolean containsCommonItem(int[] array1, int[] array2){
		for(int i=0;i<array1.length;i++){
			for(int j=0;j<array2.length;j++){
				if(array1[i]==array2[j]){
					return true;
				}
			}
		}
		return false;
		
	}

}
