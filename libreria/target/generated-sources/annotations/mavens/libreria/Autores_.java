package mavens.libreria;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mavens.libreria.LibrosAutores;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-25T20:50:53")
@StaticMetamodel(Autores.class)
public class Autores_ { 

    public static volatile SingularAttribute<Autores, Integer> idAutor;
    public static volatile CollectionAttribute<Autores, LibrosAutores> librosAutores;
    public static volatile SingularAttribute<Autores, String> autor;

}