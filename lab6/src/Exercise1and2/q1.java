package Exercise1and2;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class q1 {

	public static List getValues(Map<String, Integer> map) {
		List sorted = new ArrayList();
		for (Integer vlaues : map.values()) {
			sorted.add(vlaues);
		}
		Collections.sort(sorted);
		return sorted;

	}

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Amit", 20);
		map.put("asdd", 10);
		map.put("Aadmit", 23);
		map.put("adsfadf", 120);
		map.put("asdfad", 500);
		List result = new ArrayList<>();
		result = getValues(map);
		System.out.println(result);

	}
}
