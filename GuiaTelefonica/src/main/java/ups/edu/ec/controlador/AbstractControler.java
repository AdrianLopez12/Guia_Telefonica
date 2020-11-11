package ups.edu.ec.controlador;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractControler<E> {
    
    private List<E> lista;
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
         if(index>0){
         lista.set(index, objeto);     
        
         }
         
         return (index>0);
    }
    
}