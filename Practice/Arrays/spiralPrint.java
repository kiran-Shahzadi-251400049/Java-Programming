public class spiralPrint{
	public static void main(String[] args) {
		//creating array
		int matrix[][]={{0,1,2}, {3,4,5}, {6,7,8}};
		printMatrix(matrix);
		printSpiral(matrix);

	}//main

	public static void printSpiral(int[][] matrix){

		//Input validation
		boolean isValid = true;

    	for (int i = 0; i < matrix.length; i++) {
        	if (matrix[0].length != matrix[i].length) {
            isValid = false;
        	}
    	}

    	if (!isValid) {
        	System.out.println("\nInvalid matrix input");
    	}//if

    	else{

			//Spiral traverse
			int top=0, bottom=matrix.length-1, left=0, right=matrix[0].length-1;

			System.out.println("\nSpiral Order:");

			while(top<=bottom && left<=right){

				for (int i = left; i <= right; i++) {
                	System.out.print(matrix[top][i] + " ");
            	}
            	top++;


            	for (int i = top; i <= bottom; i++) {
                	System.out.print(matrix[i][right] + " ");
            	}
            	right--;


            	if (top <= bottom) {
                	for (int i = right; i >= left; i--) {
                    	System.out.print(matrix[bottom][i] + " ");
                	}
                	bottom--;
            	}


            	if (left <= right) {
                	for (int i = bottom; i >= top; i--) {
                    	System.out.print(matrix[i][left] + " ");
                	}
                	left++;
	        	}

			}//while

		}//else

	}//printSpiral

	public static void printMatrix(int[][] matrix){

		System.out.println("\nInput Matrix:");

		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[i].length; j++){
				System.out.print(matrix[i][j]+" ");
			}//inner-for
			System.out.println();
		}//outer-for
	}//Print matrix

}//class