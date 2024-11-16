package Practice;
import java.util.*;
public class ReplaceCharacter {
	public static String replaceCharacterOp(char arr[],int n , char ch1,char ch2) {
		for(int i = 0;i<n;i++) {
			if(arr[i]==ch1) {
				arr[i]=ch2;
			}
			else if(arr[i]==ch2) {
				arr[i]=ch1;
				
			}
		}
		return Arrays.toString(arr);
	}
	

	public static void main(String[] args) {
		char arr[]= {'a','p','p','l','e','s'};
		System.out.println(replaceCharacterOp(arr,6,'a','p'));
	}
}
