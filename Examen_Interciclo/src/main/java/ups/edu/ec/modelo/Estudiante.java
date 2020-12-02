package ups.edu.ec.modelo;

import java.util.Objects;

public class Estudiante {
    
    private String nombre;
    private String apellido;
    private String cedula;
    private String nombreClase;

    public Estudiante(String nombre, String apellido, String cedula, String nombreClase) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setCedula(cedula);
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
    public Estudiante() {
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
         this.cedula = validarEspacios(cedula, 10);
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
         this.nombreClase = validarEspacios(nombreClase, 15);
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Estudiante other = (Estudiante) obj;
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre.trim() + ", apellido=" + apellido.trim() + ", cedula=" + cedula.trim() + ", nombreClase=" + nombreClase.trim()+"\n"+ '}';
    }
    
}
