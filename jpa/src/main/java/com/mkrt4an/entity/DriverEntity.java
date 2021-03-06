package com.mkrt4an.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by 123 on 02.10.2016.
 */

@Entity
@Table(name = "driver", schema = "transportproject")
public class DriverEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "firstName", nullable = false, length = 45)
    private String firstName;

    @Column(name = "lastName", nullable = true, length = 45)
    private String lastName;

    @Column(name = "workedHours", nullable = false)
    private Integer workedHours;

    @Column(name = "status", nullable = false)
    private Integer status;

    @OneToOne   //  (cascade = CascadeType.DETACH)
    @JoinColumn(name= "truck_id")
    private TruckEntity currentTruck;

    @ManyToOne   //  (cascade = CascadeType.DETACH)
    @JoinColumn(name= "city_id")
    private CityEntity currentCity;

    @ManyToOne
    @JoinColumn(name= "orders_id")
    private OrderEntity order;


    public DriverEntity(String firstName, String lastName, Integer workedHours, Integer status, CityEntity currentCity) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.workedHours = workedHours;
        this.status = status;
//        this.currentTruck = currentTruck;
        this.currentCity = currentCity;
//        this.order = order;
    }

    public DriverEntity(String firstName) {

        this.firstName = firstName;
    }

    public DriverEntity(){}



    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getWorkedHours() {
        return workedHours;
    }
    public void setWorkedHours(Integer workedHours) {
        this.workedHours = workedHours;
    }

    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }

    public TruckEntity getCurrentTruck() {
        return currentTruck;
    }
//    public String getCurrentTruck() {
//        return currentTruck.getRegNumber();
//    }
    public void setCurrentTruck(TruckEntity currentTruck) {
        this.currentTruck = currentTruck;
    }

    public CityEntity getCurrentCity() {
        return currentCity;
    }

//    public String getCurrentCity() {
//        return currentCity.getName();
//    }
    public void setCurrentCity(CityEntity currentCity) {
        this.currentCity = currentCity;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DriverEntity that = (DriverEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (workedHours != null ? !workedHours.equals(that.workedHours) : that.workedHours != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (currentTruck != null ? !currentTruck.equals(that.currentTruck) : that.currentTruck != null) return false;
        if (currentCity != null ? !currentCity.equals(that.currentCity) : that.currentCity != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (workedHours != null ? workedHours.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (currentTruck != null ? currentTruck.hashCode() : 0);
        result = 31 * result + (currentCity != null ? currentCity.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "DriverEntity{" +
                "id=" + id +
                ", firstName=" + firstName + '\'' +
                ", lastName=" + lastName + '\'' +
                ", workedHours=" + workedHours +
                ", status=" + status +
                ", currentTruck=" + currentTruck.getRegNumber() +
                ", currentCity=" + currentCity.getName() +
//                ", driver=" + driver +
                '}' + "\n";
    }
}
