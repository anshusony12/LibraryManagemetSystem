/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibrarianSection;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Anshu Sony
 */
@Entity
@Table(name = "viewissuedinfo", catalog = "view_issue_book", schema = "")
@NamedQueries({
    @NamedQuery(name = "Viewissuedinfo.findAll", query = "SELECT v FROM Viewissuedinfo v")
    , @NamedQuery(name = "Viewissuedinfo.findById", query = "SELECT v FROM Viewissuedinfo v WHERE v.id = :id")
    , @NamedQuery(name = "Viewissuedinfo.findByBookcallno", query = "SELECT v FROM Viewissuedinfo v WHERE v.bookcallno = :bookcallno")
    , @NamedQuery(name = "Viewissuedinfo.findByStudentid", query = "SELECT v FROM Viewissuedinfo v WHERE v.studentid = :studentid")
    , @NamedQuery(name = "Viewissuedinfo.findByStudentname", query = "SELECT v FROM Viewissuedinfo v WHERE v.studentname = :studentname")
    , @NamedQuery(name = "Viewissuedinfo.findByStudentcontact", query = "SELECT v FROM Viewissuedinfo v WHERE v.studentcontact = :studentcontact")
    , @NamedQuery(name = "Viewissuedinfo.findByIssuedate", query = "SELECT v FROM Viewissuedinfo v WHERE v.issuedate = :issuedate")})
public class Viewissuedinfo implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "id")
    private int id;
    @Column(name = "bookcallno")
    private String bookcallno;
    @Id
    @Basic(optional = false)
    @Column(name = "studentid")
    private Integer studentid;
    @Column(name = "studentname")
    private String studentname;
    @Column(name = "studentcontact")
    private BigInteger studentcontact;
    @Column(name = "issuedate")
    @Temporal(TemporalType.DATE)
    private Date issuedate;

    public Viewissuedinfo() {
    }

    public Viewissuedinfo(Integer studentid) {
        this.studentid = studentid;
    }

    public Viewissuedinfo(Integer studentid, int id) {
        this.studentid = studentid;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        int oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getBookcallno() {
        return bookcallno;
    }

    public void setBookcallno(String bookcallno) {
        String oldBookcallno = this.bookcallno;
        this.bookcallno = bookcallno;
        changeSupport.firePropertyChange("bookcallno", oldBookcallno, bookcallno);
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        Integer oldStudentid = this.studentid;
        this.studentid = studentid;
        changeSupport.firePropertyChange("studentid", oldStudentid, studentid);
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        String oldStudentname = this.studentname;
        this.studentname = studentname;
        changeSupport.firePropertyChange("studentname", oldStudentname, studentname);
    }

    public BigInteger getStudentcontact() {
        return studentcontact;
    }

    public void setStudentcontact(BigInteger studentcontact) {
        BigInteger oldStudentcontact = this.studentcontact;
        this.studentcontact = studentcontact;
        changeSupport.firePropertyChange("studentcontact", oldStudentcontact, studentcontact);
    }

    public Date getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(Date issuedate) {
        Date oldIssuedate = this.issuedate;
        this.issuedate = issuedate;
        changeSupport.firePropertyChange("issuedate", oldIssuedate, issuedate);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentid != null ? studentid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Viewissuedinfo)) {
            return false;
        }
        Viewissuedinfo other = (Viewissuedinfo) object;
        if ((this.studentid == null && other.studentid != null) || (this.studentid != null && !this.studentid.equals(other.studentid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LibrarianSection.Viewissuedinfo[ studentid=" + studentid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
