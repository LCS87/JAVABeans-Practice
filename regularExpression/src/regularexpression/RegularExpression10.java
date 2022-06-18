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
        class RegularExpression10 {
              public static void main(String[] args) {	   
	    String text = "C++";
		System.out.println("Original string: "+text);
		System.out.println("Adcionar traço antes e depois de qualquer vogal: "+validate(text));
		text = "CONTRARREVOLUCIONARIO";
		System.out.println("\nOriginal string: "+text);
		System.out.println("Adcionar traço antes e depois de qualquer vogal: "+validate(text));
		text = "proparoxicitona";
		System.out.println("\nOriginal string: "+text);
		System.out.println("Adcionar traço antes e depois de qualquer vogal: "+validate(text));
		text = "ABRACADABRA";
		System.out.println("\nOriginal string: "+text);
		System.out.println("Adcionar traço antes e depois de qualquer vogal: "+validate(text));
        }

   public static String validate(String text) {
	   return text.replaceAll("([AEIOUaeiou])","-$1-");
   }
}
