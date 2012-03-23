
package proyectoreto01;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class PremioNormalTest {
    
   @Test
    public void ClienteNormalObtienePremiosNormales() {
         String codigo = "cl001"; 
        String dni = "45687542";
        String nombre = "Ebert";
        String apellido = "Pasquel";
        String tipo = "Normal";
        Cliente cliente = new Cliente(codigo, dni, nombre, apellido, tipo);
        
        ArrayList<Factura> listFactura = new ArrayList<Factura>();
        listFactura.add(new Factura("F00001", 620));
        listFactura.add(new Factura("F00002", 200));
        listFactura.add(new Factura("F00003", 180));
        listFactura.add(new Factura("F00004", 550));
        listFactura.add(new Factura("F00005", 450));
        cliente.setListfactura(listFactura);        
        cliente.procesarPremio();
        PremioNormal premioNormal = (PremioNormal)cliente.getPremio();
        assertNotNull(premioNormal.calcularPuntos());
        System.out.println("Sus puntos acumulados son " + premioNormal.calcularPuntos());
    }
}
