/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercios09;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *Convertendo Array em ArrayList
 * @author leandro
 */
public
        class Exercicios09 {
              
              public static void  main(String[] args) {
                  
              String[]  my_array = new String[] {"Python", "JAVA", "PHP",  "Perl", "C#", "C++"};
              ArrayList<String>  list = new ArrayList<String>(Arrays.asList(my_array));
  
              System.out.println(list);
  }
}
