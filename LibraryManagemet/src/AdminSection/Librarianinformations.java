/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminSection;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Anshu Sony
 */
@Entity
@Table(name = "librarianinformations", catalog = "librarianinfo", schema = "")
@NamedQueries({
    @NamedQuery(name = "Librarianinformations.findAll", query = "SELECT l FROM Librarianinformations l")
    , @NamedQuery(name = "Librarianinformations.findById", query = "SELECT l FROM Librarianinformations l WHERE l.id = :id")
    , @NamedQuery(name = "Librarianinformations.findByName", query = "SELECT l FROM Librarianinformations l WHERE l.name = :name")
    , @NamedQuery(name = "Librarianinformations.findByEmail", query = "SELECT l FROM Librarianinformations l WHERE l.email = :email")
    , @NamedQuery(name = "Librarianinformations.findByPassword", query = "SELECT l FROM Librarianinformations l WHERE l.password = :password")
    , @NamedQuery(name = "Librarianinformations.findByAddress", query = "SELECT l FROM Librarianinformations l WHERE l.address = :address")
    , @NamedQuery(name = "Librarianinformations.findByCity", query = "SELECT l FROM Librarianinformations l WHERE l.city = :city")
    , @NamedQuery(name = "Librarianinformations.findByContact", query = "SELECT l FROM Librarianinformations l WHERE l.contact = :contact")})
public class Librarianinformations implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Email")
    private String email;
    @Column(name = "Password")
    private String password;
    @Column(name = "Address")
    private String address;
    @Column(name = "City")
    private String city;
    @Column(name = "Contact")
    private BigInteger contact;

    public Librarianinformations() {
    }

    public Librarianinformations(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        String oldCity = this.city;
        this.city = city;
        changeSupport.firePropertyChange("city", oldCity, city);
    }

    public BigInteger getContact() {
        return contact;
    }

    public void setContact(BigInteger contact) {
        BigInteger oldContact = this.contact;
        this.contact = contact;
        changeSupport.firePropertyChange("contact", oldContact, contact);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Librarianinformations)) {
            return false;
        }
        Librarianinformations other = (Librarianinformations) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdminSection.Librarianinformations[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
