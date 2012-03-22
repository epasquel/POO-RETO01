/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoreto01;

/**
 *
 * @author epasquel
 */
public class PremioGold extends Premio{

    public PremioGold() {
        super();
    }
    
    public Integer calcularPuntos(){
        Integer totalPuntos = 0;
        if (montoTotal > 1000){
            double montoNeto = montoTotal - 1000;
            totalPuntos = (int)montoNeto/5;
        }
        return totalPuntos;
    }
    
    public Integer calcularMillas(){
        Integer totalMillas = 0;                
        totalMillas = (int)montoTotal/10;        
        return totalMillas;
    }
    
}
