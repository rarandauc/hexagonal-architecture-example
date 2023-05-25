/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucatolica.hexa.infra.adapters.output.persistence.entity;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 *
 * @author RAF
 */
@Embeddable
public class OrderDetailPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "OrderID")
    private int orderID;
    @Basic(optional = false)
    @Column(name = "ProductID")
    private int productID;

    public OrderDetailPK() {
    }

    public OrderDetailPK(int orderID, int productID) {
        this.orderID = orderID;
        this.productID = productID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) orderID;
        hash += (int) productID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderDetailPK)) {
            return false;
        }
        OrderDetailPK other = (OrderDetailPK) object;
        if (this.orderID != other.orderID) {
            return false;
        }
        if (this.productID != other.productID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.business.modelo.adapters.output.persistence.entity.OrderDetailPK[ orderID=" + orderID + ", productID=" + productID + " ]";
    }
    
}
