package com.manhlongvu.icoffee.model;

import java.util.Date;

public class EmployeeWorkDay {
    private int employeeID;
    private Date workDay;

    public EmployeeWorkDay() {
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public Date getWorkDay() {
        return workDay;
    }

    public void setWorkDay(Date workDay) {
        this.workDay = workDay;
    }
}

