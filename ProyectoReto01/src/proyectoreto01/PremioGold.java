/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoreto01;

import java.util.ArrayList;

/**
 *
 * @author epasquel
 */
public class PremioGold extends Premio{

    public PremioGold(ArrayList<Factura> listfactura) {
        super();
         for(Factura factura : listfactura){
            montoTotal += factura.getMontoFactura();
        }
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
