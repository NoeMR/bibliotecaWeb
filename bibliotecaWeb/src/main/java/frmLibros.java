/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import mavens.rules.EditorialesFacadeLocal;
import mavens.rules.LibrosAutoresFacadeLocal;
import mavens.rules.LibrosCategoriaFacadeLocal;
import mavens.rules.LibrosFacadeLocal;
import mavens.libreria.*;
import mavens.rules.*;

/**
 *
 * @author Ferna
 */
@Named(value = "frmLibros")
@ViewScoped
public class frmLibros implements Serializable {

    /**
     * Creates a new instance of frmLibros
     */
    @Inject
    private LibrosFacadeLocal facade;
    private Libros libro = new Libros();

    @Inject
    private LibrosAutoresFacadeLocal facade1;
    private LibrosAutores librosAutores = new LibrosAutores();

    private int id;
    private String isbn;
    private String titulo;
    private String editorial;
    private String pais;
    private String autor;
    private List<String> listaEditoriales;
    private List<String> listaPaises;
    private List<String> listaAutores;

    @Inject
    private EditorialesFacadeLocal facade3;
    private Editoriales editoriales = new Editoriales();

    private int idEditorial;
    private String nombreEditorial;

    @Inject
    private PaisesFacadeLocal facade4;
    private Paises paises = new Paises();

    private int idPais;
    private String nombrePais;

    @Inject
    private AutoresFacadeLocal facade5;
    private Autores autores = new Autores();

    private int idAutor;
    private String nombreAutor;

    @Inject
    private LibrosCategoriaFacadeLocal facade2;

    public frmLibros() {
    }

    public List<String> generarlistaEditoriales() {
        listaEditoriales = new ArrayList<>();
        for (int i = 0; i < facade3.findAll().size(); i++) {
            listaEditoriales.add(facade3.findAll().get(i).getEditorial());
        }
        return listaEditoriales;
    }

    public List<String> generarlistaPaises() {
        listaPaises = new ArrayList<>();
        for (int i = 0; i < facade4.findAll().size(); i++) {
            listaPaises.add(facade4.findAll().get(i).getPais());
        }
        return listaPaises;
    }

    public List<String> generarlistaAutores() {
        listaAutores = new ArrayList<>();
        for (int i = 0; i < facade5.findAll().size(); i++) {
            listaAutores.add(facade5.findAll().get(i).getAutor());
        }
        return listaAutores;
    }

    public List<Libros> todo() {
        return facade.findAll();
    }

    public List<LibrosAutores> todo1() {
        return facade1.findAll();
    }

    public List<Editoriales> todo2() {
        return facade3.findAll();
    }

    public List<Paises> todo3() {
        return facade4.findAll();
    }

    public List<Autores> todo4() {
        return facade5.findAll();
    }

    public String agregar() {
        int count = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        this.libro.setIdLibro(id);
        this.libro.setIsbn(isbn);
        this.libro.setTitulo(titulo);
        while (!(facade3.findAll().get(count).getEditorial().equals(editorial))) {
            count++;
        }
        this.libro.setEditorialesIdEditorial(facade3.findAll().get(count));
        while (!(facade4.findAll().get(count2).getPais().equals(pais))) {
            count2++;
        }
        this.libro.setPaisesIdPais(facade4.findAll().get(count2));
        this.facade.create(libro);
        while (!(facade.findAll().get(count3).getTitulo().equals(titulo))) {
            count3++;
        }
        this.librosAutores.setLibrosIdLibro(facade.findAll().get(count3));
        while (!(facade5.findAll().get(count4).getAutor().equals(autor))) {
            count4++;
        }
        this.librosAutores.setAutoresIdAutor(facade5.findAll().get(count4));
        this.facade1.create(librosAutores);
        return "tablaLibros.jsf?faces-redirect=true";
    }

    public String agregarEditorial() {
        this.editoriales.setIdEditorial(idEditorial);
        this.editoriales.setEditorial(nombreEditorial);
        this.facade3.create(editoriales);
        return "tablaLibros.jsf?faces-redirect=true";
    }

    public String agregarPais() {
        this.paises.setIdPais(idPais);
        this.paises.setPais(nombrePais);
        this.facade4.create(paises);
        return "tablaLibros.jsf?faces-redirect=true";
    }

    public String agregarAutor() {
        this.autores.setIdAutor(idAutor);
        this.autores.setAutor(nombreAutor);
        this.facade5.create(autores);
        return "tablaLibros.jsf?faces-redirect=true";
    }

    public String eliminarLibro() {
        int count4=0;
        while (!(facade.findAll().get(count4).getIdLibro().equals(id))) {
            count4++;
        }
        this.facade.remove(facade.findAll().get(count4));
        return "tablaLibros.jsf?faces-redirect=true";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIdEditorial() {
        return idEditorial;
    }

    public void setIdEditorial(int idEditorial) {
        this.idEditorial = idEditorial;
    }

    public String getNombreEditorial() {
        return nombreEditorial;
    }

    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public List<String> getListaEditoriales() {
        return listaEditoriales;
    }

    public void setListaEditoriales(List<String> listaEditoriales) {
        this.listaEditoriales = listaEditoriales;
    }

    public List<String> getListaPaises() {
        return listaPaises;
    }

    public void setListaPaises(List<String> listaPaises) {
        this.listaPaises = listaPaises;
    }

    public List<String> getListaAutores() {
        return listaAutores;
    }

    public void setListaAutores(List<String> listaAutores) {
        this.listaAutores = listaAutores;
    }

}
