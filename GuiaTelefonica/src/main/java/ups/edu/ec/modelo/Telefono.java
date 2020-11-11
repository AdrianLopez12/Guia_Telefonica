package ups.edu.ec.modelo;

public class Telefono {
  private int id;
private String operadora;
private String numero;
private Persona propietario;
    public Telefono() {
    }

    public Telefono(int id, String operadora, String numero, Persona propietario) {
        this.id = id;
        this.operadora = operadora;
        this.numero = numero;
        this.propietario = propietario;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id;
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
        final Telefono other = (Telefono) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Telefono{" + "id=" + id + ", operadora=" + operadora + ", numero=" + numero + ", propietario=" + propietario + '}';
    }

   


}
