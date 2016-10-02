package com.mkrt4an.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by 123 on 02.10.2016.
 */
@Entity
@Table(name = "order", schema = "transportproject")
public class OrderEntity {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "UID", nullable = true)
    private Integer uid;

    @Column(name = "status", nullable = true)
    private Integer status;

    @OneToMany (mappedBy = "routePoint")
    private List<RoutePointEntity> routePointList;

    @OneToMany (mappedBy = "driver")
    private List<DriverEntity> driverList;

    @OneToOne   //  (cascade = CascadeType.DETACH)
    @JoinColumn(name = "truck_id")
    private TruckEntity currentTruck;


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setCurrentTruck(TruckEntity currentTruck) {
        this.currentTruck = currentTruck;
    }
    public TruckEntity getCurrentTruck() {
        return currentTruck;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderEntity that = (OrderEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
