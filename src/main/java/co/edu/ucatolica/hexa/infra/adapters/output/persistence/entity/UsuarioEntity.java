/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucatolica.hexa.infra.adapters.output.persistence.entity;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.*;
/**
 *
 * @author RAF
 */
@Entity
@Table(name = "usuarios")

public class UsuarioEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iduser")
    private Integer iduser;
    @Basic(optional = false)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Column(name = "nombrecompleto")
    private String nombrecompleto;
    @JoinTable(name = "usuarios_roles", joinColumns = {
        @JoinColumn(name = "userId", referencedColumnName = "iduser")}, inverseJoinColumns = {
        @JoinColumn(name = "rolid", referencedColumnName = "id")})
    @ManyToMany
    private List<RolEntity> rolList;

    public UsuarioEntity() {
    }

    public UsuarioEntity(Integer iduser) {
        this.iduser = iduser;
    }

    public UsuarioEntity(Integer iduser, String username, String password) {
        this.iduser = iduser;
        this.username = username;
        this.password = password;
    }

    public Integer getIduser() {
        return iduser;
    }

    public void setIduser(Integer iduser) {
        this.iduser = iduser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public List<RolEntity> getRolList() {
        return rolList;
    }

    public void setRolList(List<RolEntity> rolList) {
        this.rolList = rolList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iduser != null ? iduser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioEntity)) {
            return false;
        }
        UsuarioEntity other = (UsuarioEntity) object;
        if ((this.iduser == null && other.iduser != null) || (this.iduser != null && !this.iduser.equals(other.iduser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "adapters.output.persistence.entity.UsuarioEntity[ iduser=" + iduser + " ]";
    }
    
}
