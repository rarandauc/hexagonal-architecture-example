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
@Table(name = "permisos")

public class PermisoEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "permiso")
    private String permiso;
    @Basic(optional = false)
    @Column(name = "estado")
    private boolean estado;
    @ManyToMany(mappedBy = "permisoList")
    private List<RolEntity> rolList;

    public PermisoEntity() {
    }

    public PermisoEntity(Integer id) {
        this.id = id;
    }

    public PermisoEntity(Integer id, String permiso, boolean estado) {
        this.id = id;
        this.permiso = permiso;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermiso() {
        return permiso;
    }

    public void setPermiso(String permiso) {
        this.permiso = permiso;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PermisoEntity)) {
            return false;
        }
        PermisoEntity other = (PermisoEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "adapters.output.persistence.entity.PermisoEntity[ id=" + id + " ]";
    }
    
}
