package ups.edu.ec.controlador;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import ups.edu.ec.modelo.Juegos;

public class ControladorJuegos extends AbstractControler<Juegos> {
   public DefaultTableModel ListarJuegos(String cedula){
       DefaultTableModel tabla=new DefaultTableModel();
       List<Juegos>ListaJuegos=buscartodo();
       tabla.addColumn("Juego ganado");
        tabla.addColumn("Jugador");
        tabla.addColumn("Dinero jugador");
       for (Juegos ListaJuego : ListaJuegos) {
           
           if(ListaJuego.getCliente()==null){
               
           }else{
             
               if(ListaJuego.getCliente().getCedula().equalsIgnoreCase(cedula)){
           
                tabla.addRow(new Object[]{ListaJuego.getNombreJuego(),ListaJuego.getCliente().getNombre(),ListaJuego.getCliente().getDinero()});
               
           }
           }
           
       }
       
       
       return tabla;
   }
    
    
}
