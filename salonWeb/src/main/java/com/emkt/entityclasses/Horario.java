/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emkt.entityclasses;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Developer Hector
 */
@Entity
@Table(name = "salon.horario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Horario.findAll", query = "SELECT h FROM Horario h"),
    @NamedQuery(name = "Horario.findByIdHorario", query = "SELECT h FROM Horario h WHERE h.idHorario = :idHorario"),
    @NamedQuery(name = "Horario.findByTipo", query = "SELECT h FROM Horario h WHERE h.tipo = :tipo"),
    @NamedQuery(name = "Horario.findByHInicio", query = "SELECT h FROM Horario h WHERE h.hInicio = :hInicio"),
    @NamedQuery(name = "Horario.findByHFin", query = "SELECT h FROM Horario h WHERE h.hFin = :hFin"),
    @NamedQuery(name = "Horario.findByDiaLibre", query = "SELECT h FROM Horario h WHERE h.diaLibre = :diaLibre")})
public class Horario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_horario")
    private Integer idHorario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "h_inicio")
    @Temporal(TemporalType.TIME)
    private Date hInicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "h_fin")
    @Temporal(TemporalType.TIME)
    private Date hFin;
    @Size(max = 20)
    @Column(name = "dia_libre")
    private String diaLibre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkHorario")
    private Collection<Empleado> empleadoCollection;

    public Horario() {
    }

    public Horario(Integer idHorario) {
        this.idHorario = idHorario;
    }

    public Horario(Integer idHorario, String tipo, Date hInicio, Date hFin) {
        this.idHorario = idHorario;
        this.tipo = tipo;
        this.hInicio = hInicio;
        this.hFin = hFin;
    }

    public Integer getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(Integer idHorario) {
        this.idHorario = idHorario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getHInicio() {
        return hInicio;
    }

    public void setHInicio(Date hInicio) {
        this.hInicio = hInicio;
    }

    public Date getHFin() {
        return hFin;
    }

    public void setHFin(Date hFin) {
        this.hFin = hFin;
    }

    public String getDiaLibre() {
        return diaLibre;
    }

    public void setDiaLibre(String diaLibre) {
        this.diaLibre = diaLibre;
    }

    @XmlTransient
    public Collection<Empleado> getEmpleadoCollection() {
        return empleadoCollection;
    }

    public void setEmpleadoCollection(Collection<Empleado> empleadoCollection) {
        this.empleadoCollection = empleadoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHorario != null ? idHorario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Horario)) {
            return false;
        }
        Horario other = (Horario) object;
        if ((this.idHorario == null && other.idHorario != null) || (this.idHorario != null && !this.idHorario.equals(other.idHorario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.emkt.salonweb.Horario[ idHorario=" + idHorario + " ]";
    }
    
}
