package training;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			String next = iter.next();
			System.out.println(next);
			iter.remove();
		}
		
		ListIterator<String> iterator = list.listIterator();
		
		while(iterator.hasNext()) {
			String nextWithIndex = list.get(iterator.nextIndex());
			String next = iterator.next();
			if("one".equals(next)) {
				iterator.set("SWAPPED");		
			}
		}
		iterator.add("four");
		
		while(iterator.hasPrevious()) {
			String prev = iterator.previous();
			System.out.println(prev);
		}
		iterator.forEachRemaining(e -> {
			System.out.println(e);
		});
	}
}
















