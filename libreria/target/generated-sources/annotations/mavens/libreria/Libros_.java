package mavens.libreria;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mavens.libreria.Editoriales;
import mavens.libreria.LibrosAutores;
import mavens.libreria.LibrosCategoria;
import mavens.libreria.LibrosExistencias;
import mavens.libreria.Paises;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-23T18:59:24")
@StaticMetamodel(Libros.class)
public class Libros_ { 

    public static volatile SingularAttribute<Libros, Editoriales> editorialesIdEditorial;
    public static volatile SingularAttribute<Libros, Integer> idLibro;
    public static volatile SingularAttribute<Libros, Paises> paisesIdPais;
    public static volatile SingularAttribute<Libros, String> isbn;
    public static volatile SetAttribute<Libros, LibrosCategoria> librosCategoria;
    public static volatile SingularAttribute<Libros, String> titulo;
    public static volatile CollectionAttribute<Libros, LibrosAutores> librosAutores;
    public static volatile ListAttribute<Libros, LibrosExistencias> librosExistenciasList;

}