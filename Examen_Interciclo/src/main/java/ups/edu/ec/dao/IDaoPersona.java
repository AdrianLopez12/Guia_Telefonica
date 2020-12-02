package ups.edu.ec.dao;

import ups.edu.ec.modelo.Rector_Administrador;
import java.util.List;

public interface IDaoPersona {
    public void create (Rector_Administrador Persona);
    public Rector_Administrador read(String cedula);
    public void update(Rector_Administrador Persona);
    public void delete(Rector_Administrador Persona);
    public List<Rector_Administrador> findAll();
    public Rector_Administrador login(String correo, String contrasena);
}
