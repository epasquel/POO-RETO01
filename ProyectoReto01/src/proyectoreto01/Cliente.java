
package proyectoreto01;

import java.util.ArrayList;

public class Cliente {

    public Cliente(String DNI, String Nombre, String Apellido, String Tipo) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Tipo = Tipo;        
        if (Tipo.equals("Normal")){
            premio = new PremioNormal();
        }else if (Tipo.equals("Gold")){
            premio = new PremioGold();            
        }else if (Tipo.equals("Platinium")){
            premio = new PremioPlatinium();
        }
        listfactura = new ArrayList<Factura>();
    }
    
    private String DNI;
    private String Nombre;
    private String Apellido;
    private String Tipo;
    private ArrayList<Factura> listfactura;
    private Premio premio;

    public Premio getPremio() {
        return premio;
    }

    public void setPremio(Premio premio) {
        this.premio = premio;
    }

    public ArrayList<Factura> getListfactura() {
        return listfactura;
    }

    public void setListfactura(ArrayList<Factura> listfactura) {
        this.listfactura = listfactura;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    
}
