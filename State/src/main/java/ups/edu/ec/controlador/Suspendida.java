package ups.edu.ec.controlador;

import ups.edu.ec.interfaces.EstadoVentanilla;
import ups.edu.ec.modelo.Persona;
public class Suspendida implements EstadoVentanilla{

    @Override
    public void atiende(Persona persona) {
        if(persona.getEdad()>65){
            System.out.println("Esta atendiendo a: "+persona.getNombre());
        }else{
            System.out.println("Espere un momento porfavor.....");
        }
    }

 

  

 
    
}
