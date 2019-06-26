package mavens.libreria;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mavens.libreria.EstadosExistencias;
import mavens.libreria.Libros;
import mavens.libreria.Prestamos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-25T20:50:53")
@StaticMetamodel(LibrosExistencias.class)
public class LibrosExistencias_ { 

    public static volatile SingularAttribute<LibrosExistencias, Libros> librosIdLibro;
    public static volatile ListAttribute<LibrosExistencias, Prestamos> prestamosList;
    public static volatile SingularAttribute<LibrosExistencias, Integer> idExistencia;
    public static volatile ListAttribute<LibrosExistencias, EstadosExistencias> estadosExistenciasList;

}