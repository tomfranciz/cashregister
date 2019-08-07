/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.capsoft.mb;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import org.capsoft.ejbs.AccountHeadsFacade;
import org.capsoft.entities.AccountsHeads;

/**
 *
 * @author Thomas Francis
 */
@Named(value = "accountsHeadsMB")
@RequestScoped
public class AccountsHeadsMB {

    @EJB
    private AccountHeadsFacade accountHeadsFacade;
    private AccountsHeads accountsHeads;
    private List<AccountsHeads> accountsHeadsList;

    @PostConstruct
    public void init() {
        accountsHeads = new AccountsHeads();
        accountsHeadsList = new ArrayList<>();
        accountsHeadsList = accountHeadsFacade.findAll();
    }

    /**
     * Creates a new instance of AccountHeads
     */
    public AccountsHeadsMB() {
    }

    public AccountsHeads getAccountHeads() {
        return accountsHeads;
    }

    public void setAccountHeads(AccountsHeads accountsHeads) {
        this.accountsHeads = accountsHeads;
    }

    public List<AccountsHeads> getAccountsHeadsList() {
        return accountsHeadsList;
    }

    public void setAccountsHeadsList(List<AccountsHeads> accountsHeadsList) {
        this.accountsHeadsList = accountsHeadsList;
    }

    
    
    public String save() {
        accountHeadsFacade.create(accountsHeads);
        return null;
    }
}
