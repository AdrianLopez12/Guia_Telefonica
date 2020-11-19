package ups.edu.ec.Main;
import ups.edu.ec.modelo.*;
public class Main {
    public static void main(String[] args) {
        Persona persona1=new Persona("p1", "APE1", "0123456789", 19, 1);
        Persona persona2=new Persona("P2", "APE2", "0123456789", 20, 2);
        Persona persona3=new Persona("P3", "APE3", "0123456789", 20, 3);
    
       
Tienda tienda=new Tienda();
tienda.atiende(persona1);

tienda.suspendeVentanilla();
        
tienda.atiende(persona2);
tienda.atiende(persona3);

tienda.CierraVentanilla();

tienda.atiende(persona1);

        
    }
    
}
