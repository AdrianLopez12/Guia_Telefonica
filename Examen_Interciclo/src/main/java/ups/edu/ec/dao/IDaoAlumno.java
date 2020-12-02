package ups.edu.ec.dao;

import ups.edu.ec.modelo.Estudiante;
import java.util.List;

public interface IDaoAlumno {
    public void create (Estudiante Persona);
    public Estudiante read(String cedula);
    public void update(Estudiante Persona);
    public void delete(Estudiante Persona);
    public List<Estudiante> findAll();
    public Estudiante login(String correo, String contrasena);
}
