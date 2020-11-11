package ups.edu.ec.modelo;

import java.util.List;

public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private String contrasena;


    public Persona() {
    }

    public Persona(int id, String nombre, String apellido, String contrasena, List<Telefono> telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasena = contrasena;
  
    }

    public Persona(int id, String nombre, String apellido, String contrasena) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasena = contrasena;
    }
    

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

   

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
            
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

 

 
    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", contrasena=" + contrasena + ", telefono=" + '}'+"\n";
    }

    
    
    
}
