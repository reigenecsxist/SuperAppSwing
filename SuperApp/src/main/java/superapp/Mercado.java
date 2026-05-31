/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superapp;
import java.util.ArrayList;

/**
 *
 * @author Usuário do Windows
 */
public class Mercado {
    
    public static class item{
        String nome;
        String unidade;
        double preco;
        String img;

        public item(String nome, String unidade, double preco, String img) {
            this.nome = nome;
            this.unidade = unidade;
            this.preco = preco;
            this.img = img;
        }        

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }

        public String getUnidade() {
            return unidade;
        }

        public String getImg() {
            return img;
        }
    }
    
    public class Carrinho{
        ArrayList<Carrinho> dentroDoCarrinho = new ArrayList<>();
        int quantItens;
        int quantTotalItens = 0;
        double valorTotalItens = 0;
        Mercado.item item;

        public Carrinho(item item, int quantidade) {
            this.quantItens = quantItens;
            this.item = item;
        }

        public int getQuantItens() {
            return quantItens;
        }
        
        public void adicionar(Mercado.item item, int quantidade){
            dentroDoCarrinho.add(new Carrinho(item, quantidade));
            quantTotalItens++;
            valorTotalItens+=item.getPreco();
        }
    }
    
}
