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
@Table(name = "roles")

public class RolEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @JoinTable(name = "roles_permisos", joinColumns = {
        @JoinColumn(name = "rolId", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "permisoId", referencedColumnName = "id")})
    @ManyToMany
    private List<PermisoEntity> permisoList;
    @ManyToMany(mappedBy = "rolList")
    private List<UsuarioEntity> usuarioList;

    public RolEntity() {
    }

    public RolEntity(Integer id) {
        this.id = id;
    }

    public RolEntity(Integer id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<PermisoEntity> getPermisoList() {
        return permisoList;
    }

    public void setPermisoList(List<PermisoEntity> permisoList) {
        this.permisoList = permisoList;
    }

    public List<UsuarioEntity> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<UsuarioEntity> usuarioList) {
        this.usuarioList = usuarioList;
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
        if (!(object instanceof RolEntity)) {
            return false;
        }
        RolEntity other = (RolEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "adapters.output.persistence.entity.Rol[ id=" + id + " ]";
    }
    
}
