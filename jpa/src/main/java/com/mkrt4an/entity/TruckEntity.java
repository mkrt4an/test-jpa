package com.mkrt4an.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by 123 on 02.10.2016.
 */
@Entity
@Table(name = "truck", schema = "transportproject")
public class TruckEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "dutySize", nullable = false)
    private Integer dutySize;

    @Column(name = "capasity", nullable = false)
    private Integer capasity;

    @Column(name = "status", nullable = false)
    private Integer status;

    @Column(name = "regNumber", nullable = false, length = 45)
    private String regNumber;

    @OneToOne   //  (cascade = CascadeType.DETACH)
    @JoinColumn(name = "city_id")
    private CityEntity currentCity;


//    @OneToOne(mappedBy = "currentTruck", cascade = CascadeType.ALL)
//    @OneToOne(mappedBy = "currentTruck", cascade = CascadeType.ALL)
    @OneToOne
    @JoinColumn(name= "orders_id")
    private OrderEntity orders;


    public TruckEntity(){}

    public TruckEntity(Integer dutySize, Integer capasity, Integer status, String regNumber) {
        this.dutySize = dutySize;
        this.capasity = capasity;
        this.status = status;
        this.regNumber = regNumber;
        this.currentCity = currentCity;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDutySize() {
        return dutySize;
    }
    public void setDutySize(Integer dutySize) {
        this.dutySize = dutySize;
    }

    public Integer getCapasity() {
        return capasity;
    }
    public void setCapasity(Integer capasity) {
        this.capasity = capasity;
    }

    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRegNumber() {
        return regNumber;
    }
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public CityEntity getCurrentCity() { return currentCity; }
    public void setCurrentCity(CityEntity currentCity) { this.currentCity = currentCity; }

//    public OrderEntity getOrders() {
//        return orders;
//    }
//    public void setOrders(OrderEntity order) {
//        this.orders = order;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TruckEntity that = (TruckEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (dutySize != null ? !dutySize.equals(that.dutySize) : that.dutySize != null) return false;
        if (capasity != null ? !capasity.equals(that.capasity) : that.capasity != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (regNumber != null ? !regNumber.equals(that.regNumber) : that.regNumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (dutySize != null ? dutySize.hashCode() : 0);
        result = 31 * result + (capasity != null ? capasity.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (regNumber != null ? regNumber.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TruckEntity{" +
                "id=" + id +
                ", dutySize=" + dutySize +
                ", capasity=" + capasity +
                ", status=" + status +
                ", regNumber=" + regNumber + '\'' +
                ", currentCity=" + currentCity.getName() +
                ", order=" + orders.getId() +
                '}' + "\n";
    }
}
