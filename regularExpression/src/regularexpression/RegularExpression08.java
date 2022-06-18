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
        class RegularExpression08 {
              public static void main(String[] args) {	   
	    int n = 100;
		System.out.println("Numero: "+n);
		System.out.println("Defina o separador dos numeros): "+validate(n));
	    n = 1000;
		System.out.println("\nNumero: "+n);
		System.out.println("Defina o separador dos numeros): "+validate(n));
	    n = 10000;
		System.out.println("\nNumero: "+n);
		System.out.println("Defina o separador dos numeros): "+validate(n));	
	    n = 100000;
		System.out.println("\nNumero: "+n);
		System.out.println("Defina o separador dos numeros): "+validate(n));		
	    n = 1000000;
		System.out.println("\nNumero: "+n);
		System.out.println("Defina o separador dos numeros): "+validate(n));		
		    		    
        }

   public static String validate(int n) {
		String num = Integer.toString(n);
		int len = num.length();
		if(len < 4) {
			return num;
		}
		//You can use any character as separator 
		return validate(Integer.parseInt(num.substring(0, len-3))) + '.' + num.substring(len-3);
   }
}
