/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavens.rules;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import mavens.libreria.EstadosExistencias;

/**
 *
 * @author Ferna
 */
@Stateless
public class EstadosExistenciasFacade extends AbstractFacade<EstadosExistencias> implements EstadosExistenciasFacadeLocal {

    @PersistenceContext(unitName = "mavens_rules_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EstadosExistenciasFacade() {
        super(EstadosExistencias.class);
    }
    
}
