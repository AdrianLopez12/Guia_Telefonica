package ups.edu.ec.controlador;
import java.util.List;
import ups.edu.ec.generica.AbstractControler;
import ups.edu.ec.modelo.*;
public class ControladorPersona extends AbstractControler<Persona>{

    @Override
    public boolean validarObjeto(Persona E) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Persona validarCedula(String cedula){
        List<Persona>p=getLista();
        
        for (int i = 0; i < p.size(); i++) {
            if(p.get(i).getCedula().equalsIgnoreCase(cedula)){
                return p.get(i);
                
            }
        }
        return null;
    }
    
}
