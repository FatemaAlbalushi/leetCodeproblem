package leetCodeproblem;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * This program will create array list of array that the submission of the two
 * element equil to the target
 *
 */
public class Matchleetproblem {

	/**
	 * 
	 * @param args: list of strings passed extremly to the application The main will
	 *              call the function Matchpair using the array and the turet and
	 *              will return the arrey list of array
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayofNumber = { 6, 7, 4, 3, 4, 5, 6 };
		int target = 10;

		ArrayList<Integer[]> resultStore = new ArrayList<>();

		System.out.println("The Array with match pair is : ");
		resultStore = getmatch(arrayofNumber, target);
		displayResult(resultStore);

	}

	public static ArrayList<Integer[]> getmatch(int[] inputarray, int target) {
		/* */
		HashMap<Integer, Integer> stateMap = new HashMap<>();
		ArrayList<Integer[]> resultStore = new ArrayList<>();

		for (int index = 0; index < inputarray.length; index++) {
			int PartofPair = target - inputarray[index];

			if (stateMap.containsKey(PartofPair)) {
				// found a pair
				resultStore.add(new Integer[] { inputarray[index], PartofPair });
			}
			stateMap.put(inputarray[index], 0);
		}
		return resultStore;
		// TODO Auto-generated method stub

	}

	private static void displayResult(ArrayList<Integer[]> inputArraylist) {
		// TODO Auto-generated method stub
		for (Integer[] currentPair : inputArraylist) {
			System.out.println(currentPair[0] + "-" + currentPair[1]);
		}

	}

}
