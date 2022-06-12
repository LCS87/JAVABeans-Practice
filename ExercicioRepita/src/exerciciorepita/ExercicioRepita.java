/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;
/**
 *
 * @author leandro
 */
public
        class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static
            void main(String[] args) {
        // TODO code application logic here
        int n;
        do{
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um Numero: "));
    }while(n != 0);
    
   }
}
