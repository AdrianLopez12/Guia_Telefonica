package ups.edu.ec.dao;
import java.util.List;
import ups.edu.ec.modelo.Profesor;
import java.io.IOException;
import java.io.RandomAccessFile;
import ups.edu.ec.modelo.Actividades;


public class ActividadesDao implements IDaoActividades{
    
    private RandomAccessFile archivo;
    
    public ActividadesDao(){
        try{
          archivo=new RandomAccessFile("actividades.dat","rw");  
        }catch(IOException e){
            System.out.println("Error de lectura y escritura");
            e.printStackTrace();
        }
    }

    @Override
    public void create(Actividades actividades) {
        try{
         
    archivo.seek(archivo.length());
            
    
    
    archivo.writeUTF(actividades.getNombreActividad());
    archivo.writeUTF(actividades.getNombreClase());

   
        }catch(IOException e){
            System.out.println("Error de lectura y escritura");
            e.printStackTrace();;
        }
    }

    @Override
    public Actividades read(String cedula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Actividades Persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Actividades Persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Actividades> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Actividades login(String correo, String contrasena) {
       
        
        return null;
    }
    
}
