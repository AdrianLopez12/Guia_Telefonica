package ups.edu.ec.modelo;

import java.util.Objects;

public class Profesor {
private String nombre ; //27
private String apellido ; //27
private String cedula; //12
private String contrasena; // 17
private String nombreClase; //27

    public Profesor(String nombre, String apellido, String cedula, String contrasena, String nombreClase) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setCedula(cedula);
        this.setContrasena(contrasena);
        this.setNombreClase(nombreClase);
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = validarEspacios(contrasena, 15);
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = validarEspacios(nombreClase, 25);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.cedula);
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
        final Profesor other = (Profesor) obj;
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Profesor{" + "nombre=" + nombre.trim() + ", apellido=" + apellido.trim() + ", cedula=" + cedula.trim() + ", contrasena=" + contrasena.trim() + ", nombreClase=" + nombreClase.trim() +"\n"+ '}';
    }


}
