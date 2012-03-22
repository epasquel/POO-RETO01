/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoreto01;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author epasquel
 */
public class ClienteTest {
    
    public ClienteTest() {
    }


    @Test
    public void clienteDebeTenerUnPremio() {
        
        String dni = "45687542";
        String nombre = "Ebert";
        String apellido = "Pasquel";
        String tipo = "Normal";
        Cliente cliente = new Cliente(dni, nombre, apellido, tipo);
        Premio premio = cliente.getPremio();
        assertNotNull(premio);
        
    }
    
    @Test
    public void ingresoDeFacturaDebeSerDelMes(){
        
    }
    
    
    
    
}
