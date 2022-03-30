package aula02;

import aula02.model.Pedido;

/**
 *
 * @author leandro
 */
public class Aula02 {
      public static void main(String[] args) {
       
         /* 
          String clientePedido01 = "João";
          double valorPedido01 = 25.00;
          String[] itensPedido01 = {"Refrigerante", "XIS"};
        
          String clientePedido02 = "Maria";
          double valorPedido0 = 25.00;
          String[] itensPedido02 = {"Refrigerante", "XIS"};
          
          System.out.println("O cliente " + clientePedido01 + " Fez uma compra de " + valorPedido01 + " e os itens eram: " + itensPedido01[0] + "," + itensPedido01[1]);
     */
        Pedido pedido01 = new Pedido("João");
       
         
        System.out.println(pedido01.mensagemFinal());
        
        pedido01.receberItemValor("Refrigerante", 5.00);   
        pedido01.receberItemValor("XIS", 25.00); 
        pedido01.receberItemValor("Alaminuta", 25.00);
        pedido01.receberItemValor("Suco", 5.00);
        pedido01.receberItemValor("Agua", 2.00);
        
        
        System.out.println(pedido01.mensagemFinal());
         
    } 
}
