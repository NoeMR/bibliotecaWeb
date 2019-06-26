package mavens.libreria;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mavens.libreria.Libros;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-25T20:50:53")
@StaticMetamodel(Paises.class)
public class Paises_ { 

    public static volatile SingularAttribute<Paises, Integer> idPais;
    public static volatile ListAttribute<Paises, Libros> librosList;
    public static volatile SingularAttribute<Paises, String> pais;

}