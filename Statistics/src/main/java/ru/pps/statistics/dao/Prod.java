package ru.pps.statistics.dao;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Prod")
public class Prod {
    public Prod(){

    }
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long statisticId;

    private String product;
    private Double currentvalue;
    private String owner;

    public Double getCurrentvalue() {
        return currentvalue;
    }

    public void setCurrentvalue(Double currentvalue) {
        this.currentvalue = currentvalue;
    }

    public Long getStatisticId() {
        return statisticId;
    }

    public void setStatisticId(Long statisticId) {
        this.statisticId = statisticId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}