package www.jagan.learning;

import java.util.regex.*;

public class StringSearchRegularExp{

public static void main(String[] args) {

	String pattern = "[a-z]";
	String check = "Regular Expressions";
	Pattern x = Pattern.compile("u");
	Matcher c = x.matcher(check);
	
	if(c.find())
      	System.out.println( check.substring( c.start(), c.end() )+" found" );
	else
		System.out.println("not found");
}
}
