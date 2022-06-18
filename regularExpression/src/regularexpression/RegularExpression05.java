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
        class RegularExpression05 {
              public static void main(String[] args) {	   
	    String text = "LETRAS MINUSCULA";
		System.out.println("Original string: "+text);
		System.out.println("APos remover vogais: Nova string: "+validate(text));
		text = "Java";
		System.out.println("\nOriginal string: "+text);
		System.out.println("APos remover vogais: Nova string: "+validate(text));
		text = "MID-CENTRALIZED";
		System.out.println("\nOriginal string: "+text);
		System.out.println("APos remover vogais: Nova string: "+validate(text));
		text = "C++";
		System.out.println("\nOriginal string: "+text);
		System.out.println("APos remover vogais: Nova string: "+validate(text));
        }

   public static String validate(String text) {
	   String result = text.replaceAll("(?i)[aeiou]", "");
	   return result;
  }
}
