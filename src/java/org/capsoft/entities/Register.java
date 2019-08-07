/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.capsoft.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Thomas Francis
 */
@Entity
@Table(name = "register")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Register.findAll", query = "SELECT r FROM Register r")
    , @NamedQuery(name = "Register.findByIdRegister", query = "SELECT r FROM Register r WHERE r.idRegister = :idRegister")
    , @NamedQuery(name = "Register.findByRegisterDate", query = "SELECT r FROM Register r WHERE r.registerDate = :registerDate")
    , @NamedQuery(name = "Register.findByAmount", query = "SELECT r FROM Register r WHERE r.amount = :amount")
    , @NamedQuery(name = "Register.findByDescription", query = "SELECT r FROM Register r WHERE r.description = :description")})
public class Register implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_register")
    private Integer idRegister;
    @Column(name = "register_date")
    @Temporal(TemporalType.DATE)
    private Date registerDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "amount")
    private Double amount;
    @Size(max = 256)
    @Column(name = "description")
    private String description;

    public Register() {
    }

    public Register(Integer idRegister) {
        this.idRegister = idRegister;
    }

    public Integer getIdRegister() {
        return idRegister;
    }

    public void setIdRegister(Integer idRegister) {
        this.idRegister = idRegister;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRegister != null ? idRegister.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Register)) {
            return false;
        }
        Register other = (Register) object;
        if ((this.idRegister == null && other.idRegister != null) || (this.idRegister != null && !this.idRegister.equals(other.idRegister))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.capsoft.entities.Register[ idRegister=" + idRegister + " ]";
    }
    
}
