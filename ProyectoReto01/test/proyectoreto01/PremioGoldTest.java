
package proyectoreto01;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class PremioGoldTest {
    
    Cliente cliente;
            
    public PremioGoldTest() {
    }

    @Test
    public void ClienteGoldObtienePremiosGold() {
        
        ingresarCliente();
        PremioGold premioGold = (PremioGold)cliente.getPremio();
        assertNotNull(premioGold.calcularPuntos());
        System.out.println("Sus puntos acumulados son " + premioGold.calcularPuntos());
    }
    
    @Test
    public void ClienteGoldObtieneMillasParaViaje() {
        
        ingresarCliente();
        PremioGold premioGold = (PremioGold)cliente.getPremio();
        assertNotNull(premioGold.calcularPuntos());
        System.out.println("Sus millas acumulados son " + premioGold.calcularMillas());
    }
    
    
    protected void ingresarCliente(){
        String dni = "45687542";
        String nombre = "Ebert";
        String apellido = "Pasquel";
        String tipo = "Gold";
        cliente = new Cliente(dni, nombre, apellido, tipo);
        
        ArrayList<Factura> listFactura = new ArrayList<Factura>();
        listFactura.add(new Factura("F00001", 620));
        listFactura.add(new Factura("F00002", 200));
        listFactura.add(new Factura("F00003", 180));
        listFactura.add(new Factura("F00004", 550));
        listFactura.add(new Factura("F00005", 450));
        cliente.setListfactura(listFactura);        
        cliente.procesarPremio();
    }
}
