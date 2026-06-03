/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superapp;

import java.util.ArrayList;

/**
 *
 * @author Gabriel de Moura
 */
public class Carrinho {
     
        ArrayList<Carrinho> dentroDoCarrinho = new ArrayList<>();
        int quantItens;
        int quantTotalItens = 0;
        double valorTotalItens = 0;
        Item item;

        public Carrinho(Item item, int quantidade) {
            this.quantItens = quantItens;
            this.item = item;
        }
        public Carrinho(){
            quantTotalItens = 0;
            valorTotalItens = 0;
        }
        

        public int getQuantItens() {
            return quantItens;
        }
        
        public void adicionar(Item item, int quantidade){
            dentroDoCarrinho.add(new Carrinho(item, quantidade));
            quantTotalItens++;
            valorTotalItens+=item.getPreco();
        }
}

