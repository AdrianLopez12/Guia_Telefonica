package ups.edu.ec.stados;
import ups.edu.ec.interfaces.EstadoPersona;
import ups.edu.ec.modelo.Persona;
public class Divorciado implements EstadoPersona{

    @Override
    public String Estadop(Persona persona) {
        return "Divorciado";
    }
    
}
