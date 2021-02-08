package ups.edu.ec.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ups.edu.ec.modelo.Juegos;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-02-02T17:35:02")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Integer> dinero;
    public static volatile SingularAttribute<Cliente, String> cedula;
    public static volatile SingularAttribute<Cliente, String> apellido;
    public static volatile SingularAttribute<Cliente, Long> id;
    public static volatile SingularAttribute<Cliente, String> sexo;
    public static volatile SingularAttribute<Cliente, String> nombre;
    public static volatile ListAttribute<Cliente, Juegos> Listajuegos;

}