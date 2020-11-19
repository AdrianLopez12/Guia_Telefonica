package ups.edu.ec.modelo;

public class Tienda {
String nombre;
String  direccion;
Vendedor vendedor;

    public Tienda() {
        this.vendedor = new Vendedor();
    }

    

public void atiende(Persona persona){
    System.out.println(persona.getNombre()+" Ingresa a la fila");
    vendedor.atiende(persona);
}
public void suspendeVentanilla(){
    
    vendedor.suspende();
}
public void CierraVentanilla(){
    vendedor.cerrar();
}
public void AbrirVentanilla(){
    vendedor.abrir();
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }


}
