
package proyectoreto01;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class ClienteTest {
    
    public ClienteTest() {
    }

    @Test
    public void clienteDebeTenerUnPremio() {
         String codigo = "cl001";
        String dni = "45687542";
        String nombre = "Ebert";
        String apellido = "Pasquel";
        String tipo = "Normal";
        Cliente cliente = new Cliente(codigo, dni, nombre, apellido, tipo);
        Premio premio = cliente.getPremio();
        assertNotNull(premio);
       
       
    }     
    
        
    @Test
    public void clienteDebeIngresarDatosMandatoriosDevuelveFalso(){
        String codigo = null;
        String dni = null;
        String nombre = "Ebert";
        String apellido = null;
        String tipo = null;
        Cliente cliente = new Cliente(codigo, dni, nombre, apellido, tipo);
        assertFalse(cliente.validarCamposObligatorios());
        System.out.println("Debe ingresar los campos obligatorios");
    }
    
    @Test
    public void clienteDebeIngresarDatosMandatoriosDevuelveVerdadero(){
        String codigo = "cl001";;
        String dni = "45687542";
        String nombre = "Ebert";
        String apellido = "Pasquel";
        String tipo = "Normal";
        Cliente cliente = new Cliente(codigo, dni, nombre, apellido, tipo);
        assertTrue(cliente.validarCamposObligatorios());
        System.out.println("Los campos ingresados son correctos");
    }
    
}
