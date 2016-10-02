package com.mkrt4an.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by 123 on 02.10.2016.
 */
@Entity
@Table(name = "routepoint", schema = "transportproject")
public class RoutePointEntity {

    @Id
    @Column(name = "order", nullable = false)
    private Integer order;

    @Column(name = "type", nullable = true, length = 45)
    private String type;

    @OneToOne
    @JoinColumn(name= "city_id")
    private CityEntity city;

    @OneToMany (mappedBy = "cargo")
    private List<CargoEntity> cargo;

    @ManyToOne
    private RoutePointEntity routePoint;


    public Integer getOrder() {
        return order;
    }
    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoutePointEntity that = (RoutePointEntity) o;

        if (order != null ? !order.equals(that.order) : that.order != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = order != null ? order.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
