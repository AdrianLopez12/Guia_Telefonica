package ups.edu.ec.dao;

import ups.edu.ec.modelo.Actividades;
import java.util.List;

public interface IDaoActividades {
    public void create (Actividades Persona);
    public Actividades read(String cedula);
    public void update(Actividades Persona);
    public void delete(Actividades Persona);
    public List<Actividades> findAll();
    public Actividades login(String correo, String contrasena);
}
