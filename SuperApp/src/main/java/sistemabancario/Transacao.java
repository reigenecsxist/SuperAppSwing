/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabancario;

/**
 *
 * @author Usuário do Windows
 */
public class Transacao extends Conta {
    public int codigo = 0;
    public String tipoOperacao;
    public double valor;

    public Transacao() {
        super(null, null, 0);
    }

    public Transacao(int codigo, String tipoOperacao, double valor, String senha, String nomeMeliante, float saldo) {
        super(senha, nomeMeliante, saldo);
        this.codigo = codigo;
        this.tipoOperacao = tipoOperacao;
        this.valor = valor;
    }
}
