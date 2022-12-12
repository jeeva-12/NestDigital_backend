package com.example.NestDigitalApp_backendd.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "emplog")
public class EmpLog {
    @Id
    @GeneratedValue
    private int id;
    private int empId;
    private String date;
    private String entrydateTime;
    private String exitDateTime;


    public EmpLog() {
    }

    public EmpLog(int id, int empId, String date, String entrydateTime, String exitDateTime) {
        this.id = id;
        this.empId = empId;
        this.date = date;
        this.entrydateTime = entrydateTime;
        this.exitDateTime = exitDateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEntrydateTime() {
        return entrydateTime;
    }

    public void setEntrydateTime(String entrydateTime) {
        this.entrydateTime = entrydateTime;
    }

    public String getExitDateTime() {
        return exitDateTime;
    }

    public void setExitDateTime(String exitDateTime) {
        this.exitDateTime = exitDateTime;
    }
}
