
package proyectoreto01;

import java.util.ArrayList;

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
