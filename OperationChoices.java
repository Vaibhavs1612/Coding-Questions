package Practice;

public class OperationChoices {
	public static int operationChoicesOp(int a,int b,int c) {
		if(c==1) {
			return a+b;
		}
		if(c==2) {
			return a-b;
		}
		if(c==3) {
			return a*b;
		}
		if(c==4) {
			return a/b;
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println(operationChoicesOp(3,4,2));
	}
}
