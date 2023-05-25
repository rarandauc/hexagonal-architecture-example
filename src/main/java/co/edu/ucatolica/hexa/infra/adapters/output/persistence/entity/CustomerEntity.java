/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucatolica.hexa.infra.adapters.output.persistence.entity;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

import co.edu.ucatolica.hexa.infra.adapters.output.persistence.entity.OrderEntity;
import jakarta.persistence.*;

/**
 *
 * @author RAF
 */
@Entity
@Table(name = "customers")
public class CustomerEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CustomerID")
    private String customerID;
    @Basic(optional = false)
    @Column(name = "CompanyName")
    private String companyName;
    @Column(name = "ContactName")
    private String contactName;
    @Column(name = "ContactTitle")
    private String contactTitle;
    @Column(name = "Address")
    private String address;
    @Column(name = "City")
    private String city;
    @Column(name = "Region")
    private String region;
    @Column(name = "PostalCode")
    private String postalCode;
    @Column(name = "Country")
    private String country;
    @Column(name = "Phone")
    private String phone;
    @Column(name = "Fax")
    private String fax;
    /*@OneToMany(mappedBy = "customerID")
    private List<OrderEntity> ordenList;
    */

    public CustomerEntity() {
    }

    public CustomerEntity(String customerID) {
        this.customerID = customerID;
    }

    public CustomerEntity(String customerID, String companyName) {
        this.customerID = customerID;
        this.companyName = companyName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

   /* public List<OrderEntity> getOrdenList() {
        return ordenList;
    }

    public void setOrdenList(List<OrderEntity> ordenList) {
        this.ordenList = ordenList;
    }
    */


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerID != null ? customerID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomerEntity)) {
            return false;
        }
        CustomerEntity other = (CustomerEntity) object;
        if ((this.customerID == null && other.customerID != null) || (this.customerID != null && !this.customerID.equals(other.customerID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "adapters.output.persistence.entity.Customer[ customerID=" + customerID + " ]";
    }
    
}
