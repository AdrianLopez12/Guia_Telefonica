package ups.edu.ec.dao;
import java.util.List;
import ups.edu.ec.modelo.Profesor;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;


public class ProfesorDao implements IDaoProfesor{
    
    private RandomAccessFile archivo;
    
    public ProfesorDao(){
        try{
          archivo=new RandomAccessFile("Profesor.dat","rw");  
        }catch(IOException e){
            System.out.println("Error de lectura y escritura");
            e.printStackTrace();
        }
    }

    @Override
    public void create(Profesor Persona) {
        try{
         
    archivo.seek(archivo.length());
            
    
    
    archivo.writeUTF(Persona.getApellido());
    archivo.writeUTF(Persona.getNombre());
    archivo.writeUTF(Persona.getNombreClase());
    archivo.writeUTF(Persona.getCedula());
    archivo.writeUTF(Persona.getContrasena());
        }catch(IOException e){
            System.out.println("Error de lectura y escritura");
            e.printStackTrace();;
        }
    }

    @Override
    public Profesor read(String cedula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Profesor Persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Profesor Persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Profesor> findAll() {
        List<Profesor> p=new ArrayList();
          int salto=0;
try{
         
         
          
           while(salto<=archivo.length()){
                archivo.seek(salto);
                
      
         
      
          
           String apellidoArchivo = archivo.readUTF();
           String nombreArchivo = archivo.readUTF();
           String nombreClase = archivo.readUTF();
            String cedulaArchivo = archivo.readUTF();
       String contrasenaArchivo=archivo.readUTF();
        
           Profesor usu=new Profesor(nombreArchivo, apellidoArchivo, cedulaArchivo, contrasenaArchivo, nombreClase);
                   p.add(usu);
          
       
       salto=salto+110;
           }
       
       }catch(IOException e){
           System.out.println("Error login");
           e.printStackTrace();
       }
        
        
        return p;
    }

    @Override
    public Profesor login(String correo, String contrasena) {
         try{
           int salto=81;
         
          
           while(salto<=archivo.length()){
                archivo.seek(salto);
                
       String cedulaArchivo = archivo.readUTF();
             
       String contrasenaArchivo=archivo.readUTF();
         
       if(correo.equals(cedulaArchivo.trim())&&contrasena.equals(contrasenaArchivo.trim())){
          salto=salto-81;
          archivo.seek(salto);
           String apellidoArchivo = archivo.readUTF();
           String nombreArchivo = archivo.readUTF();
           String nombreClase = archivo.readUTF();
           
        
           Profesor usu=new Profesor(nombreArchivo, apellidoArchivo, cedulaArchivo, contrasena, nombreClase);
                   return usu;
          
       }
       salto=salto+110;
           }
       
       }catch(IOException e){
           System.out.println("Error login");
           e.printStackTrace();
       }
        
        return null;
    }
    
}
