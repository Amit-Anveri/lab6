package Exercise1and2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class q2 {
	public static Map<Character, Integer> countChars(char[] arr) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : arr) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		return map;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		char[] arr = s.toCharArray();
		Map<Character, Integer> result = countChars(arr);
		System.out.println(result);
	}

}
