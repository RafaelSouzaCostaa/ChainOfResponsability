/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainofresponsability;

import javax.swing.JOptionPane;

/**
 *
 * @author Rafael de Souza Costa
 */
public class ValidarLoginExistente extends Validar {
    
    @Override
    public void processarRequisicao(Usuario user) {
        if (!BancoDeDados.verificarLogin(user)) {
            setSucessor(new ValidarCaracMaiusculo());
            sucessor.processarRequisicao(user);
        } else {
            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Usuario já existe!");
        }
    }
    
}
