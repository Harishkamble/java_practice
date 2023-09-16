package learning;

import java.util.stream.Stream;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	StringBuilder result= Stream.of("a","b").parallel().collect(StringBuilder:: new, StringBuilder:: append, (a,b)-> b.append(a));
	System.out.print(result);
	}
}
