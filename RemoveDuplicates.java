package codes;

public class RemoveDuplicates {

	public static int remove(int arr[]) {
		int i =0;
		for(int j=1;j<arr.length;j++) {
			if(arr[i]!=arr[j]) {
				arr[i+1] =arr[j];
				i++;
			}
		}
		return i+1;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,2,3,3,4,5,5,5,5,5,5};
		System.out.println(remove(arr));
	}
}
