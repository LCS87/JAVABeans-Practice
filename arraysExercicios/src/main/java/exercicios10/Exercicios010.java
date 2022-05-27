/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios10;

import java.util.ArrayList;

/**
 *ArrayList em Array
 * @author leandro
 */
public
        class Exercicios010 {
              public static void  main(String[] args){
                  
              
              ArrayList<String> list = new ArrayList<String>();

             list.add("Python");
 
             list.add("Java");
 
             list.add("PHP");
  
             list.add("C#");
 
             list.add("C++");
  
             list.add("Perl");
 
             String[]  my_array = new String[list.size()];
  
             list.toArray(my_array);
  
             for (String  string : my_array)
             {
            System.out.println(string);
        
    }
  }
  }
