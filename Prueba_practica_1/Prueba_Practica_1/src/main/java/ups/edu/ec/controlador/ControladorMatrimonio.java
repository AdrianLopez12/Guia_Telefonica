package ups.edu.ec.controlador;
import java.util.List;
import ups.edu.ec.generica.AbstractControler;
import ups.edu.ec.modelo.*;
public class ControladorMatrimonio extends AbstractControler<Matrimonio>{

    @Override
    public boolean validarObjeto(Matrimonio E) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public Matrimonio validarPorCedula(String cedula, String cedula2){
        List<Matrimonio>m=getLista();
        for (int i = 0; i < m.size(); i++) {
            if(m.get(i).getCasante1().getCedula().equalsIgnoreCase(cedula)||m.get(i).getCasante1().getCedula().equalsIgnoreCase(cedula2)){
               if(m.get(i).getCasante2().getCedula().equalsIgnoreCase(cedula)||m.get(i).getCasante2().getCedula().equalsIgnoreCase(cedula2)){
               return m.get(i);
            }
            }
                
        }
        return null;
    }
        
    
    
}
