package com.example.NestDigitalApp_backendd.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vistorlog")
public class VistorLog {
    @Id
    @GeneratedValue
    private int id;
    private String vname;
    private String purpose;
    private String whomtomeet;
    private String ventryDateTime;
    private String vexitDateTime;

    public VistorLog() {
    }

    public VistorLog(int id, String vname, String purpose, String whomtomeet, String ventryDateTime, String vexitDateTime) {
        this.id = id;
        this.vname = vname;
        this.purpose = purpose;
        this.whomtomeet = whomtomeet;
        this.ventryDateTime = ventryDateTime;
        this.vexitDateTime = vexitDateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getWhomtomeet() {
        return whomtomeet;
    }

    public void setWhomtomeet(String whomtomeet) {
        this.whomtomeet = whomtomeet;
    }

    public String getVentryDateTime() {
        return ventryDateTime;
    }

    public void setVentryDateTime(String ventryDateTime) {
        this.ventryDateTime = ventryDateTime;
    }

    public String getVexitDateTime() {
        return vexitDateTime;
    }

    public void setVexitDateTime(String vexitDateTime) {
        this.vexitDateTime = vexitDateTime;
    }
}
