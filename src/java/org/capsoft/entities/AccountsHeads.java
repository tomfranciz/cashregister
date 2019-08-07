/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.capsoft.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Thomas Francis
 */
@Entity
@Table(name = "accounts_heads")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AccountsHeads.findAll", query = "SELECT a FROM AccountsHeads a")
    , @NamedQuery(name = "AccountsHeads.findByIdAccountHeads", query = "SELECT a FROM AccountsHeads a WHERE a.idAccountHeads = :idAccountHeads")
    , @NamedQuery(name = "AccountsHeads.findByAccountHead", query = "SELECT a FROM AccountsHeads a WHERE a.accountHead = :accountHead")
    , @NamedQuery(name = "AccountsHeads.findByAccountHeadCode", query = "SELECT a FROM AccountsHeads a WHERE a.accountHeadCode = :accountHeadCode")})
public class AccountsHeads implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_account_heads")
    private Integer idAccountHeads;
    @Size(max = 45)
    @Column(name = "account_head")
    private String accountHead;
    @Size(max = 10)
    @Column(name = "account_head_code")
    private String accountHeadCode;

    public AccountsHeads() {
    }

    public AccountsHeads(Integer idAccountHeads) {
        this.idAccountHeads = idAccountHeads;
    }

    public Integer getIdAccountHeads() {
        return idAccountHeads;
    }

    public void setIdAccountHeads(Integer idAccountHeads) {
        this.idAccountHeads = idAccountHeads;
    }

    public String getAccountHead() {
        return accountHead;
    }

    public void setAccountHead(String accountHead) {
        this.accountHead = accountHead;
    }

    public String getAccountHeadCode() {
        return accountHeadCode;
    }

    public void setAccountHeadCode(String accountHeadCode) {
        this.accountHeadCode = accountHeadCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAccountHeads != null ? idAccountHeads.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccountsHeads)) {
            return false;
        }
        AccountsHeads other = (AccountsHeads) object;
        if ((this.idAccountHeads == null && other.idAccountHeads != null) || (this.idAccountHeads != null && !this.idAccountHeads.equals(other.idAccountHeads))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.capsoft.entities.AccountsHeads[ idAccountHeads=" + idAccountHeads + " ]";
    }
    
}
