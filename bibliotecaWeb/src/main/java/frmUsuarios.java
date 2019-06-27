/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import mavens.libreria.*;
import mavens.rules.*;

/**
 *
 * @author Ferna
 */
@Named(value = "frmUsuarios")
@ViewScoped
public class frmUsuarios implements Serializable{

    /**
     * Creates a new instance of frmUsuarios
     */
    
    @Inject
    private UsuariosFacadeLocal facade;
    private Usuarios usuario = new Usuarios();
    
    private int idUsuario;
    private String nombreUsuario;
    private String apelllidoUsuario;
    private String telefonoUsuario;
    private String direccionUsuario;
    private String identificacionUsuario;
    
    private int usuarioConsulta;
    private List<Prestamos> prestamosUsuario;
    
    @Inject
    private PrestamosFacadeLocal facade1;
    private Prestamos prestamo = new Prestamos();
    
    private int idPrestamo;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private int idUsuarioPrestamo;
    private int idLibroPrestamo;
    
    @Inject
    private TiposPrestamosFacadeLocal facade2;
    private TiposPrestamos tipoPrestamos = new TiposPrestamos();
    
    @Inject
    private LibrosExistenciasFacadeLocal facade3;
    private LibrosExistencias libroExistencias = new LibrosExistencias();
    
    @Inject
    private LibrosFacadeLocal facade4;
    private Libros libro = new Libros();
    
    private int disableR = 0;
    private int disableP = 0;
    
    public frmUsuarios() {
    }
    
    public int rDisableR(){
        return this.disableR;
    }
    
    public int rDisableP(){
        return this.disableP;
    }
    
    public int rIdUsuario(){
        int nuevoId;
        if ((facade.findAll().size()) == 0) {
            nuevoId = 1;
        } else{
            nuevoId = ((facade.findAll().get((facade.findAll().size()) - 1).getIdUsuario()) + 1);
        }
        return nuevoId;
    }
    
    public int rIdPrestamo(){
        int nuevoId;
        if ((facade1.findAll().size()) == 0) {
            nuevoId = 1;
        } else{
            nuevoId = ((facade1.findAll().get((facade.findAll().size()) - 1).getIdPrestamo()) + 1);
        }
        return nuevoId;
    }
    
    public void agregarUsuario(){
        this.usuario.setIdUsuario(idUsuario);
        this.usuario.setNombre(nombreUsuario);
        this.usuario.setApellido(apelllidoUsuario);
        this.usuario.setTeléfono(telefonoUsuario);
        this.usuario.setDirección(direccionUsuario);
        this.usuario.setDui(identificacionUsuario);
        this.facade.create(usuario);
    }
    
    public void agregarPrestamo(){
        int count=0;
        int count1=0;
        int count2=0;
        this.prestamo.setIdPrestamo(idPrestamo);
        this.prestamo.setFechaPrestamo(fechaPrestamo);
        this.prestamo.setFechaDevolución(fechaDevolucion);
        while(!(facade4.findAll().get(count).getIdLibro() == idLibroPrestamo)){
            count++;
        }
        this.libroExistencias.setLibrosIdLibro(facade4.findAll().get(count));
        this.facade3.create(libroExistencias);
        while(!(facade3.findAll().get(count1).getLibrosIdLibro().getIdLibro() == idLibroPrestamo)){
            count1++;
        }
        this.prestamo.setLibrosExistenciasIdExistencia(facade3.findAll().get(count1));
        while(!(facade.findAll().get(count2).getIdUsuario() == idUsuarioPrestamo)){
            count2++;
        }
        this.prestamo.setUsuariosIdUsuario(facade.findAll().get(count2));
        this.facade1.create(prestamo);
    }
    
    public List<Prestamos> consutaPrestamo(){
        prestamosUsuario = new ArrayList<>();
        for (int i = 0; i < facade1.findAll().size(); i++) {
            if ((facade1.findAll().get(i).getUsuariosIdUsuario().getIdUsuario()) == usuarioConsulta) {
                prestamosUsuario.add(facade1.findAll().get(i));
            }
        }
        return prestamosUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApelllidoUsuario() {
        return apelllidoUsuario;
    }

    public void setApelllidoUsuario(String apelllidoUsuario) {
        this.apelllidoUsuario = apelllidoUsuario;
    }

    public String getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(String telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public String getDireccionUsuario() {
        return direccionUsuario;
    }

    public void setDireccionUsuario(String direccionUsuario) {
        this.direccionUsuario = direccionUsuario;
    }

    public String getIdentificacionUsuario() {
        return identificacionUsuario;
    }

    public void setIdentificacionUsuario(String identificacionUsuario) {
        this.identificacionUsuario = identificacionUsuario;
    }

    public int getDisableR() {
        return disableR;
    }

    public void setDisableR(int disableR) {
        this.disableR = disableR;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getIdUsuarioPrestamo() {
        return idUsuarioPrestamo;
    }

    public void setIdUsuarioPrestamo(int idUsuarioPrestamo) {
        this.idUsuarioPrestamo = idUsuarioPrestamo;
    }

    public int getIdLibroPrestamo() {
        return idLibroPrestamo;
    }

    public void setIdLibroPrestamo(int idLibroPrestamo) {
        this.idLibroPrestamo = idLibroPrestamo;
    }

    public int getDisableP() {
        return disableP;
    }

    public void setDisableP(int disableP) {
        this.disableP = disableP;
    }

    public int getUsuarioConsulta() {
        return usuarioConsulta;
    }

    public void setUsuarioConsulta(int usuarioConsulta) {
        this.usuarioConsulta = usuarioConsulta;
    }

    public List<Prestamos> getPrestamosUsuario() {
        return prestamosUsuario;
    }

    public void setPrestamosUsuario(List<Prestamos> prestamosUsuario) {
        this.prestamosUsuario = prestamosUsuario;
    }

}
