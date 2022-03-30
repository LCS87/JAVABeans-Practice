
package aula02.model;

import java.util.Arrays;
import java.util.Objects;


public
        class Pedido {
    public String cliente;
    public double valor;
    public String[] itens = new String[5];
    
    public Pedido( String cliente ){
        this.cliente = cliente;
        
    }
        
    public String mensagemFinal(){
     String texto =  "O cliente " + cliente + " Fez uma compra de " + valor + " e os itens eram: " + itens[0] + ", " + itens[1] + ", " + itens[2] + ", " +  itens[3] + ", " + itens[4];
    
     return texto;
    }


     public void receberItemValor(String item, double valor){
         this.valor += valor;      
         
         for(int i = 0; i < this.itens.length; i++){
             if(this.itens[i] == null){
                 this.itens[i] = item;
                 break;
             }
         }
     }
}