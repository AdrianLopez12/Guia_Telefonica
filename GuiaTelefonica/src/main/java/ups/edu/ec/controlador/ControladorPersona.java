package ups.edu.ec.controlador;

import java.util.List;
import ups.edu.ec.modelo.Persona;

public class ControladorPersona extends AbstractControler<Persona>{
 
    public Persona buscarUsuario(int id){
        List<Persona> p=getLista();
        
        for (int i = 0; i < p.size(); i++) {
            if(p.get(i).getId()==id){
                return p.get(i);
            }
        }
        return null;
        
    }
    public Persona loguear(String nombre, String contrasena){
        List<Persona>p=getLista();
        
        for (int i = 0; i < p.size(); i++) {
            if(p.get(i).getNombre().equalsIgnoreCase(nombre)&&p.get(i).getContrasena().equals(contrasena)){
                return p.get(i);
            }
        }
        return null;
    }

    @Override
    public boolean validarObjeto(Persona objeto) {
        String contrasena=objeto.getContrasena();
        if(contrasena.length()<5){
            return false;
        }else{
        return true;    
        }
        
    }
    
    
    
    
}
