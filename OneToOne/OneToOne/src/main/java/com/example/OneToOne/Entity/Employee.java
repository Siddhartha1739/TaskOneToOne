package com.example.OneToOne.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="EmployeeAddress")
public class Employee {
    @Id
    private int empId;
    private String firstName;
    private String lastName;
    private String role;
    private int salary;
    @Embedded
    private Address address;
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn()
    private EmpProfile empProfile;

    public Employee() {
    }

    public Employee(int empId, String firstName, String lastName, String role, int salary, Address address, EmpProfile empProfile) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.salary = salary;
        this.address = address;
        this.empProfile = empProfile;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public EmpProfile getEmpProfile() {
        return empProfile;
    }

    public void setEmpProfile(EmpProfile empProfile) {
        this.empProfile = empProfile;
    }
}
