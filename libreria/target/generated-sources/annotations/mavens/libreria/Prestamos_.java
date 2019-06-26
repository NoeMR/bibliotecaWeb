package mavens.libreria;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mavens.libreria.LibrosExistencias;
import mavens.libreria.TiposPrestamos;
import mavens.libreria.Usuarios;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-23T18:59:24")
@StaticMetamodel(Prestamos.class)
public class Prestamos_ { 

    public static volatile ListAttribute<Prestamos, TiposPrestamos> tiposPrestamosList;
    public static volatile SingularAttribute<Prestamos, Usuarios> usuariosIdUsuario;
    public static volatile SingularAttribute<Prestamos, Date> fechaPrestamo;
    public static volatile SingularAttribute<Prestamos, LibrosExistencias> librosExistenciasIdExistencia;
    public static volatile SingularAttribute<Prestamos, Date> fechaDevolución;
    public static volatile SingularAttribute<Prestamos, Integer> idPrestamo;

}