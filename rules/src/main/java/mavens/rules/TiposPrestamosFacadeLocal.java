/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavens.rules;

import java.util.List;
import javax.ejb.Local;
import mavens.libreria.TiposPrestamos;

/**
 *
 * @author Ferna
 */
@Local
public interface TiposPrestamosFacadeLocal {

    void create(TiposPrestamos tiposPrestamos);

    void edit(TiposPrestamos tiposPrestamos);

    void remove(TiposPrestamos tiposPrestamos);

    TiposPrestamos find(Object id);

    List<TiposPrestamos> findAll();

    List<TiposPrestamos> findRange(int[] range);

    int count();
    
}
