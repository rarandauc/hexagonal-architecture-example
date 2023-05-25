/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucatolica.hexa.infra.adapters.output.persistence.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import jakarta.persistence.*;

/**
 *
 * @author RAF
 */
@Entity
@Table(name = "orders")
public class OrderEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "OrderID")
    private Integer orderID;
    @Column(name = "OrderDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;
    @Column(name = "RequiredDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date requiredDate;
    @Column(name = "ShippedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date shippedDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Freight")
    private BigDecimal freight;
    @Column(name = "ShipName")
    private String shipName;
    @Column(name = "ShipAddress")
    private String shipAddress;
    @Column(name = "ShipCity")
    private String shipCity;
    @Column(name = "ShipRegion")
    private String shipRegion;
    @Column(name = "ShipPostalCode")
    private String shipPostalCode;
    @Column(name = "ShipCountry")
    private String shipCountry;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderEntity")
    private List<OrderDetailEntity> orderDetailList;
    @JoinColumn(name = "CustomerID", referencedColumnName = "CustomerID")
    @ManyToOne
    private CustomerEntity customerID;
    @JoinColumn(name = "EmployeeID", referencedColumnName = "EmployeeID")
    @ManyToOne
    private EmployeeEntity employeeID;
    @JoinColumn(name = "ship_via", referencedColumnName = "ShipperID")
    @ManyToOne
    private ShipperEntity shipVia;
    @JoinColumn(name = "ShipVia", referencedColumnName = "ShipperID")
    @ManyToOne
    private ShipperEntity shipVia1;

    public OrderEntity() {
    }

    public OrderEntity(Integer orderID) {
        this.orderID = orderID;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(Date requiredDate) {
        this.requiredDate = requiredDate;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public String getShipCity() {
        return shipCity;
    }

    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }

    public String getShipRegion() {
        return shipRegion;
    }

    public void setShipRegion(String shipRegion) {
        this.shipRegion = shipRegion;
    }

    public String getShipPostalCode() {
        return shipPostalCode;
    }

    public void setShipPostalCode(String shipPostalCode) {
        this.shipPostalCode = shipPostalCode;
    }

    public String getShipCountry() {
        return shipCountry;
    }

    public void setShipCountry(String shipCountry) {
        this.shipCountry = shipCountry;
    }

    public List<OrderDetailEntity> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetailEntity> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

    public CustomerEntity getCustomerID() {
        return customerID;
    }

    public void setCustomerID(CustomerEntity customerID) {
        this.customerID = customerID;
    }

    public EmployeeEntity getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(EmployeeEntity employeeID) {
        this.employeeID = employeeID;
    }

    public ShipperEntity getShipVia() {
        return shipVia;
    }

    public void setShipVia(ShipperEntity shipVia) {
        this.shipVia = shipVia;
    }

    public ShipperEntity getShipVia1() {
        return shipVia1;
    }

    public void setShipVia1(ShipperEntity shipVia1) {
        this.shipVia1 = shipVia1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderID != null ? orderID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderEntity)) {
            return false;
        }
        OrderEntity other = (OrderEntity) object;
        if ((this.orderID == null && other.orderID != null) || (this.orderID != null && !this.orderID.equals(other.orderID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "adapters.output.persistence.entity.Orden[ orderID=" + orderID + " ]";
    }
    
}
