/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainofresponsability;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael de Souza Costa
 */
public class ValidarPossuiNumeroSequencial extends Validar {

    @Override
    public void processarRequisicao(Usuario user) {

        String value = user.getPassword();
        ArrayList<Integer> numeros = new ArrayList<>();
        int numerosSequentes = 0;

        for (int i = 0; i < value.length(); i++) {

            String caracter = String.valueOf(value.charAt(i));

            if (caracter.matches("[0-9]")) {
                numeros.add(Integer.valueOf(caracter));
            }
        }
        if (numeros.size() >= 3) {

            for (int i = 0; i < (numeros.size() - 1); i++) {

                int numero = numeros.get(i);
                
                if ((numero + 1) == numeros.get(i + 1)) {
                    numerosSequentes++;
                } else if (numerosSequentes == 3) {
                    break;
                } else {
                    numerosSequentes = 0;
                }
            }
        }
        if (numerosSequentes < 2) {
            setSucessor(new ValidarTamanho());
            sucessor.processarRequisicao(user);
        } else {
            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "A senha não deve possuir numeros sequenciais!");
            //123
            //345
            //789
        }
    }
}
