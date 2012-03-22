
package proyectoreto01;

import java.util.Calendar;
import java.util.Date;


public class Factura {
    
    Calendar calendar = Calendar.getInstance();
    public Factura(){
        mesActual = calendar.MONTH;
    }

    public Factura(String codFactura, double montoFactura) {
        this.codFactura = codFactura;
        this.montoFactura = montoFactura;
        this.mesActual = calendar.MONTH;
    }
   
    private String codFactura;
    private double montoFactura;
    private Integer mesActual;

    public String getCodFactura() {
        return codFactura;
    }

    public void setCodFactura(String codFactura) {
        this.codFactura = codFactura;
    }

    public double getMontoFactura() {
        return montoFactura;
    }

    public void setMontoFactura(double montoFactura) {
        this.montoFactura = montoFactura;
    }
    
    public Boolean validarMesFactura(Integer mes){
        Boolean succes = false;
        if(mes == mesActual){
            succes = true;
        }
        return succes;
    }
    
    public Boolean verificarFactura(Factura factura){
        Boolean succes = false;
        if(factura != null){
            succes = true;
        }
        return succes;
    }
    
}
