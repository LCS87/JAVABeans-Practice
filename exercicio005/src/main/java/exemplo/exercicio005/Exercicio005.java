/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo.exercicio005;

import java.util.Scanner;

/**
 *
 * @author leandro
 */
public
        class Exercicio005 {
              public static void main(String[] Strings) {

               Scanner input = new Scanner(System.in);

            System.out.print("Digite a: \n");
            double a = input.nextDouble();
            System.out.print("Digite b: \n");
            double b = input.nextDouble();
            System.out.print("Digite c: \n");
            double c = input.nextDouble();

            double result = b * b - 4.0 * a * c;

            if (result > 0.0) {
                double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
                double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
                System.out.println("As Raizes São " + r1 + " e " + r2);
            } else if (result == 0.0) {
                double r1 = -b / (2.0 * a);
                System.out.println("A Raiz é " + r1);
            } else {
                System.out.println("A Equação nã tem Raiz Real.");
            }

    }
}
