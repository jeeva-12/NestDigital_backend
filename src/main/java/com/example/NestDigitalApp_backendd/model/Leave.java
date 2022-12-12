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
    private String leavetype;
    private String remark;
    private int empid;
    private String fromdate;
    private String todate;
    private String leaveapplydate;

    public Leave() {
    }

    public Leave(int id, String leavetype, String remark, int empid, String fromdate, String todate, String leaveapplydate) {
        this.id = id;
        this.leavetype = leavetype;
        this.remark = remark;
        this.empid = empid;
        this.fromdate = fromdate;
        this.todate = todate;
        this.leaveapplydate = leaveapplydate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLeavetype() {
        return leavetype;
    }

    public void setLeavetype(String leavetype) {
        this.leavetype = leavetype;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
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

    public String getLeaveapplydate() {
        return leaveapplydate;
    }

    public void setLeaveapplydate(String leaveapplydate) {
        this.leaveapplydate = leaveapplydate;
    }
}
