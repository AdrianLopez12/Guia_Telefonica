package ups.edu.ec.modelo;

import java.util.Objects;
import ups.edu.ec.interfaces.EstadoPersona;
import ups.edu.ec.stados.Casado;
import ups.edu.ec.stados.Divorciado;
import ups.edu.ec.stados.Soltero;

public class Persona {
    private String nombre;
    private String apellido;
    private String cedula;
    private String direccionPer;
    private String genero;
    private String fechaNaci;
    private String cargo;
    private EstadoPersona estadoPersona;
  

    public Persona(String nombre, String apellido, String cedula, String direccionPer, String genero, String fechaNaci, String cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccionPer = direccionPer;
        this.genero = genero;
        this.fechaNaci = fechaNaci;
        this.cargo = cargo;
        estadoPersona=new Soltero();
    }
    

    public Persona() {
    }

    public void casado(){
        estadoPersona=new Casado();
    }
    public void divorciado(){
        estadoPersona=new Divorciado();
    }
    public void Soltero(){
        estadoPersona=new Soltero();
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccionPer() {
        return direccionPer;
    }

    public void setDireccionPer(String direccionPer) {
        this.direccionPer = direccionPer;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFechaNaci() {
        return fechaNaci;
    }

    public void setFechaNaci(String fechaNaci) {
        this.fechaNaci = fechaNaci;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.cedula);
        return hash;
    }

    public EstadoPersona getEstadoPersona() {
        return estadoPersona;
    }

    public void setEstadoPersona(EstadoPersona estadoPersona) {
        this.estadoPersona = estadoPersona;
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
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", direccionPer=" + direccionPer + ", genero=" + genero + ", fechaNaci=" + fechaNaci + ", cargo=" + cargo + ", estadoPersona=" + estadoPersona.Estadop(this) + '}'+"\n\n";
    }

    
    
    
    
    
}
