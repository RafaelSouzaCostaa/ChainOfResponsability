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
public class ValidarTamanho extends Validar {

    @Override
    public void processarRequisicao(Usuario user) {

       int tamanho = user.getPassword().length();

        if (tamanho >= 8 && tamanho <= 16) {
            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Usuario cadastrado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "A senha deve possuir no minimo 8 e maximo 16 caracter");
        }
    }
}
