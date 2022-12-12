package com.example.NestDigitalApp_backendd.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "leavecount")
public class LeaveCount {
    @Id
    @GeneratedValue
    private int id;
    private String empid;
    private String year;
    private int sickleave;
    private int causalleave;
    private int specialleave;
    private boolean status;

    public LeaveCount() {
    }

    public LeaveCount(int id, String empid, String year, int sickleave, int causalleave, int specialleave, boolean status) {
        this.id = id;
        this.empid = empid;
        this.year = year;
        this.sickleave = sickleave;
        this.causalleave = causalleave;
        this.specialleave = specialleave;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getSickleave() {
        return sickleave;
    }

    public void setSickleave(int sickleave) {
        this.sickleave = sickleave;
    }

    public int getCausalleave() {
        return causalleave;
    }

    public void setCausalleave(int causalleave) {
        this.causalleave = causalleave;
    }

    public int getSpecialleave() {
        return specialleave;
    }

    public void setSpecialleave(int specialleave) {
        this.specialleave = specialleave;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
