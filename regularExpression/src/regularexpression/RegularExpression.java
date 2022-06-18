/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author leandro
 */
public
        class RegularExpression {

    /**
     * @param args the command line arguments
     */
    public static
            void main(String[] args) {
        // TODO code application logic here
    
	    System.out.println(validate("ABCDEFabcdef123450"));
		System.out.println(validate("SQL"));		
		System.out.println(validate("Java"));
		System.out.println(validate("*&%@#!}{"));
		System.out.println(validate("w3resource.com"));
        }

   public static boolean validate(String text) {
    return text.matches("^[\\w]+$");
  }
    }
    

