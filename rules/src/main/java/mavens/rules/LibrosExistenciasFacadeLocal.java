/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavens.rules;

import java.util.List;
import javax.ejb.Local;
import mavens.libreria.LibrosExistencias;

/**
 *
 * @author Ferna
 */
@Local
public interface LibrosExistenciasFacadeLocal {

    void create(LibrosExistencias librosExistencias);

    void edit(LibrosExistencias librosExistencias);

    void remove(LibrosExistencias librosExistencias);

    LibrosExistencias find(Object id);

    List<LibrosExistencias> findAll();

    List<LibrosExistencias> findRange(int[] range);

    int count();
    
}
