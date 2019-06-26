/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavens.rules;

import java.util.List;
import javax.ejb.Local;
import mavens.libreria.EstadosExistencias;

/**
 *
 * @author Ferna
 */
@Local
public interface EstadosExistenciasFacadeLocal {

    void create(EstadosExistencias estadosExistencias);

    void edit(EstadosExistencias estadosExistencias);

    void remove(EstadosExistencias estadosExistencias);

    EstadosExistencias find(Object id);

    List<EstadosExistencias> findAll();

    List<EstadosExistencias> findRange(int[] range);

    int count();
    
}
