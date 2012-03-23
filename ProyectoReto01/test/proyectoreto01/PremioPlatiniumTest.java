/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoreto01;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author student
 */
public class PremioPlatiniumTest {
    
    Cliente cliente;
     
    public PremioPlatiniumTest() {
    }

    @Test
    public void ClientePlatiniumObtienePremiosGold() {
        
        ingresarCliente();
        PremioPlatinium premioPlatinium = (PremioPlatinium)cliente.getPremio();
        assertNotNull(premioPlatinium.calcularPuntos());
        System.out.println("Sus puntos acumulados son " + premioPlatinium.calcularPuntos());
    }
    
    @Test
    public void ClientePlatiniumObtieneMillasParaViaje() {
        
        ingresarCliente();
        PremioPlatinium premioPlatinium = (PremioPlatinium)cliente.getPremio();
        assertNotNull(premioPlatinium.calcularPuntos());
        System.out.println("Sus millas acumulados son " + premioPlatinium.calcularMillas());
    }
    
    @Test
    public void ClientePlatiniumObtieneDescuentoParaComprasEnUSA() {
        
        ingresarCliente();
        PremioPlatinium premioPlatinium = (PremioPlatinium)cliente.getPremio();
        assertNotNull(premioPlatinium.calcularPuntos());
        System.out.println("Ud tiene " + premioPlatinium.calcularPorcentajeDescuento() + " % de descuento");
    }
    
    
    protected void ingresarCliente(){
        String dni = "45687542";
        String nombre = "Ebert";
        String apellido = "Pasquel";
        String tipo = "Platinium";
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
