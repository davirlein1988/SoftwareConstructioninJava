package week1;
import java.util.*;
public class HailstoneArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Example of thw hailstone sequence with fixxed arrays
		/*
		int[] a = new int[100];
		int i  = 0;
		int n = 3;
		
		while(n != 1) {
			a[i] = n;
			i++;
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = 3 * n + 1;
			}
		}
		a[i] = n;
		i++;
		System.out.println(i + " and " + n);
		*/
		
		// Example of the sequence with ArrayList
		
		List<Integer> list = new ArrayList<Integer>();
		int n = 111;
		while (n != 1) {
			list.add(n);
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n =  3 * n + 1;
				//System.out.println(n);
			}
		}
		list.add(n);
		int max = 0;
		for (int x : list) {
			max = Math.max(x, max);
		}
		System.out.println(max);
		
		// more code
		
		Map<String, Double> treasures = new HashMap<>();
		String x = "palm";
		treasures.put("beach", 25.);
		treasures.put("palm", 50.);
		treasures.put("cove", 75.);
		treasures.put("x", 100.);
		treasures.put("palm", treasures.get("palm") + treasures.size());
		treasures.remove("beach");
		double found = 0;
		for (double treasure : treasures.values()) {
		    found += treasure;
		}
		System.out.println(found);

	}

}
