package war;

public class JavaNotes {
	
	public static void main(String[] args) {

	/*
	 * Terminate statements with a semi-colon
	 * use these comments to explain your code for others!
	 * API: application programming interfaces
	 * 
	 * variable: temporarily store data in computer's memory 
	 * 
	 * camel case vs pascal case
	 * 
	 * use meaningful names for you variables! descriptive
	 * 
	 * can use underscore like comma for numbs in english
	 * 
	 * cannot use "reserved keywords" to name our own things
	 * 
	 * when dealing with reference types you have to "allocate memory"
	 * 
	 * object is instance of a class
	 * 
	 * sout ctrl space!!!!
	 * 
	 * primative: stores actual value in allocated memory
	 * reference type: stores address of object with value
	 * why it is called a referece type!!
	 * copied by value vs copied by reference
	 * 
	 * arguments go in parameters like things in a box
	 * 
	 * immutable: cannot mutate/change
	 * like Strings/objects
	 * modifying will always make a new object/String
	 * 
	 * escape characters
	 * \ backslash to escape syntax things
	 * 
	 * \n is new line!!!
	 * \t is new tab
	 * 
	 * 
	 */
		
		int i = 1;
		//i = 2;
		int j = i;
		//i = 2;
		
		System.out.println(j);
		
		String one = "One";
		
		String two = "Two";
		one = two;
		
		System.out.println(one);
		
		String str = "Hello";
		int n = 2;
	
		  System.out.println(str.substring(0, n) + str.substring(str.length() - n, str.length()));

		
		
	}
	
}
