/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavens.libreria;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.SecondaryTables;
import javax.persistence.SecondaryTable;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ferna
 */
@Entity
@Table(name = "libros", catalog = "biblioteca", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Libros.findAll", query = "SELECT l FROM Libros l")
    , @NamedQuery(name = "Libros.findByIdLibro", query = "SELECT l FROM Libros l WHERE l.idLibro = :idLibro")
    , @NamedQuery(name = "Libros.findByIsbn", query = "SELECT l FROM Libros l WHERE l.isbn = :isbn")
    , @NamedQuery(name = "Libros.findByTitulo", query = "SELECT l FROM Libros l WHERE l.titulo = :titulo")})

public class Libros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_libro", nullable = false)
    private Integer idLibro;
    @Column(name = "isbn", length = 50)
    private String isbn;
    @Column(name = "titulo", length = 75)
    private String titulo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "librosIdLibro", fetch = FetchType.EAGER, targetEntity = LibrosAutores.class)
    private Collection<LibrosAutores> librosAutores = new ArrayList<LibrosAutores>();
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "librosIdLibro", fetch = FetchType.EAGER, targetEntity = LibrosCategoria.class)
    private Set<LibrosCategoria_> librosCategoria = new HashSet<LibrosCategoria_>();
    @JoinColumn(name = "editoriales_id_editorial", referencedColumnName = "id_editorial", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Editoriales editorialesIdEditorial;
    @JoinColumn(name = "paises_id_pais", referencedColumnName = "id_pais", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Paises paisesIdPais;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "librosIdLibro", fetch = FetchType.LAZY)
    private List<LibrosExistencias> librosExistenciasList;
    
    
    public Libros() {
    }

    public Libros(Integer idLibro) {
        this.idLibro = idLibro;
    }

    public Integer getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Integer idLibro) {
        this.idLibro = idLibro;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @XmlTransient
    public Collection<LibrosAutores> getLibrosAutores() {
        return librosAutores;
    }

    public void setLibrosAutores(Collection<LibrosAutores> librosAutores) {
        this.librosAutores = librosAutores;
    }
    
    

    @XmlTransient
    public Set<LibrosCategoria_> getLibrosCategoria() {
        return librosCategoria;
    }

    public void setLibrosCategoria(Set<LibrosCategoria_> librosCategoria) {
        this.librosCategoria = librosCategoria;
    }

    public Editoriales getEditorialesIdEditorial() {
        return editorialesIdEditorial;
    }

    public void setEditorialesIdEditorial(Editoriales editorialesIdEditorial) {
        this.editorialesIdEditorial = editorialesIdEditorial;
    }

    public Paises getPaisesIdPais() {
        return paisesIdPais;
    }

    public void setPaisesIdPais(Paises paisesIdPais) {
        this.paisesIdPais = paisesIdPais;
    }

    @XmlTransient
    public List<LibrosExistencias> getLibrosExistenciasList() {
        return librosExistenciasList;
    }

    public void setLibrosExistenciasList(List<LibrosExistencias> librosExistenciasList) {
        this.librosExistenciasList = librosExistenciasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLibro != null ? idLibro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Libros)) {
            return false;
        }
        Libros other = (Libros) object;
        if ((this.idLibro == null && other.idLibro != null) || (this.idLibro != null && !this.idLibro.equals(other.idLibro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mavens.libreria.Libros[ idLibro=" + idLibro + " ]";
    }
    
}
