package com.emkt.entityclasses;

import com.emkt.entityclasses.Empleado;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-10T16:33:00")
@StaticMetamodel(Servicio.class)
public class Servicio_ { 

    public static volatile SingularAttribute<Servicio, Date> tiempo;
    public static volatile CollectionAttribute<Servicio, Empleado> empleadoCollection;
    public static volatile SingularAttribute<Servicio, Integer> idServicio;
    public static volatile SingularAttribute<Servicio, String> cargo;

}