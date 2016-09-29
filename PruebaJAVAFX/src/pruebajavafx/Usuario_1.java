/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajavafx;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
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
 * @author Dcadavid
 */
@Entity
@Table(name = "usuario", catalog = "bd_telmoda", schema = "")
@NamedQueries({
    @NamedQuery(name = "Usuario_1.findAll", query = "SELECT u FROM Usuario_1 u"),
    @NamedQuery(name = "Usuario_1.findByCedula", query = "SELECT u FROM Usuario_1 u WHERE u.cedula = :cedula"),
    @NamedQuery(name = "Usuario_1.findByUsuario", query = "SELECT u FROM Usuario_1 u WHERE u.usuario = :usuario"),
    @NamedQuery(name = "Usuario_1.findByContrasenia", query = "SELECT u FROM Usuario_1 u WHERE u.contrasenia = :contrasenia"),
    @NamedQuery(name = "Usuario_1.findByNombres", query = "SELECT u FROM Usuario_1 u WHERE u.nombres = :nombres"),
    @NamedQuery(name = "Usuario_1.findByApellidos", query = "SELECT u FROM Usuario_1 u WHERE u.apellidos = :apellidos"),
    @NamedQuery(name = "Usuario_1.findByTelefono", query = "SELECT u FROM Usuario_1 u WHERE u.telefono = :telefono"),
    @NamedQuery(name = "Usuario_1.findByCorreo", query = "SELECT u FROM Usuario_1 u WHERE u.correo = :correo")})
public class Usuario_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cedula")
    private Integer cedula;
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "contrasenia")
    private String contrasenia;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "Apellidos")
    private String apellidos;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "correo")
    private String correo;

    public Usuario_1() {
    }

    public Usuario_1(Integer cedula) {
        this.cedula = cedula;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        Integer oldCedula = this.cedula;
        this.cedula = cedula;
        changeSupport.firePropertyChange("cedula", oldCedula, cedula);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        String oldUsuario = this.usuario;
        this.usuario = usuario;
        changeSupport.firePropertyChange("usuario", oldUsuario, usuario);
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        String oldContrasenia = this.contrasenia;
        this.contrasenia = contrasenia;
        changeSupport.firePropertyChange("contrasenia", oldContrasenia, contrasenia);
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        String oldNombres = this.nombres;
        this.nombres = nombres;
        changeSupport.firePropertyChange("nombres", oldNombres, nombres);
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        String oldApellidos = this.apellidos;
        this.apellidos = apellidos;
        changeSupport.firePropertyChange("apellidos", oldApellidos, apellidos);
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        String oldTelefono = this.telefono;
        this.telefono = telefono;
        changeSupport.firePropertyChange("telefono", oldTelefono, telefono);
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        String oldCorreo = this.correo;
        this.correo = correo;
        changeSupport.firePropertyChange("correo", oldCorreo, correo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cedula != null ? cedula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario_1)) {
            return false;
        }
        Usuario_1 other = (Usuario_1) object;
        if ((this.cedula == null && other.cedula != null) || (this.cedula != null && !this.cedula.equals(other.cedula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pruebajavafx.Usuario_1[ cedula=" + cedula + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
