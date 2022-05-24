/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio004;

import java.util.Scanner;

/**
 *O progrsama converte os minutos digitados em dias e anos
 * @author leandro
 */
public
        class Exercicio004 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double minutesInYear = 60 * 24 * 365;

       

        System.out.print("Digite os minutos: ");

        double min = input.nextDouble();

        long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " Minutos aproximadamente " + years + " Anos e " + days + " dias");
    }
}


