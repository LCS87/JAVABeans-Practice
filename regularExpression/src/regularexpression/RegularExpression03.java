/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package regularexpression;

/**
 *
 * @author leandro
 */
public
        class RegularExpression03 {
              
   public static void main(String[] args) {
	   
	    String text = "python";
		System.out.println("Original string: "+text);
		System.out.println("Nova string: "+validate(text));
		text = "JavaScript";
		System.out.println("\nOriginal string: "+text);
		System.out.println("Nova string: "+validate(text));
		text = "PYTHON";
		System.out.println("\nOriginal string: "+text);
		System.out.println("Nova string: "+validate(text));
        }

   public static String validate(String text) {
	   	String str = text.toLowerCase();
		if (str.contains("python")) {
			return "Java";
		} 
		return "C++";
   }
}
