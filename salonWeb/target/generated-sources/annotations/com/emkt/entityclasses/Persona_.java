package com.emkt.entityclasses;

import com.emkt.entityclasses.Cliente;
import com.emkt.entityclasses.Empleado;
import com.emkt.entityclasses.Telefono;
import com.emkt.entityclasses.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-12T11:35:55")
@StaticMetamodel(Persona.class)
public class Persona_ { 

    public static volatile SingularAttribute<Persona, String> nombre;
    public static volatile SingularAttribute<Persona, String> apellido;
    public static volatile SingularAttribute<Persona, Integer> idPer;
    public static volatile SingularAttribute<Persona, Date> fnacimiento;
    public static volatile CollectionAttribute<Persona, Usuario> usuarioCollection;
    public static volatile SingularAttribute<Persona, Telefono> fkTelefono;
    public static volatile CollectionAttribute<Persona, Cliente> clienteCollection;
    public static volatile CollectionAttribute<Persona, Empleado> empleadoCollection;
    public static volatile SingularAttribute<Persona, String> correo;

}