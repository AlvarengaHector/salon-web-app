package com.emkt.entityclasses;

import com.emkt.entityclasses.Persona;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-10T16:33:00")
@StaticMetamodel(Telefono.class)
public class Telefono_ { 

    public static volatile CollectionAttribute<Telefono, Persona> personaCollection;
    public static volatile SingularAttribute<Telefono, Integer> idTel;
    public static volatile SingularAttribute<Telefono, String> tipo;
    public static volatile SingularAttribute<Telefono, Integer> numero;

}