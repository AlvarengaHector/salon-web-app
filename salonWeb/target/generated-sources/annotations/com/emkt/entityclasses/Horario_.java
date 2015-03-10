package com.emkt.entityclasses;

import com.emkt.entityclasses.Empleado;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-10T16:33:00")
@StaticMetamodel(Horario.class)
public class Horario_ { 

    public static volatile SingularAttribute<Horario, Integer> idHorario;
    public static volatile SingularAttribute<Horario, String> tipo;
    public static volatile CollectionAttribute<Horario, Empleado> empleadoCollection;
    public static volatile SingularAttribute<Horario, String> diaLibre;
    public static volatile SingularAttribute<Horario, Date> hFin;
    public static volatile SingularAttribute<Horario, Date> hInicio;

}