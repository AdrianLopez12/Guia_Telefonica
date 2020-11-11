package ups.edu.ec.controlador;

import java.util.ArrayList;
import java.util.List;
import ups.edu.ec.modelo.*;

public class ControladorTelefono extends AbstractControler<Telefono>{
    
    public List<Telefono> ListarPorUsuario(int idUsuario){
        List<Telefono>telf=getLista();
        List<Telefono> resp=new ArrayList();
        for (int i = 0; i < telf.size(); i++) {
            if(telf.get(i).getPropietario().getId()==idUsuario){
                resp.add(telf.get(i));
            }
        }
        return resp;
    }
    public Persona BuscarDueno(int idtelf){
        List<Telefono>telf=getLista();
        for (int i = 0; i < telf.size(); i++) {
            if(telf.get(i).getPropietario().getId()==idtelf){
                return telf.get(i).getPropietario();
            }
        }
    return null;
    }
    
    
    
}
