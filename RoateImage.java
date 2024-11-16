package codes;

public class RoateImage {
	
	public static void RoateImage(int arr[][]) {
		// find the transpose of the matrix 
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		//reverse the row
		for(int i=0;i<arr.length;i++) {
			int left =0,right = arr.length-1;
			while(left<right) {
				int temp = arr[i][left];
				arr[i][left] = arr[i][right];
				arr[i][right]= temp;
				left++;
				right--;
			}
			
		}
		
	}
	public static void print(int arr[][]) {
		for(int[] row : arr) {
			for(int val : row) {
				System.out.print(val);
			}
			System.out.println();
		}
	}

	 public static void main(String[] args) {
		 int[][] matrix = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };
		 System.out.println("Original Matrix:\n");
	        print(matrix);
	        
		RoateImage(matrix);
		System.out.println("Rotate Image is :\n");
        print(matrix);

	}
}
