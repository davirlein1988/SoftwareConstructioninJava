package week1;
import java.util.*;

public class HailstoneClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hailstoneSequence(33));

	}
	
    /**
     * Compute a hailstone sequence.
     * @param n  Starting number for sequence.  Assumes n > 0.
     * @return hailstone sequence starting with n and ending with 1.
     */
	public static List<Integer> hailstoneSequence( int n) {
		List<Integer> list = new ArrayList<Integer>();
		while (n != 1) {
			list.add(n);
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = 3 * n + 1;
			}
		}
		list.add(n);
		return list;
	}


}
