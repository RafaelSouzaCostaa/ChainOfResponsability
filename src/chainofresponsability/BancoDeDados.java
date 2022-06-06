/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainofresponsability;

import java.util.ArrayList;

/**
 *
 * @author Rafael de Souza Costa
 */
public class BancoDeDados {

    private static ArrayList<Usuario> usuarios = new ArrayList<>();

    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public static void setUsuarios(Usuario usuario) {
        usuarios.add(usuario);
    }
    
    public static boolean verificarLogin(Usuario user){
        if (!usuarios.isEmpty()) {
            for(int i = 0; i < usuarios.size(); i++) {
                Usuario aux = usuarios.get(i);
                if(user.getLogin().equals(aux.getLogin())){
                    return true;
                }
            }
        }
        return false;
    }
}
