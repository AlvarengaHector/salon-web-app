/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emkt.entityclasses;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Developer Hector
 */
@Entity
@Table(name = "salon.empleado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e"),
    @NamedQuery(name = "Empleado.findByIdEmpleado", query = "SELECT e FROM Empleado e WHERE e.idEmpleado = :idEmpleado"),
    @NamedQuery(name = "Empleado.findByCodigo", query = "SELECT e FROM Empleado e WHERE e.codigo = :codigo")})
public class Empleado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_empleado")
    private Integer idEmpleado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo")
    private int codigo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkEmpleado")
    private Collection<Cita> citaCollection;
    @JoinColumn(name = "fk_servicio", referencedColumnName = "id_servicio")
    @ManyToOne(optional = false)
    private Servicio fkServicio;
    @JoinColumn(name = "fk_persona", referencedColumnName = "id_per")
    @ManyToOne(optional = false)
    private Persona fkPersona;
    @JoinColumn(name = "fk_horario", referencedColumnName = "id_horario")
    @ManyToOne(optional = false)
    private Horario fkHorario;

    public Empleado() {
    }

    public Empleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Empleado(Integer idEmpleado, int codigo) {
        this.idEmpleado = idEmpleado;
        this.codigo = codigo;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @XmlTransient
    public Collection<Cita> getCitaCollection() {
        return citaCollection;
    }

    public void setCitaCollection(Collection<Cita> citaCollection) {
        this.citaCollection = citaCollection;
    }

    public Servicio getFkServicio() {
        return fkServicio;
    }

    public void setFkServicio(Servicio fkServicio) {
        this.fkServicio = fkServicio;
    }

    public Persona getFkPersona() {
        return fkPersona;
    }

    public void setFkPersona(Persona fkPersona) {
        this.fkPersona = fkPersona;
    }

    public Horario getFkHorario() {
        return fkHorario;
    }

    public void setFkHorario(Horario fkHorario) {
        this.fkHorario = fkHorario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpleado != null ? idEmpleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.idEmpleado == null && other.idEmpleado != null) || (this.idEmpleado != null && !this.idEmpleado.equals(other.idEmpleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.emkt.entityclasses.Empleado[ idEmpleado=" + idEmpleado + " ]";
    }
    
}
