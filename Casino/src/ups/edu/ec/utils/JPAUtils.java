package ups.edu.ec.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtils {
    
    private static final EntityManagerFactory emf= Persistence.createEntityManagerFactory("CasinoPU");
    
    public static  EntityManager getEntityManager(){
        
        return emf.createEntityManager();
}
    
    
}
