/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios11;

/**
 *
 * @author leandro
 */
public
        class Exercicios11 {
              static void  pares_valores(int entradaArray[], int entradaNum)
  {
  System.out.println("Elementos pares e suas somas : ");
 
  for (int i =  0; i < entradaArray.length; i++)
  {
  for (int j  = i+1; j < entradaArray.length; j++)
  {
  if(entradaArray[i]+entradaArray[j] == entradaNum)
  {
  System.out.println(entradaArray[i]+" + "+entradaArray[j]+" =  "+entradaNum);
  }
  }
  }
  }
  
  public static void  main(String[] args)
  {
  pares_valores(new int[] {2, 7, 4, -5, 11, 5, 20}, 15);
  
  pares_valores(new int[] {14, -15, 9, 16, 25, 45, 12, 8}, 30);
  
  }
}
