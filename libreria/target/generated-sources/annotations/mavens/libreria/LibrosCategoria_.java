package mavens.libreria;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mavens.libreria.Categoria;
import mavens.libreria.Libros;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-23T18:59:24")
@StaticMetamodel(LibrosCategoria.class)
public class LibrosCategoria_ { 

    public static volatile SingularAttribute<LibrosCategoria, Integer> idLibrosCategoria;
    public static volatile SingularAttribute<LibrosCategoria, Categoria> categoriaIdCategoria;
    public static volatile SingularAttribute<LibrosCategoria, Libros> librosIdLibro;

}