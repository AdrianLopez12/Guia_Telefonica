package ups.edu.ec.dao;
import java.util.List;
import ups.edu.ec.modelo.Rector_Administrador;
import java.io.IOException;
import java.io.RandomAccessFile;


public class PersonaDao implements IDaoPersona{
    
    private RandomAccessFile archivo;
    
    public PersonaDao(){
        try{
          archivo=new RandomAccessFile("Persona.dat","rw");  
        }catch(IOException e){
            System.out.println("Error de lectura y escritura");
            e.printStackTrace();
        }
    }

    @Override
    public void create(Rector_Administrador Persona) {
        try{
         
    archivo.seek(archivo.length());
            
    
    
    archivo.writeUTF(Persona.getApellido());
    archivo.writeUTF(Persona.getCargo());
    archivo.writeUTF(Persona.getNombre());
    archivo.writeUTF(Persona.getCedula());
    archivo.writeUTF(Persona.getContrasena());
        }catch(IOException e){
            System.out.println("Error de lectura y escritura");
            e.printStackTrace();;
        }
    }

    @Override
    public Rector_Administrador read(String cedula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Rector_Administrador Persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Rector_Administrador Persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Rector_Administrador> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Rector_Administrador login(String correo, String contrasena) {
         try{
           int salto=71;
         
          
           while(salto<=archivo.length()){
                archivo.seek(salto);
                
       String cedulaArchivo = archivo.readUTF();
               System.out.println(cedulaArchivo);
       String contrasenaArchivo=archivo.readUTF();
               System.out.println(contrasenaArchivo);
       if(correo.equals(cedulaArchivo.trim())&&contrasena.equals(contrasenaArchivo.trim())){
          salto=salto-71;
          archivo.seek(salto);
           String apellidoArchivo = archivo.readUTF();
           String cargoArchivo = archivo.readUTF();
        
           String nombreArchivo = archivo.readUTF();
        
           Rector_Administrador usu=new Rector_Administrador(nombreArchivo, apellidoArchivo, cargoArchivo, contrasenaArchivo, cedulaArchivo);
                   return usu;
          
       }
       salto=salto+95;
           }
       
       }catch(IOException e){
           System.out.println("Error login");
           e.printStackTrace();
       }
        
        return null;
    }
    
}
