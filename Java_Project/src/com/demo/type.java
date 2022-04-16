package com.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class type {
public static void main(String[] args) {

Map<Integer, String> i = new HashMap<Integer, String>();

i.put(1, "45");
i.put(3, "100");
i.put(3, "98");
i.put(4, null);
i.put(4, null);
System.out.println(i);


int size = i.size();
System.out.println(size);

Set<Integer> keySet = i.keySet();
System.out.println(keySet);

Collection<String> values = i.values();
System.out.println(values);

boolean containsKey = i.containsKey(5);
System.out.println(containsKey);

boolean containsValue = i.containsValue(null);
System.out.println(containsValue);


Set<Entry<Integer, String>> entrySet = i.entrySet();
System.out.println(containsValue);
for (Entry<Integer, String> s : entrySet) {
	System.out.println(s);
}

Map<Integer, String> t = new Hashtable<Integer, String>();

t.put(1, "45");
t.put(3, "100");
t.put(3, "98");

try {
	t.put(4, null);
} finally {
 System.out.println(t);
}
}
}
