package com.emkt.entityclasses;

import com.emkt.entityclasses.Cita;
import com.emkt.entityclasses.Persona;
import com.emkt.entityclasses.Rol;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-09T14:16:37")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile CollectionAttribute<Usuario, Cita> citaCollection;
    public static volatile SingularAttribute<Usuario, String> estado;
    public static volatile SingularAttribute<Usuario, Integer> idUs;
    public static volatile SingularAttribute<Usuario, String> usuario;
    public static volatile SingularAttribute<Usuario, Persona> fkPersona;
    public static volatile SingularAttribute<Usuario, Rol> fkRol;
    public static volatile SingularAttribute<Usuario, String> password;

}