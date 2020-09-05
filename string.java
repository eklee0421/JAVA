public class String {

	public static void main(String[] args) {
		// Character VS String 
        System.out.println("Hello World"); // String
        System.out.println('H'); // Character
        System.out.println("H"); 
     
        System.out.println("Hello "
                + "World");
         
        // new line
        System.out.println("Hello \nWorld");
         
        // escape
        System.out.println("Hello \"World\"");// Hello "World"
        
        System.out.println("Hello World".length()); // 11
        
        //replace -> "[[[name]]]"을 "duru"로 변경해서 출력
        System.out.println("Hello, [[[name]]] ... bye. ".replace("[[[name]]]", "duru"));
 
    }
 
}