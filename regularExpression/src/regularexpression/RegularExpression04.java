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
        class RegularExpression04 {
              public static void main(String[] args) {
	   
	    System.out.println(validate("5-2345861"));
		System.out.println(validate("6-2345861"));
		System.out.println(validate("6-5555861"));
        }

   public static String validate(String text) {
	    Pattern pattern = Pattern.compile("^5.*$");
		 Matcher m = pattern.matcher(text);
		
	   if (m.find())
                return "Corresponde!";
       else
                return "Não Corresponde!";
   }
}
