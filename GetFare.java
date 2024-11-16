package TCSNQT;

public class GetFare {
	public static int getFareOp(String source,String destination,String stops[],int paths[]) {
		int s = 0;
		int d = 0;
		int sum =0;
		for(int i =0;i<stops.length;i++) {
			if(stops[i].equals(source)) {
				s=i;
			}
			if(stops[i].equals(destination)) {
				d=i;
			}
		}
		int i= s;
		while(i!=d) {
			i=(i+1)%8;
			sum+=paths[i];
			
		}
		double fare = sum*5;
		return (int)Math.ceil(fare/1000);
	}
	public static void main(String[] args) {
		int paths[] = {800,600,750,900,1400,1200,1100,1500};
		String stops[] = {"TH","GA","IC","HA","TE","LU","NI","CA"};
		System.out.println(getFareOp("TE","LU",stops,paths));

	}
}
