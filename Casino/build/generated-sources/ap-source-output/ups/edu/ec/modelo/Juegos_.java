package ups.edu.ec.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ups.edu.ec.modelo.Cliente;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-02-02T17:35:02")
@StaticMetamodel(Juegos.class)
public class Juegos_ { 

    public static volatile SingularAttribute<Juegos, String> numeroGanador;
    public static volatile SingularAttribute<Juegos, Cliente> cliente;
    public static volatile SingularAttribute<Juegos, Integer> dineroJuego;
    public static volatile SingularAttribute<Juegos, String> nombreJuego;
    public static volatile SingularAttribute<Juegos, Long> id;

}