/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavens.rules;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import mavens.libreria.TiposPrestamos;

/**
 *
 * @author Ferna
 */
@Stateless
public class TiposPrestamosFacade extends AbstractFacade<TiposPrestamos> implements TiposPrestamosFacadeLocal {

    @PersistenceContext(unitName = "mavens_rules_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TiposPrestamosFacade() {
        super(TiposPrestamos.class);
    }
    
}
