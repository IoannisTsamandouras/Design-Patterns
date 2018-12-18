package training;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Context {
	
	private static Map<String, List<Row>> tables = new HashMap<>();
	
	static {
		List<Row> list = new ArrayList<>();
		list.add(new Row("Ioannis", "Tsamandouras"));
		list.add(new Row("Katerina", "Anagnostou"));
		list.add(new Row("Eric","Hamilton"));
		
		tables.put("persons", list);
	}
	
	private String table;
	private String column;
	private int index = -1;
	private static final Predicate<String> matchAny = s -> s.length() > 0;
	private Predicate<String> where = matchAny;
	private static final Function<String, Stream<? extends String>> matchAll = Stream::of;  
	private Function<String, Stream<? extends String>> mapper = matchAll;  
	
	void setColumn(String column) {
		this.column = column;
		setColumnMapper();
	}
	
	void setTable(String table) {
		this.table = table;
	}
	
	void setFilter(Predicate<String> filter) {
		where = filter;
	}
	
	void clear() {
		column = "";
		mapper = matchAll;
		where = matchAny;
	}
	
	List<String> search() {
		List<String> result = tables.entrySet()
				.stream()
				.filter(entry -> entry.getKey()
				.equalsIgnoreCase(table))
				.flatMap(entry -> Stream.of(entry.getValue()))
				.flatMap(Collection::stream)
				.map(Row::toString)
				.flatMap(mapper)
				.filter(where)
				.collect(Collectors.toList());
		
		clear();
		return result;				
	}
	
	private void setColumnMapper() {
		switch(column) {
		case "*":
			index = -1;
			break;
		case "firstName":
			index = 0;
			break;
		case "lastName":
			index = 1;
			break;		
		}
		if(index != -1) {
			mapper = s -> Stream.of(s.split(" ")[index]); 
		}
	}
	
	
}

















