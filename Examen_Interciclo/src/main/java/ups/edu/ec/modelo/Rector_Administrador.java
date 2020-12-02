package ups.edu.ec.modelo;

import java.util.Objects;

       

public class Rector_Administrador {

 private String nombre;
 private String apellido;
 private String cargo;
 private String contrasena;

 private String cedula;

    public Rector_Administrador(String nombre, String apellido, String cargo, String contrasena, String cedula) {
        this.setNombre(nombre);
        this.setCedula(cedula);
        this.setApellido(apellido);
        this.setCargo(cargo);
        this.setContrasena(contrasena);
       
        
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula=validarEspacios(cedula, 10);
        
    }

 
 
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = validarEspacios(nombre, 25);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = validarEspacios(apellido, 25);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = validarEspacios(cargo, 15);
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena=validarEspacios(contrasena, 10);
    }

  

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.cedula);
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
        final Rector_Administrador other = (Rector_Administrador) obj;
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", cargo=" + cargo + ", contrasena=" + contrasena +  ", cedula=" + cedula + '}';
    }
 
 public String validarEspacios(String cadena,int lon){
        if(cadena.length()==lon){
            return cadena;
        }
        else{
            if(cadena.length()<lon){
            return llenarEspacios(cadena, lon);
        }else{
                return  cortarEspacios(cadena, lon);
            }
        }
    }
 public String llenarEspacios(String cadena, int lon){
        return String.format("%-"+lon+"s", cadena);
    }
 public String cortarEspacios(String cadena, int lon){
        return cadena.substring(0,lon);
    }
}
