package com.learn.SpringBatch.dao.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Voltage {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (name = "volt", precision = 10, scale = 4, nullable = false)
    private BigDecimal volt;

    @Column (name = "time", nullable = false)
    private double time;

    public Voltage() {
    }

    public Voltage(BigDecimal volt, double time) {
        this.volt = volt;
        this.time = time;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getVolt() {
        return volt;
    }

    public void setVolt(BigDecimal volt) {
        this.volt = volt;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Voltage{" +
                "id=" + id +
                ", volt=" + volt +
                ", time=" + time +
                '}';
    }
}
