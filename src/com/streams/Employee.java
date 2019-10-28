package com.streams;

public class Employee {

    private String empName;
    private String eCode;
    private Double salary;
    private String departmentName;

    public Employee(String empName, String eCode, Double salary,String departmentName) {
        this.empName = empName;
        this.eCode = eCode;
        this.salary = salary;
        this.departmentName=departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String geteCode() {
        return eCode;
    }

    public void seteCode(String eCode) {
        this.eCode = eCode;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

}
