package codes;

import java.util.*;


public class SortByFrequency {

	public static void sortByFreq(int arr[]) {
		Map<Integer,Integer> frequencyMap = new HashMap<>();
		
		for(int num : arr) {
			frequencyMap.put(num,frequencyMap.getOrDefault(num, 0)+1);
		}
		
		List<Integer> sortedList = new ArrayList<>(frequencyMap.keySet());
		
		sortedList.sort((a, b) -> {
            int freqCompare = frequencyMap.get(b).compareTo(frequencyMap.get(a));
            return freqCompare == 0 ? Integer.compare(a, b) : freqCompare;
        });
		
		for (int num : sortedList) {
            int frequency = frequencyMap.get(num);
            for (int i = 0; i < frequency; i++) {
                System.out.print(num + " ");
            }
        }

	}
	public static void main(String[] args) {
		int[] arr = {4,4, 5, 6, 5, 4, 3, 2, 6, 6, 6, 3, 4};
		sortByFreq(arr);
	}
}
