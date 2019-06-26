/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavens.libreria;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ferna
 */
@Entity
@Table(name = "prestamos", catalog = "biblioteca", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Prestamos.findAll", query = "SELECT p FROM Prestamos p")
    , @NamedQuery(name = "Prestamos.findByIdPrestamo", query = "SELECT p FROM Prestamos p WHERE p.idPrestamo = :idPrestamo")
    , @NamedQuery(name = "Prestamos.findByFechaPrestamo", query = "SELECT p FROM Prestamos p WHERE p.fechaPrestamo = :fechaPrestamo")
    , @NamedQuery(name = "Prestamos.findByFechaDevoluci\u00f3n", query = "SELECT p FROM Prestamos p WHERE p.fechaDevoluci\u00f3n = :fechaDevoluci\u00f3n")})
public class Prestamos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_prestamo", nullable = false)
    private Integer idPrestamo;
    @Column(name = "fecha_prestamo")
    @Temporal(TemporalType.DATE)
    private Date fechaPrestamo;
    @Column(name = "fecha_devoluci\u00f3n")
    @Temporal(TemporalType.DATE)
    private Date fechaDevolución;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prestamosIdPrestamo", fetch = FetchType.LAZY)
    private List<TiposPrestamos> tiposPrestamosList;
    @JoinColumn(name = "libros_existencias_id_existencia", referencedColumnName = "id_existencia", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private LibrosExistencias librosExistenciasIdExistencia;
    @JoinColumn(name = "usuarios_id_usuario", referencedColumnName = "id_usuario", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuarios usuariosIdUsuario;

    public Prestamos() {
    }

    public Prestamos(Integer idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Integer getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(Integer idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolución() {
        return fechaDevolución;
    }

    public void setFechaDevolución(Date fechaDevolución) {
        this.fechaDevolución = fechaDevolución;
    }

    @XmlTransient
    public List<TiposPrestamos> getTiposPrestamosList() {
        return tiposPrestamosList;
    }

    public void setTiposPrestamosList(List<TiposPrestamos> tiposPrestamosList) {
        this.tiposPrestamosList = tiposPrestamosList;
    }

    public LibrosExistencias getLibrosExistenciasIdExistencia() {
        return librosExistenciasIdExistencia;
    }

    public void setLibrosExistenciasIdExistencia(LibrosExistencias librosExistenciasIdExistencia) {
        this.librosExistenciasIdExistencia = librosExistenciasIdExistencia;
    }

    public Usuarios getUsuariosIdUsuario() {
        return usuariosIdUsuario;
    }

    public void setUsuariosIdUsuario(Usuarios usuariosIdUsuario) {
        this.usuariosIdUsuario = usuariosIdUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPrestamo != null ? idPrestamo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prestamos)) {
            return false;
        }
        Prestamos other = (Prestamos) object;
        if ((this.idPrestamo == null && other.idPrestamo != null) || (this.idPrestamo != null && !this.idPrestamo.equals(other.idPrestamo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mavens.libreria.Prestamos[ idPrestamo=" + idPrestamo + " ]";
    }
    
}
