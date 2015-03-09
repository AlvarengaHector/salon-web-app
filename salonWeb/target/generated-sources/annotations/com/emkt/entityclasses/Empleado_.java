package com.emkt.entityclasses;

import com.emkt.entityclasses.Cita;
import com.emkt.entityclasses.Horario;
import com.emkt.entityclasses.Persona;
import com.emkt.entityclasses.Servicio;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-09T14:16:37")
@StaticMetamodel(Empleado.class)
public class Empleado_ { 

    public static volatile SingularAttribute<Empleado, Integer> codigo;
    public static volatile CollectionAttribute<Empleado, Cita> citaCollection;
    public static volatile SingularAttribute<Empleado, Horario> fkHorario;
    public static volatile SingularAttribute<Empleado, Integer> idEmpleado;
    public static volatile SingularAttribute<Empleado, Persona> fkPersona;
    public static volatile SingularAttribute<Empleado, Servicio> fkServicio;

}