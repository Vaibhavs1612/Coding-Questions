package Practice;

public class validPass {
	public static int isValid(String s) {
		
		if(s.length()<4) return 0;
		if(Character.isDigit(s.charAt(0))) return 0;
		boolean isCapital = false;
		boolean isNumerical = false;
		
		for(char ch :s.toCharArray()) {
			if(ch==' ' || ch=='/') return 0;
			if(Character.isUpperCase(ch)) isCapital = true;
			if(Character.isDigit(ch)) isNumerical = true;
		}
		if(isCapital && isNumerical) return 1;
		
		return 0;
	}
	public static void main(String[] args) {
		System.out.println(isValid("Vaibhav 7"));
	}
}
