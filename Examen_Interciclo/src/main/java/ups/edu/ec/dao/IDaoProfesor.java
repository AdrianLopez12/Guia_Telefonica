package ups.edu.ec.dao;

import ups.edu.ec.modelo.Profesor;
import java.util.List;

public interface IDaoProfesor {
    public void create (Profesor Persona);
    public Profesor read(String cedula);
    public void update(Profesor Persona);
    public void delete(Profesor Persona);
    public List<Profesor> findAll();
    public Profesor login(String correo, String contrasena);
}
