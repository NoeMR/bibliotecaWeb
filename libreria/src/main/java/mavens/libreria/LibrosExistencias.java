/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavens.libreria;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ferna
 */
@Entity
@Table(name = "libros_existencias", catalog = "biblioteca", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LibrosExistencias.findAll", query = "SELECT l FROM LibrosExistencias l")
    , @NamedQuery(name = "LibrosExistencias.findByIdExistencia", query = "SELECT l FROM LibrosExistencias l WHERE l.idExistencia = :idExistencia")})
public class LibrosExistencias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_existencia", nullable = false)
    private Integer idExistencia;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "librosExistenciasIdExistencia", fetch = FetchType.LAZY)
    private List<Prestamos> prestamosList;
    @JoinColumn(name = "libros_id_libro", referencedColumnName = "id_libro", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Libros librosIdLibro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "librosExistenciasIdExistencia", fetch = FetchType.LAZY)
    private List<EstadosExistencias> estadosExistenciasList;

    public LibrosExistencias() {
    }

    public LibrosExistencias(Integer idExistencia) {
        this.idExistencia = idExistencia;
    }

    public Integer getIdExistencia() {
        return idExistencia;
    }

    public void setIdExistencia(Integer idExistencia) {
        this.idExistencia = idExistencia;
    }

    @XmlTransient
    public List<Prestamos> getPrestamosList() {
        return prestamosList;
    }

    public void setPrestamosList(List<Prestamos> prestamosList) {
        this.prestamosList = prestamosList;
    }

    public Libros getLibrosIdLibro() {
        return librosIdLibro;
    }

    public void setLibrosIdLibro(Libros librosIdLibro) {
        this.librosIdLibro = librosIdLibro;
    }

    @XmlTransient
    public List<EstadosExistencias> getEstadosExistenciasList() {
        return estadosExistenciasList;
    }

    public void setEstadosExistenciasList(List<EstadosExistencias> estadosExistenciasList) {
        this.estadosExistenciasList = estadosExistenciasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idExistencia != null ? idExistencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LibrosExistencias)) {
            return false;
        }
        LibrosExistencias other = (LibrosExistencias) object;
        if ((this.idExistencia == null && other.idExistencia != null) || (this.idExistencia != null && !this.idExistencia.equals(other.idExistencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mavens.libreria.LibrosExistencias[ idExistencia=" + idExistencia + " ]";
    }
    
}
