/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.controlador;

import java.util.List;
import ups.edu.ec.AbstractControler.AbstractControler;
import ups.edu.ec.modelo.Profesor;
import ups.edu.ec.dao.*;
public class ControladorProfesor extends AbstractControler<Profesor>{
IDaoProfesor profesoDao;
Profesor profesor;

    public ControladorProfesor(ProfesorDao profesoDao) {
        this.profesoDao = profesoDao;
    }
    public void crear(String nombre,String apellido,String cedula,String nombreClase, String contrasena){
        profesor=new Profesor(nombre, apellido, cedula, contrasena, nombreClase);
        profesoDao.create(profesor);
    }
    
    @Override
    public boolean validarObjeto(Profesor objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public Profesor validarUsuario(String correo, String contrasena){
       
        Profesor p=profesoDao.login(correo, contrasena);
        if(p!=null){
            return p;
        }else{
            return null;
        }
   
    
}
      public List<Profesor> ListaP(){
    List<Profesor> p=profesoDao.findAll();
    return p;
    
}
        public Profesor buscarClase(String codClase){
            List<Profesor> p=profesoDao.findAll();
            for (Profesor profesor : p) {
                if(profesor.getNombreClase().trim().equalsIgnoreCase(codClase.trim())){
                    return profesor;
                }
            }
            return null;
            
        }
        
}
