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
@Table(name = "libros_categoria", catalog = "biblioteca", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LibrosCategoria.findAll", query = "SELECT l FROM LibrosCategoria l")
    , @NamedQuery(name = "LibrosCategoria.findByIdLibrosCategoria", query = "SELECT l FROM LibrosCategoria l WHERE l.idLibrosCategoria = :idLibrosCategoria")})
public class LibrosCategoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_libros_categoria", nullable = false)
    private Integer idLibrosCategoria;
    @JoinColumn(name = "categoria_id_categoria", referencedColumnName = "id_categoria", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Categoria categoriaIdCategoria;
    @JoinColumn(name = "libros_id_libro", referencedColumnName = "id_libro", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Libros librosIdLibro;

    public LibrosCategoria() {
    }

    public LibrosCategoria(Integer idLibrosCategoria) {
        this.idLibrosCategoria = idLibrosCategoria;
    }

    public Integer getIdLibrosCategoria() {
        return idLibrosCategoria;
    }

    public void setIdLibrosCategoria(Integer idLibrosCategoria) {
        this.idLibrosCategoria = idLibrosCategoria;
    }

    public Categoria getCategoriaIdCategoria() {
        return categoriaIdCategoria;
    }

    public void setCategoriaIdCategoria(Categoria categoriaIdCategoria) {
        this.categoriaIdCategoria = categoriaIdCategoria;
    }

    public Libros getLibrosIdLibro() {
        return librosIdLibro;
    }

    public void setLibrosIdLibro(Libros librosIdLibro) {
        this.librosIdLibro = librosIdLibro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLibrosCategoria != null ? idLibrosCategoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LibrosCategoria)) {
            return false;
        }
        LibrosCategoria other = (LibrosCategoria) object;
        if ((this.idLibrosCategoria == null && other.idLibrosCategoria != null) || (this.idLibrosCategoria != null && !this.idLibrosCategoria.equals(other.idLibrosCategoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mavens.libreria.LibrosCategoria[ idLibrosCategoria=" + idLibrosCategoria + " ]";
    }
    
}
