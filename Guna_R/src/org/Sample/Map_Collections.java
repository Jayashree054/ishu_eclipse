package org.Sample;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
public class Map_Collections {

	public static void main(String[] args) {
		Map<Integer, Integer> g = new TreeMap<>();
		System.out.println(g);
		g.put(1, 10);
		g.put(2, 20);
		g.put(3, 30);
		g.put(3, 40);
		g.put(4, 50);
		g.put(5, 60);
		System.out.println(g);
		Integer h = g.get(4);
		System.out.println(h);
		Collection<Integer> v = g.values();
		System.out.println(v);
		Set<Integer> rg = g.keySet();
		System.out.println(rg);
		Set<Entry<Integer, Integer>> rm = g.entrySet();
		System.out.println(rm);
		for (Entry<Integer, Integer> entry : rm) {
			System.out.println(entry);

		}
		int y = g.size();
		System.out.println(y);
		boolean rj = g.containsKey(25);
		System.out.println(rj);
		boolean cv = g.containsValue(60);
		System.out.println(cv);

	}

}
