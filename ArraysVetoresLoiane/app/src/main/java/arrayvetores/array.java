/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayvetores;

/**
 *
 * @author leandro
 */
public class array {
    public static  void main(String[] args) {
        
             double tempDia001 = 31.3;
             double tempDia002 = 32;
             double tempDia003 = 33.7;
             double tempDia004 = 34;
             double tempDia005 = 33.1;
                
             double[] temperaturas = new double[365];
             temperaturas[0] = 31.3;
             temperaturas[1] = 32;
             temperaturas[2] = 33.7;
             temperaturas[3] = 34;
             temperaturas[4] = 33.1;
             
             System.out.println("O valor da temperatura do dia 3 é: " + temperaturas[2]);
             
             System.out.println("O taanho do array: " + temperaturas.length);
             
             System.out.println("Valores do Array: ");
             for(int i = 0; i < temperaturas.length; i++){
                 
                 System.out.println("O valor da Temeperatura do dia: " + (i+1) + "é" + temperaturas[i]);
             }
    }
}
