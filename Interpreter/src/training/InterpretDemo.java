package training;

import java.util.List;

public class InterpretDemo {
	
	public static void main(String[] args) {
		Expression exp = new Select("name", new From("people"));
		Context ctx = new Context();
		List<String> result = exp.interpret(ctx);
		System.out.println(result);
		
		Expression query = new Select("*", new From("people"));
		List<String> res = query.interpret(ctx);
		System.out.println(res);
		
		Expression q = new Select("name", new From("people", 
				new Where(name -> name.toLowerCase().startsWith("I"))));
		List<String> rslt = q.interpret(ctx);
		System.out.println(rslt);
	}

}
