
package proyectoreto01;

import java.util.ArrayList;

public class Cliente {

    public Cliente(String codigo, String DNI, String Nombre, String Apellido, String Tipo) {
        
         this.codigo = codigo;
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Tipo = Tipo; 
        this.listfactura = new ArrayList<Factura>();
        if(Tipo != null){
            if (Tipo.equals("Normal")){
                premio = new PremioNormal(listfactura);
            }else if (Tipo.equals("Gold")){
                premio = new PremioGold(listfactura);            
            }else if (Tipo.equals("Platinium")){
                premio = new PremioPlatinium(listfactura);
            }
        }
        
    }
    private String  codigo;
    private String DNI;
    private String Nombre;
    private String Apellido;
    private String Tipo;
    private ArrayList<Factura> listfactura;
    private Premio premio;

 
      
     public String getcodigo() {
        return codigo;
    }

    public void setcodigo(String codigo) {
        this.codigo = codigo;
    }
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

    public void procesarPremio(){
       if (Tipo.equals("Normal")){
            premio = new PremioNormal(listfactura);
        }else if (Tipo.equals("Gold")){
            premio = new PremioGold(listfactura);            
        }else if (Tipo.equals("Platinium")){
            premio = new PremioPlatinium(listfactura);
        }
        
    }
    
    
    public Boolean validarCamposObligatorios(){
        Boolean succes = false;
        if(this.codigo != null && this.DNI != null && this.Nombre != null && this.Apellido != null && this.Tipo != null){
            succes = true;
        }
        return succes;
    }
    
}
