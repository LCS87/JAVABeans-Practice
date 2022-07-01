/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vernotas;

import java.util.Scanner;

/**
 *
 * @author leandro
 */
public class VerNotas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String aluno[] = new String[10];
        float[] nota1, nota2, media;
        nota1 = new float[10];
        nota2 = new float[10];
        media = new float[10];
        float soma = 0, mediageral;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o nome do aluno: ");
            aluno[i] = input.next();
            System.out.println("nota 1: ");
            aluno[i] = input.next();
            System.out.println("nota 2:  ");
            nota2[i] = input.nextFloat();
            media[i] = (nota1[i] + nota2[i]) / 2;
            soma += media[i];
        }
        mediageral = soma / 10;
        System.out.println("Lista dos Alunos:");
        for (int i = 0; i < 10; i++) {
            System.out.println(aluno[i] + " - nota1 = " + nota1[i] + " nota2 = "
                    + nota2[i] + " Media = " + media[i]);
        }
        System.out.printf("Media Geral da Turma: %.1f\n", mediageral);
        System.out.println("Melhor Aluno: ????");
        input.close();
    }

}
