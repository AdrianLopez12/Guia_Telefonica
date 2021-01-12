package ups.edu.ec.controlador;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import ups.edu.ec.modelo.Filosofo;
public class ControladorFilosofo {
    public Filosofo filosofo;
    public void create(int id,JLabel izquierdo, JLabel derecho,JButton filosofoB,JLabel resultado, JTextArea textArea, int numeroveces){
        filosofo=new Filosofo(id,  izquierdo , derecho, filosofoB, resultado, textArea,numeroveces);
    }
    
 
    
    
}
