package ups.edu.ec.controlador;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.*;
import ups.edu.ec.AbstractControler.AbstractControler;
import ups.edu.ec.modelo.Actividades;
import ups.edu.ec.dao.*;
public class ControladorActividades extends AbstractControler<Actividades>{
IDaoActividades actividadesDao;

    public ControladorActividades(ActividadesDao actividadesDao) {
    this.actividadesDao=actividadesDao;
    }
public Set<String> obtenerUrlGoogle(String paginaTexto){
    Set<String> resultado=new HashSet();
    corpus=patron.matcher(paginaTexto);
        
        while(corpus.find()){
            for (int i = 0; i < corpus.groupCount(); i++) {
                resultado.add(corpus.group(i));
            }
        }
    
    return resultado;
}


    @Override
    public boolean validarObjeto(Actividades objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void crear(String nombreClase , String nombreActividad){
        Actividades ac=new Actividades(nombreActividad, nombreClase);
        actividadesDao.create(ac);
    }
    
    public List<String> obtenerNombresPropios(String texto){
        List<String> resultado=new ArrayList();
        corpus=patron.matcher(texto);
        
        while(corpus.find()){
            for (int i = 0; i < corpus.groupCount(); i++) {
                resultado.add(corpus.group(i));
            }
        }
        return resultado;
    }
    
    private Pattern patron;
    private Matcher corpus;
    
    public void ingresarRgex(String regex){
        patron=Pattern.compile(regex);
        
    }
    public boolean validar(String texto){
        corpus=patron.matcher(texto);
        return corpus.find();
    }

    public Pattern getPatron() {
        return patron;
    }

    public void setPatron(Pattern patron) {
        this.patron = patron;
    }

    public Matcher getCorpus() {
        return corpus;
    }

    public void setCorpus(Matcher corpus) {
        this.corpus = corpus;
    }
    
}
