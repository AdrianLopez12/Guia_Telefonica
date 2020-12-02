package ups.edu.ec.dao;
import java.util.List;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import ups.edu.ec.modelo.Estudiante;


public class AlumnoDao implements IDaoAlumno{
    
    private RandomAccessFile archivo;
    
    public AlumnoDao(){
        try{
          archivo=new RandomAccessFile("Alumno.dat","rw");  
        }catch(IOException e){
            System.out.println("Error de lectura y escritura");
            e.printStackTrace();
        }
    }

    @Override
    public void create(Estudiante Persona) {
        try{
         
    archivo.seek(archivo.length());
            
    
    
    archivo.writeUTF(Persona.getApellido());
    archivo.writeUTF(Persona.getNombre());
    archivo.writeUTF(Persona.getNombreClase());
    archivo.writeUTF(Persona.getCedula());
        }catch(IOException e){
            System.out.println("Error de lectura y escritura");
            e.printStackTrace();;
        }
    }

    @Override
    public Estudiante read(String cedula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Estudiante Persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Estudiante Persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Estudiante> findAll() {
        List<Estudiante> est=new ArrayList();
         int salto=0;
        try{
          
         
          
           while(salto<=archivo.length()){
                archivo.seek(salto);
                String apellido= archivo.readUTF();
                String nombre= archivo.readUTF();
                String nombreClase = archivo.readUTF();
                String cedula= archivo.readUTF();
           
           
        
       Estudiante estu=new Estudiante(nombre, apellido, cedula, nombreClase);
       est.add(estu);
       salto=salto+83;
           } 
       
       }catch(IOException e){
           System.out.println("Error login");
           e.printStackTrace();
       }
        return est;
    }

    @Override
    public Estudiante login(String correo, String contrasena) {
         
        
        return null;
    }
    
}
