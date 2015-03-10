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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Developer Hector
 */
@Entity
@Table(name = "salon.telefono")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Telefono.findAll", query = "SELECT t FROM Telefono t"),
    @NamedQuery(name = "Telefono.findByIdTel", query = "SELECT t FROM Telefono t WHERE t.idTel = :idTel"),
    @NamedQuery(name = "Telefono.findByTipo", query = "SELECT t FROM Telefono t WHERE t.tipo = :tipo"),
    @NamedQuery(name = "Telefono.findByNumero", query = "SELECT t FROM Telefono t WHERE t.numero = :numero")})
public class Telefono implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tel")
    private Integer idTel;
    @Size(max = 10)
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero")
    private int numero;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkTelefono")
    private Collection<Persona> personaCollection;

    public Telefono() {
    }

    public Telefono(Integer idTel) {
        this.idTel = idTel;
    }

    public Telefono(Integer idTel, int numero) {
        this.idTel = idTel;
        this.numero = numero;
    }

    public Integer getIdTel() {
        return idTel;
    }

    public void setIdTel(Integer idTel) {
        this.idTel = idTel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @XmlTransient
    public Collection<Persona> getPersonaCollection() {
        return personaCollection;
    }

    public void setPersonaCollection(Collection<Persona> personaCollection) {
        this.personaCollection = personaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTel != null ? idTel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Telefono)) {
            return false;
        }
        Telefono other = (Telefono) object;
        if ((this.idTel == null && other.idTel != null) || (this.idTel != null && !this.idTel.equals(other.idTel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.emkt.entityclasses.Telefono[ idTel=" + idTel + " ]";
    }
    
}
