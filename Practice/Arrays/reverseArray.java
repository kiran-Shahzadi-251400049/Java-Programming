public class reverseArray{

	public static void main(String [] args){

		int [] array={10,9,8,7,6,5,4,3,2,1};

		System.out.println("\nOriginal Array: ");
		printArray(array);

		reverseArray(array);

		System.out.println("\n\nReversed Array: ");
		printArray(array);

	}//main

	public static int[] reverseArray(int [] array){
		int start = 0;
    	int end = array.length-1;

		while(start<end){
			int temp=array[start];
			array[start]=array[end];
			array[end]=temp;

			start++;
			end--;
		}

		return array;
	}//reverseArray

	public static void printArray(int [] array){
		for(int i=0; i<array.length; i++){
			System.out.print(array[i]+" ");
		}
	}//printArray

}//reverseArray