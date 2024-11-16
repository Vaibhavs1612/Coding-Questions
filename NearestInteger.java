package codes;

public class NearestInteger {
	
	public static int findNearest(int num,int m) {
		// Finding the nearest lower multiple of m
        int lower = num - (num % m);
        
        // Finding the nearest upper multiple of m
        int upper = lower + m;
        
        // Calculate the absolute distances from num
        int distLower = Math.abs(num - lower);
        int distUpper = Math.abs(num - upper);
        
        // If the distances are equal, return the larger number (upper)
        if (distLower == distUpper) {
            return upper;
        }
        
        // Otherwise, return the number with the smaller distance
        return (distLower < distUpper) ? lower : upper;
	}

	public static void main(String[] args) {
		System.out.println(findNearest(67,8));
		System.out.println(findNearest(26,3));
		System.out.println(findNearest(64,8));
	}
}
