package ups.edu.ec.controlador;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import ups.edu.ec.utils.JPAUtils;

public abstract class AbstractControler<E> {
    private List<E> lista;
    private Class<E> clase;
    private EntityManager em;

    public AbstractControler() {
        lista=new ArrayList();
        Type t=getClass().getGenericSuperclass();
        ParameterizedType pt=(ParameterizedType) t;
        clase=(Class) pt.getActualTypeArguments()[0];
        em=JPAUtils.getEntityManager();
    }
     public AbstractControler(EntityManager em) {
        lista=new ArrayList();   
        Type t=getClass().getGenericSuperclass();
        ParameterizedType pt=(ParameterizedType) t;
        clase=(Class) pt.getActualTypeArguments()[0];
        this.em=em;
    }
     public E crear(E objeto){
         em.getTransaction().begin();
         em.persist(objeto);
         em.getTransaction().commit();
         lista.add(objeto);
         return objeto;
     }
     public E eliminar(E objeto){
         em.getTransaction().begin();
         em.remove(em.merge(objeto));
         em.getTransaction().commit();
         lista.remove(objeto);
         return objeto;
     }
     public E actualizar(E objeto){
         em.getTransaction().begin();
         objeto=em.merge(objeto);
         em.getTransaction().commit();
         lista=this.buscartodo();
         return objeto;
     }
     public E buscar(Object id){
         return (E) em.find(clase, id);
     }
     public List<E> buscartodo(){
         return em.createQuery("Select t from "+clase.getSimpleName()+" t").getResultList();
     }

    public List<E> getLista() {
        return lista;
    }

    public void setLista(List<E> lista) {
        this.lista = lista;
    }

    public Class<E> getClase() {
        return clase;
    }

    public void setClase(Class<E> clase) {
        this.clase = clase;
    }

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    
}
