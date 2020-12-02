package ups.edu.ec.controlador;

import java.util.List;
import ups.edu.ec.AbstractControler.AbstractControler;
import ups.edu.ec.modelo.Estudiante;
import ups.edu.ec.dao.*;
public class ControladorAlumno extends AbstractControler<Estudiante>{
IDaoAlumno AlumnoDao;
Estudiante Alumno;

    public ControladorAlumno(AlumnoDao profesoDao) {
        this.AlumnoDao = profesoDao;
    }
    public void crear(String nombre,String apellido,String cedula,String nombreClase){
        Alumno=new Estudiante(nombre, apellido, cedula, nombreClase);
        AlumnoDao.create(Alumno);
    }
    
    @Override
    public boolean validarObjeto(Estudiante objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public List<Estudiante> ListaP(){
    List<Estudiante> p=AlumnoDao.findAll();
    return p;
    
}
 
}
