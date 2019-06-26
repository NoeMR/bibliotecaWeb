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
@Table(name = "libros_autores", catalog = "biblioteca", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LibrosAutores.findAll", query = "SELECT l FROM LibrosAutores l")
    , @NamedQuery(name = "LibrosAutores.findByIdLibrosAutores", query = "SELECT l FROM LibrosAutores l WHERE l.idLibrosAutores = :idLibrosAutores")})
public class LibrosAutores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_libros_autores", nullable = false)
    private Integer idLibrosAutores;
    @JoinColumn(name = "autores_id_autor", referencedColumnName = "id_autor", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Autores autoresIdAutor;
    @JoinColumn(name = "libros_id_libro", referencedColumnName = "id_libro", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Libros librosIdLibro;

    public LibrosAutores() {
    }

    public LibrosAutores(Integer idLibrosAutores) {
        this.idLibrosAutores = idLibrosAutores;
    }

    public Integer getIdLibrosAutores() {
        return idLibrosAutores;
    }

    public void setIdLibrosAutores(Integer idLibrosAutores) {
        this.idLibrosAutores = idLibrosAutores;
    }

    public Autores getAutoresIdAutor() {
        return autoresIdAutor;
    }

    public void setAutoresIdAutor(Autores autoresIdAutor) {
        this.autoresIdAutor = autoresIdAutor;
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
        hash += (idLibrosAutores != null ? idLibrosAutores.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LibrosAutores)) {
            return false;
        }
        LibrosAutores other = (LibrosAutores) object;
        if ((this.idLibrosAutores == null && other.idLibrosAutores != null) || (this.idLibrosAutores != null && !this.idLibrosAutores.equals(other.idLibrosAutores))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mavens.libreria.LibrosAutores[ idLibrosAutores=" + idLibrosAutores + " ]";
    }
    
}
