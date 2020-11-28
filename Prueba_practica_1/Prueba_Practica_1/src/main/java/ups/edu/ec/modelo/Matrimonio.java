package ups.edu.ec.modelo;
import java.util.List;
import java.util.Objects;
public class Matrimonio {
    private String fecha;
    private String lugar;
    private Persona casante1;
    private Persona casante2;
    private Persona tetigo1;
    private Persona testigo2;
    private Persona juez;

    public Matrimonio(String fecha, String lugar, Persona casante1, Persona casante2, Persona tetigo1, Persona testigo2, Persona juez) {
        this.fecha = fecha;
        this.lugar = lugar;
        this.casante1 = casante1;
        this.casante2 = casante2;
        this.tetigo1 = tetigo1;
        this.testigo2 = testigo2;
        this.juez = juez;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Persona getCasante1() {
        return casante1;
    }

    public void setCasante1(Persona casante1) {
        this.casante1 = casante1;
    }

    public Persona getCasante2() {
        return casante2;
    }

    public void setCasante2(Persona casante2) {
        this.casante2 = casante2;
    }

    public Persona getTetigo1() {
        return tetigo1;
    }

    public void setTetigo1(Persona tetigo1) {
        this.tetigo1 = tetigo1;
    }

    public Persona getTestigo2() {
        return testigo2;
    }

    public void setTestigo2(Persona testigo2) {
        this.testigo2 = testigo2;
    }

    public Persona getJuez() {
        return juez;
    }

    public void setJuez(Persona juez) {
        this.juez = juez;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.fecha);
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
        final Matrimonio other = (Matrimonio) obj;
        if (!Objects.equals(this.fecha, other.fecha)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Matrimonio{" + "fecha=" + fecha + ", lugar=" + lugar + ", casante1=" + casante1 + ", casante2=" + casante2 + ", tetigo1=" + tetigo1 + ", testigo2=" + testigo2 + ", juez=" + juez + '}';
    }

    

  
    
    
    
}
