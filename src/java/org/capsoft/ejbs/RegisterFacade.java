/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.capsoft.ejbs;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.capsoft.entities.Register;

/**
 *
 * @author Thomas Francis
 */
@Stateless
public class RegisterFacade extends AbstractFacade<Register> {

    @PersistenceContext(unitName = "cashregisterPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RegisterFacade() {
        super(Register.class);
    }
    
}
