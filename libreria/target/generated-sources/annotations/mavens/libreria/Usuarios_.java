package mavens.libreria;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mavens.libreria.Prestamos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-25T20:50:53")
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile SingularAttribute<Usuarios, String> teléfono;
    public static volatile SingularAttribute<Usuarios, String> dirección;
    public static volatile ListAttribute<Usuarios, Prestamos> prestamosList;
    public static volatile SingularAttribute<Usuarios, Integer> idUsuario;
    public static volatile SingularAttribute<Usuarios, String> apellido;
    public static volatile SingularAttribute<Usuarios, String> dui;
    public static volatile SingularAttribute<Usuarios, String> nombre;

}