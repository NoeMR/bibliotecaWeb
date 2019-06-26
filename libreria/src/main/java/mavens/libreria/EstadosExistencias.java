/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavens.libreria;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
 * @author Ferna
 */
@Entity
@Table(name = "estados_existencias", catalog = "biblioteca", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadosExistencias.findAll", query = "SELECT e FROM EstadosExistencias e")
    , @NamedQuery(name = "EstadosExistencias.findByIdEstadosExistencias", query = "SELECT e FROM EstadosExistencias e WHERE e.idEstadosExistencias = :idEstadosExistencias")})
public class EstadosExistencias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_estados_existencias", nullable = false)
    private Integer idEstadosExistencias;
    @JoinColumn(name = "estados_id_estado", referencedColumnName = "id_estado", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Estados estadosIdEstado;
    @JoinColumn(name = "libros_existencias_id_existencia", referencedColumnName = "id_existencia", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private LibrosExistencias librosExistenciasIdExistencia;

    public EstadosExistencias() {
    }

    public EstadosExistencias(Integer idEstadosExistencias) {
        this.idEstadosExistencias = idEstadosExistencias;
    }

    public Integer getIdEstadosExistencias() {
        return idEstadosExistencias;
    }

    public void setIdEstadosExistencias(Integer idEstadosExistencias) {
        this.idEstadosExistencias = idEstadosExistencias;
    }

    public Estados getEstadosIdEstado() {
        return estadosIdEstado;
    }

    public void setEstadosIdEstado(Estados estadosIdEstado) {
        this.estadosIdEstado = estadosIdEstado;
    }

    public LibrosExistencias getLibrosExistenciasIdExistencia() {
        return librosExistenciasIdExistencia;
    }

    public void setLibrosExistenciasIdExistencia(LibrosExistencias librosExistenciasIdExistencia) {
        this.librosExistenciasIdExistencia = librosExistenciasIdExistencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstadosExistencias != null ? idEstadosExistencias.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadosExistencias)) {
            return false;
        }
        EstadosExistencias other = (EstadosExistencias) object;
        if ((this.idEstadosExistencias == null && other.idEstadosExistencias != null) || (this.idEstadosExistencias != null && !this.idEstadosExistencias.equals(other.idEstadosExistencias))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mavens.libreria.EstadosExistencias[ idEstadosExistencias=" + idEstadosExistencias + " ]";
    }
    
}
