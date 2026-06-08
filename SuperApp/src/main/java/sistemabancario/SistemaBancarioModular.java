/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabancario;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuário do Windows
 */
public class SistemaBancarioModular {
        
    public void depositar(Conta conta, Transacao transacao){
        double valorDeposito = Float.parseFloat(JOptionPane.showInputDialog("Qual valor deseja depositar?"));
        conta.saldo += valorDeposito;

        Transacao trDeposito = new Transacao(transacao.codigo++, "Depósito", valorDeposito, conta.senha, conta.nomeMeliante, conta.saldo);
        conta.extrato.add(trDeposito);
        
        JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!");
    }
    
    public void sacar(Conta conta, Transacao transacao){
        double valorSaque = Float.parseFloat(JOptionPane.showInputDialog("Qual valor deseja sacar?"));
        
        if(valorSaque>conta.saldo) JOptionPane.showMessageDialog(null, "O valor solicitado para saque é maior que o saldo disponível!");
        else {
            conta.saldo -= valorSaque;
            
            Transacao trSaque = new Transacao(transacao.codigo++, "Saque", valorSaque, conta.senha, conta.nomeMeliante, conta.saldo);
            conta.extrato.add(trSaque);
            
            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");
        }               
    }
    
}
