/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package chainofresponsability;

/**
 *
 * @author Rafael de Souza Costa
 */
public abstract class Validar {
    
    protected Validar sucessor;
    
    public void setSucessor(Validar sucessor){
        this.sucessor = sucessor;
    }
    
    public abstract void processarRequisicao(Usuario user);
    
}
