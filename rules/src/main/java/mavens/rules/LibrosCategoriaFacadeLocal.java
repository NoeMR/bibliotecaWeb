/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavens.rules;

import java.util.List;
import javax.ejb.Local;
import mavens.libreria.LibrosCategoria;

/**
 *
 * @author Ferna
 */
@Local
public interface LibrosCategoriaFacadeLocal {

    void create(LibrosCategoria librosCategoria);

    void edit(LibrosCategoria librosCategoria);

    void remove(LibrosCategoria librosCategoria);

    LibrosCategoria find(Object id);

    List<LibrosCategoria> findAll();

    List<LibrosCategoria> findRange(int[] range);

    int count();
    
}
