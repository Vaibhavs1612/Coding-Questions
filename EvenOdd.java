package Practice;

import java.util.Arrays;

public class EvenOdd {
	public static int isEvenOdd(int arr[]) {
		int i = 0;int j=0;
		int Even[] = new int[arr.length+1];
		int Odd[] = new int[arr.length];
		for(int k = 0;k<arr.length;k++) {
			if(k%2==0) {
				Even[i++]=arr[k];
			}else {
				Odd[j++]= arr[k];
			}
			
		}
		Arrays.sort(Even);
		Arrays.sort(Odd);
		return Even[Even.length-2]+Odd[Odd.length-2];
		
	}
	public static void main(String[] args) {
		int array[] = {3,4,1,7,9,10,11};
		System.out.println(isEvenOdd(array));
	}
}
