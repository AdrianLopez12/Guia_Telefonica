package ups.edu.ec.controlador;

import ups.edu.ec.interfaces.EstadoVentanilla;
import ups.edu.ec.modelo.Persona;

public class Cerrada implements EstadoVentanilla{

    @Override
    public void atiende(Persona persona) {
        System.out.println("Ventanilla cerrada");
    }
    
}
