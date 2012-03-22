/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoreto01;

/**
 *
 * @author epasquel
 */
public class PremioPlatinium extends Premio{

    public PremioPlatinium() {
        super();
    }
    
    public Integer calcularPuntos(){
        Integer totalPuntos = 0;
        if (montoTotal > 3000){
            double montoNeto = montoTotal - 3000;
            totalPuntos = (int)montoNeto/3;
        }
        return totalPuntos;
    }
    
    public Integer calcularMillas(){
        Integer totalMillas = 0;
        if (montoTotal > 1000){
            double montoNeto = montoTotal - 1000;
            totalMillas = (int)montoNeto/10;
        }
        return totalMillas;
    }
    
    public Integer calcularPorcentajeDescuento(){
        Integer totalDescuento = 0;        
            totalDescuento = (int)montoTotal/1000;
        return totalDescuento;
    }
    
    
}
