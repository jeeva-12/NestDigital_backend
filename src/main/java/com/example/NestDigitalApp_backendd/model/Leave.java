package com.example.NestDigitalApp_backendd.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "leave")
public class Leave {
    @Id
    @GeneratedValue
    private int id;
    private int empId;
    private String leaveType;
    private String remarks;
    private String fromdate;
    private String todate;
    private String applydate;

    public Leave() {
    }

    public Leave(int id, int empId, String leaveType, String remarks, String fromdate, String todate, String applydate) {
        this.id = id;
        this.empId = empId;
        this.leaveType = leaveType;
        this.remarks = remarks;
        this.fromdate = fromdate;
        this.todate = todate;
        this.applydate = applydate;
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

    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getFromdate() {
        return fromdate;
    }

    public void setFromdate(String fromdate) {
        this.fromdate = fromdate;
    }

    public String getTodate() {
        return todate;
    }

    public void setTodate(String todate) {
        this.todate = todate;
    }

    public String getApplydate() {
        return applydate;
    }

    public void setApplydate(String applydate) {
        this.applydate = applydate;
    }
}
