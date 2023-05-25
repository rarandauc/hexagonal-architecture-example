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
@Table(name = "territories")

public class TerritoryEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TerritoryID")
    private String territoryID;
    @Basic(optional = false)
    @Column(name = "TerritoryDescription")
    private String territoryDescription;

    @JoinColumn(name = "RegionID", referencedColumnName = "RegionID")
    @ManyToOne(optional = false)
    private RegionEntity regionID;

    public TerritoryEntity() {
    }

    public TerritoryEntity(String territoryID) {
        this.territoryID = territoryID;
    }

    public TerritoryEntity(String territoryID, String territoryDescription) {
        this.territoryID = territoryID;
        this.territoryDescription = territoryDescription;

    }

    public String getTerritoryID() {
        return territoryID;
    }

    public void setTerritoryID(String territoryID) {
        this.territoryID = territoryID;
    }

    public String getTerritoryDescription() {
        return territoryDescription;
    }

    public void setTerritoryDescription(String territoryDescription) {
        this.territoryDescription = territoryDescription;
    }


    public RegionEntity getRegionID() {
        return regionID;
    }

    public void setRegionID(RegionEntity regionID) {
        this.regionID = regionID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (territoryID != null ? territoryID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TerritoryEntity)) {
            return false;
        }
        TerritoryEntity other = (TerritoryEntity) object;
        if ((this.territoryID == null && other.territoryID != null) || (this.territoryID != null && !this.territoryID.equals(other.territoryID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "adapters.output.persistence.entity.Territory[ territoryID=" + territoryID + " ]";
    }
    
}
