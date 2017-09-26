package QA7;

import java.util.HashSet;
import java.util.Set;

public class SetDEmo {
	public static void main(String[] args) {
		Set<Comparable> set = new HashSet<Comparable>();
		set.add("kopche");
		set.add(5);
		
		
		System.out.println(set.size());
		for (Object obj : set) {
			System.out.println(obj);
		}
		
		Set<String> name = new HashSet<>();
		name.add("Ivan");
		name.add("Pesho");
		name.add(set.toString());
		System.out.println(name.size());
		for (String str : name) {
			System.out.println(str);
		}
	}

}
