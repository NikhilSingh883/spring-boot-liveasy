package com.example.internship.liveasy.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="loads")
public class Load {

    @Id
    private Long id;
    private String loadingPoint;
    private String unloadingPoint;
    private String productType;
    private String truckType;
    private Long noOfTrucks;
    private Float weight;
    private String comment;
    private Long shipperId;
    private Date date;
    public Load(){}
    public Load(Long id, String loadingPoint, String unloadingPoint, String productType, String truckType, long noOfTrucks, float weight, String comment, Long shipperId, Date date) {
        this.id = id;
        this.loadingPoint = loadingPoint;
        this.unloadingPoint = unloadingPoint;
        this.productType = productType;
        this.truckType = truckType;
        this.noOfTrucks = noOfTrucks;
        this.weight = weight;
        this.comment = comment;
        this.shipperId = shipperId;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoadingPoint() {
        return loadingPoint;
    }

    public void setLoadingPoint(String loadingPoint) {
        this.loadingPoint = loadingPoint;
    }

    public String getUnloadingPoint() {
        return unloadingPoint;
    }

    public void setUnloadingPoint(String unloadingPoint) {
        this.unloadingPoint = unloadingPoint;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public long getNoOfTrucks() {
        return noOfTrucks;
    }

    public void setNoOfTrucks(long noOfTrucks) {
        this.noOfTrucks = noOfTrucks;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Long getShipperId() {
        return shipperId;
    }

    public void setShipperId(Long shipperId) {
        this.shipperId = shipperId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Load{" +
                "id='" + id + '\'' +
                ", loadingPoint='" + loadingPoint + '\'' +
                ", unloadingPoint='" + unloadingPoint + '\'' +
                ", productType='" + productType + '\'' +
                ", truckType='" + truckType + '\'' +
                ", noOfTrucks=" + noOfTrucks +
                ", weight=" + weight +
                ", comment='" + comment + '\'' +
                ", shipperId='" + shipperId + '\'' +
                ", date=" + date +
                '}';
    }
}
