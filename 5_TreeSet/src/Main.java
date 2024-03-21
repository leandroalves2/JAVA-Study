import java.util.*; 


public class Main {

	public static void main(String[] args) {
		
		Set<String> test = new TreeSet<>();		
		test.add("Leandro");
		test.add("Silva");
		test.add("Alves");
		test.add("Leandro");
		// test.add(null); = "Exception in thread "main" java.lang.NullPointerException"
		System.out.println(test);		
		
		System.out.println("");
		
		Set<String> test2 = new HashSet<>();		
		test2.add("Leandro");
		test2.add("Silva");
		test2.add("Alves");
		test2.add("Leandro");		
		test2.add(null);
		System.out.println(test2);
		
		System.out.println("");
		
		Set<String> test3 = new LinkedHashSet<>();		
		test3.add("Leandro");
		test3.add("Silva");
		test3.add("Alves");
		test3.add("Leandro");	
		test3.add(null);
		System.out.println(test3);


	}

}
