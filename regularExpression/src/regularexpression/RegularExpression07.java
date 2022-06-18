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
        class RegularExpression07 {
              public static void main(String[] args) {	   
	   String n = "123";
	   System.out.println("\nNumero: "+n);
	   System.out.println("A quantidade de casa decimais é: "+validate(n));
	   n = "112.3";
    	   System.out.println("\nNumero: "+n);
	   System.out.println("A quantidade de casa decimais é: "+validate(n));
	   n = "112.03";
    	  System.out.println("\nNumero: "+n);
	  System.out.println("A quantidade de casa decimais é: "+validate(n));
	  n = "112.233";
    	 System.out.println("\nNumero: "+n);
	 System.out.println("A quantidade de casa decimais é: "+validate(n));
        }

   public static Integer validate(String n) {
	   	if(n.contains("."))
			return n.replaceAll(".*\\.(?=\\d?)", "").length();
		return 0;
  }
}
