package ups.edu.ec.controlador;

import ups.edu.ec.AbstractControler.AbstractControler;
import ups.edu.ec.modelo.Rector_Administrador;
import ups.edu.ec.dao.*;
public class ControladorPersona extends AbstractControler<Rector_Administrador>{
    private IDaoPersona personaDao;
    public Rector_Administrador persona;
    

    public ControladorPersona(PersonaDao personaDao) {
        this.personaDao = personaDao;
    }
    
    

    @Override
    public boolean validarObjeto(Rector_Administrador objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void registrar(String nombre,String cedula, String apellido, String cargo, String Contrasena){
        persona=new Rector_Administrador(nombre, apellido, cargo, Contrasena, cedula);
        personaDao.create(persona);
    }
    public Rector_Administrador validarUsuario(String correo, String contrasena){
       
        persona=personaDao.login(correo, contrasena);
        if(persona!=null){
            return persona;
        }else{
            return null;
        }
        
        
    }
}
