package co.challenges.codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfK {

	public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
		
		if (t < 0)
			return null;
		else if (k == 0)
			return 0;
		else if (ls.size() == 0)
			return null;

		List<Integer> rest = ls.subList(1, ls.size());

		Integer b1 = chooseBestSum(t, k, rest);
		Integer b2 = chooseBestSum(t - ls.get(0), k - 1, rest);
		if (b2 == null)
			return b1;
		b2 += ls.get(0);
		if (b1 == null)
			return b2;
		return Math.max(b1, b2);
	}

	static <T> List<List<T>> combinations(List<T> list, int n) {
		List<List<T>> result;

		if (list.size() <= n) {
			result = new ArrayList<List<T>>();
			result.add(new ArrayList<T>(list));
		} else if (n <= 0) {
			result = new ArrayList<List<T>>();
			result.add(new ArrayList<T>());
		} else {

			List<T> sublist = list.subList(1, list.size());

			result = combinations(sublist, n);

			for (List<T> alist : combinations(sublist, n - 1)) {
				List<T> thelist = new ArrayList<T>(alist);
				thelist.add(list.get(0));
				result.add(thelist);
			}
		}

		return result;

	}

	public static Integer chooseBestSumBrute(int t, int k, List<Integer> ls) {

		ls = ls.stream().filter(s -> s <= t).collect(Collectors.toList());

		if (ls.size() < k || t == 0) {
			return null;
		}

		List<Integer> result = new ArrayList<>();
		
		combinations(ls, k).stream().map(l -> l.stream().mapToInt(i -> i).sum()).forEach(result::add);
		
		result = result.stream().filter(s -> s <= t).collect(Collectors.toList());
		
		if (result.size() == 0)
			return null;

		return Collections.max(result);

	}

}
