package ups.edu.ec.controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import ups.edu.ec.modelo.Cliente;
public class ControladorCliente extends AbstractControler<Cliente>  {

    
    
    
    public Cliente busccarPorCedula(String cedula){
  
        List<Cliente> cli=buscartodo();
  
        for (Cliente cliente : cli) {
            if(cliente.getCedula().equalsIgnoreCase(cedula)){
                return cliente;
            }
        }
        return null;
        
    }

}
