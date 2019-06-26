/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavens.rules;

import java.util.List;
import javax.ejb.Local;
import mavens.libreria.Autores;

/**
 *
 * @author Ferna
 */
@Local
public interface AutoresFacadeLocal {

    void create(Autores autores);

    void edit(Autores autores);

    void remove(Autores autores);

    Autores find(Object id);

    List<Autores> findAll();

    List<Autores> findRange(int[] range);

    int count();
    
}
