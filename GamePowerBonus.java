package Practice;
import java.util.*;
public class GamePowerBonus {
	public static int calculate(int power[],int bonus[],int n,int e) {
		int cnt=0;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<n;i++) {
			map.put(power[i],bonus[i]);
		}
	
		for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey()+"-"+entry.getValue());
			if(entry.getKey()<=e) {
				e+=entry.getValue();
//				map.remove(entry.getKey());
				cnt++;
			}
			
		}
		return cnt;
	}
	public static int calculate2(int power[],int bonus[],int n,int e) {
		boolean visited[]= new boolean[n];
		int cnt=0;
		for(int round = 0; round < 2; round++) {
            for(int i = 0; i < n; i++) {
                System.out.println("*");
                if(power[i] <= e && visited[i] == false) {
                    e += bonus[i];
                    visited[i] = true;
                    cnt++;
                }
            }
        }
		
		return cnt;
	}
	public static void main(String[] args) {
		int power[]= {101,100,555};
		int bonus[]= {100,1,555};
		int n =3;
		int e=100;
		System.out.println(calculate2(power,bonus,n,e));
	}
}
