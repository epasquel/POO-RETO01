
package proyectoreto01;

import java.util.Calendar;
import java.util.Date;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class FacturaTest {
    
    public FacturaTest() {
    }

    @Test
    public void elIngresoDelMesDeLaFacturaEsDelMesActual() {       
        Calendar c1 = Calendar.getInstance();         
        Factura factura = new Factura();
        assertTrue(factura.validarMesFactura(c1.MONTH));
        System.out.println("El mes es correcto");
    }
    
    @Test
    public void elIngresoDelMesDeLaFacturaNoEsDelMesActual() { 
        Factura factura = new Factura();
        assertTrue(factura.validarMesFactura(2));
        System.out.println("El mes no es correcto");
    }
    
    @Test
    public void siNoIngresoElCodigoyMontoMeDebeDarError(){
        Factura admFactura = new Factura();        
        assertFalse(admFactura.verificarFactura(null));
        System.out.println("La factura debe tener codigo y monto");
    }
    
     @Test
    public void siIngresoElCodigoyMontoMeDebeDarIngresoSatisfactorio(){
        Factura admFactura = new Factura();        
        assertFalse(admFactura.verificarFactura(null));
        System.out.println("Ingreso satisfactorio");
    } 
}
