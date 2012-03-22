/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoreto01;

/**
 *
 * @author epasquel
 */
public class PremioNormal extends Premio{

    public PremioNormal() {
        super();
    }
    
    public Integer calcularPuntos(){
        Integer totalPuntos;
        totalPuntos = (int)montoTotal/7;
        return totalPuntos;
    }    
    
}
