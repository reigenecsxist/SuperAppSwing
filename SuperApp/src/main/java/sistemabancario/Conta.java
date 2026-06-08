/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabancario;
import java.util.ArrayList;

/**
 *
 * @author Usuário do Windows
 */
public class Conta {
    public String senha, nomeMeliante;
    public float saldo=0;
    public ArrayList<Conta> contas = new ArrayList<>();
    public ArrayList<Transacao> extrato = new ArrayList<>();

    public Conta() {
    }
    
    public Conta(String senha, String nomeMeliante, float saldo) {
        this.senha = senha;
        this.nomeMeliante = nomeMeliante;
        this.saldo = saldo;
    }
}
