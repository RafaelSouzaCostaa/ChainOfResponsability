/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chainofresponsability;

import javax.swing.JOptionPane;

/**
 *
 * @author Rafael de Souza Costa
 */
public class ChainOfResponsability {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario usuarioTester = new Usuario("Fernando", "Matos*PP*2022");
        BancoDeDados.setUsuarios(usuarioTester);

        ValidarLoginExistente validar = new ValidarLoginExistente();

        boolean chave = true;
        while (chave) {
            String index = JOptionPane.showInputDialog("\n1 - Cadastro\n2 - Sair");
            if (index.equals("1")) {
                String login = JOptionPane.showInputDialog("Login: ");
                String password = JOptionPane.showInputDialog("Password: ");

                Usuario user = new Usuario(login, password);
                validar.processarRequisicao(user);
            }

            if (index.equals("2")) {
                chave = false;
            }

        }

    }
}
