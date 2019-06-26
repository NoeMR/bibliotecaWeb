/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavens.rules;

import java.util.List;
import javax.ejb.Local;
import mavens.libreria.LibrosAutores;

/**
 *
 * @author Ferna
 */
@Local
public interface LibrosAutoresFacadeLocal {

    void create(LibrosAutores librosAutores);

    void edit(LibrosAutores librosAutores);

    void remove(LibrosAutores librosAutores);

    LibrosAutores find(Object id);

    List<LibrosAutores> findAll();

    List<LibrosAutores> findRange(int[] range);

    int count();
    
}
