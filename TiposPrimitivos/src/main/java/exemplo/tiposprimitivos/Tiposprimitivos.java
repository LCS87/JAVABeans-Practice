/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo.tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author leandro
 */
public
        class Tiposprimitivos {

    public static
            void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); 
        System.out.println("Digite o nome do aluno");
        String nome = teclado.nextLine();
        System.out.println("Digite o nota do aluno");
        float nota = teclado.nextFloat();
        System.out.format("A nota de %s é %.4f \n", nome, nota);
    }
}
