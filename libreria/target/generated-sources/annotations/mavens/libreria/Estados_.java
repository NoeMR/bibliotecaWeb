package mavens.libreria;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mavens.libreria.EstadosExistencias;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-23T18:59:24")
@StaticMetamodel(Estados.class)
public class Estados_ { 

    public static volatile SingularAttribute<Estados, Integer> idEstado;
    public static volatile SingularAttribute<Estados, String> estado;
    public static volatile ListAttribute<Estados, EstadosExistencias> estadosExistenciasList;

}