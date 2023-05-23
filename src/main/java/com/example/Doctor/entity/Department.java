package com.example.Doctor.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "department_table")
public class Department {

    @Id
    @GeneratedValue
    private int department_id;
    private String departmentname;

    public Department() {
    }

    public Department(int department_id, String departmentname) {
        this.department_id = department_id;
        this.departmentname = departmentname;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }
}
