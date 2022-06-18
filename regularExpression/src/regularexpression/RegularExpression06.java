/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author leandro
 */
public
        class RegularExpression06 {
              public static void main(String[] args) {
	   
	    System.out.println(validate("Um peixe pulou sobre o cachorro."));
	    System.out.println(validate("Java_Expressoes_1"));
	    System.out.println(validate("Java_Expressoes_11.0"));
	    System.out.println(validate("w3r"));
        }

   public static String validate(String text) {
	    Pattern pattern = Pattern.compile("^[a-zA-Z0-9_]*$");
		 Matcher m = pattern.matcher(text);
		
	   if (m.find())
                return "Correpsonde!";
       else
                return "Não Corresponde!";
   }
}
