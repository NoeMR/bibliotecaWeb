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
@Table(name = "tipos_prestamos", catalog = "biblioteca", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TiposPrestamos.findAll", query = "SELECT t FROM TiposPrestamos t")
    , @NamedQuery(name = "TiposPrestamos.findByIdTipoprestamo", query = "SELECT t FROM TiposPrestamos t WHERE t.idTipoprestamo = :idTipoprestamo")})
public class TiposPrestamos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipoprestamo", nullable = false)
    private Integer idTipoprestamo;
    @JoinColumn(name = "prestamos_id_prestamo", referencedColumnName = "id_prestamo", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Prestamos prestamosIdPrestamo;

    public TiposPrestamos() {
    }

    public TiposPrestamos(Integer idTipoprestamo) {
        this.idTipoprestamo = idTipoprestamo;
    }

    public Integer getIdTipoprestamo() {
        return idTipoprestamo;
    }

    public void setIdTipoprestamo(Integer idTipoprestamo) {
        this.idTipoprestamo = idTipoprestamo;
    }

    public Prestamos getPrestamosIdPrestamo() {
        return prestamosIdPrestamo;
    }

    public void setPrestamosIdPrestamo(Prestamos prestamosIdPrestamo) {
        this.prestamosIdPrestamo = prestamosIdPrestamo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoprestamo != null ? idTipoprestamo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposPrestamos)) {
            return false;
        }
        TiposPrestamos other = (TiposPrestamos) object;
        if ((this.idTipoprestamo == null && other.idTipoprestamo != null) || (this.idTipoprestamo != null && !this.idTipoprestamo.equals(other.idTipoprestamo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mavens.libreria.TiposPrestamos[ idTipoprestamo=" + idTipoprestamo + " ]";
    }
    
}
