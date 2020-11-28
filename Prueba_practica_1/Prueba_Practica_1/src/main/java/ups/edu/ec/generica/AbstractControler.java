package ups.edu.ec.generica;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractControler<E> {
    
    public List<E> lista;
    public AbstractControler(){
        lista=new ArrayList();
    }
    public boolean crear(E objeto)
    {
        return lista.add(objeto);
    }    
    public E buscar(E comparacion){
        return lista.stream().filter(objeto->objeto.equals(comparacion)).findFirst().get();
    }
    public boolean eliminar(E objeto){
        E objetoEliminar=buscar(objeto);
        return (objetoEliminar!=null)? lista.remove(objetoEliminar):false;
    }
    public int BuscarPocicion(E comparacion){
        
        for (int i = 0; i < lista.size(); i++) {
           E objeto=lista.get(i);
         
           if(objeto.equals(comparacion)){
               return i;
           }
           
        }
    return -1;
    }
    
    public boolean actualizar(E objeto){
         int index=BuscarPocicion(objeto);
        System.out.println(index);
         if(index>=0){
         lista.set(index, objeto);     
        
         }
         
         return (index>=0);
    }
    public List<E> getLista(){
        return lista;
    }
    public void setLista(List<E> lista){
        this.lista=lista;
    }
    public abstract boolean validarObjeto(E objeto);
    
}
