package ups.edu.ec.modelo;

import ups.edu.ec.controlador.*;
import ups.edu.ec.interfaces.EstadoVentanilla;

public class Vendedor {
String cajero;    
    EstadoVentanilla estado;

    public Vendedor() {
        this.estado = new Abierta();
    }
    
    public void suspende(){
        estado=new Suspendida();
    }
    public void cerrar(){
        estado=new Cerrada();
                
    }
    public void abrir(){
        estado=new Abierta();
                
    }
    public void atiende(Persona persona){
        
        estado.atiende(persona);
    }

   
    
    
}
