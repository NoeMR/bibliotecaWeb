package mavens.libreria;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mavens.libreria.Libros;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-25T20:50:53")
@StaticMetamodel(Editoriales.class)
public class Editoriales_ { 

    public static volatile SingularAttribute<Editoriales, String> editorial;
    public static volatile ListAttribute<Editoriales, Libros> librosList;
    public static volatile SingularAttribute<Editoriales, Integer> idEditorial;

}