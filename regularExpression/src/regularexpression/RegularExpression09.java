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
        class RegularExpression09 {
              public static void main(String[] args) {	   
	    String text ="Java Exercises";
		System.out.println("Texto: "+text);
		System.out.println("Apos remover os caracteres não alfanumericos: "+validate(text));
	    text ="Ex@^%&%(ercis*&)&es";
		System.out.println("\nTexto: "+text);
		System.out.println("Apos remover os caracteres não alfanumericos: "+validate(text));	
        }

   public static String validate(String text) {
        return text.replaceAll("(?i)[^A-Z]", "");
   }
}
