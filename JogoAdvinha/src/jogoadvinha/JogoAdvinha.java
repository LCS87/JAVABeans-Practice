
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author leandro
 */
public
        class JogoAdvinha {

    /**
     * @param args the command line arguments
     */
    public static
            void main(String[] args) {
        // TODO code application logic here
        int numero, contador, palpite;
        Scanner ler = new Scanner(System.in);
        Random rand = new Random();
        numero = rand.nextInt(100);
        contador = 0;
        palpite = -1;
        while (palpite != numero){
            System.out.println("Digite o Palpite: ");
            palpite = ler.nextInt();
            contador++;
            if (palpite > numero){
                System.out.println("Digite um numero Menor!!!");
            }else{
                if (palpite < numero){
                    System.out.println("Digite um numero Maior!!!");
                     
                }else {
                    System.out.println("Parabens!!!");
                    System.out.println("Voce acertou com " + contador + "Tentativas");
                }
            }
            ler.close();
        }
    }
    
}
