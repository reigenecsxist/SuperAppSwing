/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superapp;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Gabriel de Moura
 */
public class Carrinho {
    //Vou usar hash pra não precisar de um objeto intermediário só pq preciso pegar o objeto e a quantidade
    HashMap<Item, Integer> meuCarrinho = new HashMap<>();
    int quantItens;
    int quantTotalItens = 0;
    double valorTotalItens = 0;
    Item item;
    
    public Carrinho(){}

    public Carrinho(Item item, int quantidade) {
        this.quantItens = quantItens;
        this.item = item;
    }

    public int getQuantItens() {
        return quantItens;
    }
}

