package com.emkt.entityclasses;

import com.emkt.entityclasses.Cita;
import com.emkt.entityclasses.Persona;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-09T14:16:37")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Integer> codigo;
    public static volatile CollectionAttribute<Cliente, Cita> citaCollection;
    public static volatile SingularAttribute<Cliente, Persona> fkPersona;
    public static volatile SingularAttribute<Cliente, Integer> idCliente;

}