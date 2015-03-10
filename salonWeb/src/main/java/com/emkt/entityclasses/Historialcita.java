/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emkt.entityclasses;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Developer Hector
 */
@Entity
@Table(name = "salon.historialcita")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Historialcita.findAll", query = "SELECT h FROM Historialcita h"),
    @NamedQuery(name = "Historialcita.findByIdHc", query = "SELECT h FROM Historialcita h WHERE h.idHc = :idHc")})
public class Historialcita implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_hc")
    private Integer idHc;
    @JoinColumn(name = "fk_cita", referencedColumnName = "id_cita")
    @ManyToOne(optional = false)
    private Cita fkCita;

    public Historialcita() {
    }

    public Historialcita(Integer idHc) {
        this.idHc = idHc;
    }

    public Integer getIdHc() {
        return idHc;
    }

    public void setIdHc(Integer idHc) {
        this.idHc = idHc;
    }

    public Cita getFkCita() {
        return fkCita;
    }

    public void setFkCita(Cita fkCita) {
        this.fkCita = fkCita;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHc != null ? idHc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Historialcita)) {
            return false;
        }
        Historialcita other = (Historialcita) object;
        if ((this.idHc == null && other.idHc != null) || (this.idHc != null && !this.idHc.equals(other.idHc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.emkt.entityclasses.Historialcita[ idHc=" + idHc + " ]";
    }
    
}
