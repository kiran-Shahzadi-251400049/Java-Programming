public class replaceWithNextMultiple{

	public static void main(String[] args) {
		int [] array={3,8,13,21,24,29,36,37,41};

		System.out.println("\nOriginal array: ");
		printArray(array);
		replaceWithNextMultiple(array, 4);
		System.out.println("\n\nReplaced array: ");
		printArray(array);
	}//main

	public static void replaceWithNextMultiple(int[] array, int number){
		for(int i=0; i<array.length; i++){
			if(array[i]%number!=0){
				array[i]=array[i]+(number-(array[i]%number));
			}
		}
	}//replaceWithNextMultiple

	public static void printArray(int [] array){
		for(int i=0; i<array.length; i++){
			System.out.print(array[i]+" ");
		}
	}

}//replaceWithNextMultiple