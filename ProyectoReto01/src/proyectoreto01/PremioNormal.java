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
public class PremioNormal extends Premio{

    public PremioNormal(ArrayList<Factura> listfactura) {
        super();       
        for(Factura factura : listfactura){
            montoTotal += factura.getMontoFactura();
        }
    }
    
    public Integer calcularPuntos(){
        Integer totalPuntos;
        totalPuntos = (int)montoTotal/7;
        return totalPuntos;
    }    
    
}
