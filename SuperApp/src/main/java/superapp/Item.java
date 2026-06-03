/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superapp;

/**
 *
 * @author Gabriel de Moura
 */
public class Item {
    
        String nome;
        String unidade;
        double preco;
        String img;

        public Item(String nome, String unidade, double preco, String img) {
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
