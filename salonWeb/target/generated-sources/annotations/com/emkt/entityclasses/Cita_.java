package com.emkt.entityclasses;

import com.emkt.entityclasses.Cliente;
import com.emkt.entityclasses.Empleado;
import com.emkt.entityclasses.Historialcita;
import com.emkt.entityclasses.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-12T11:35:55")
@StaticMetamodel(Cita.class)
public class Cita_ { 

    public static volatile SingularAttribute<Cita, Integer> idCita;
    public static volatile CollectionAttribute<Cita, Historialcita> historialcitaCollection;
    public static volatile SingularAttribute<Cita, String> estado;
    public static volatile SingularAttribute<Cita, Cliente> fkCliente;
    public static volatile SingularAttribute<Cita, Usuario> fkUsuario;
    public static volatile SingularAttribute<Cita, Empleado> fkEmpleado;
    public static volatile SingularAttribute<Cita, Date> citaFechaCreacion;

}