package com.example.OneToOne.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EmployeeProfile")
public class EmpProfile {
    @Id
    private long id;
    private String Gender;
    private long phoneNumber;

    public EmpProfile() {
    }

    public EmpProfile(long id, String gender, long phoneNumber) {
       id=id;
       this.Gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long Id) {
        id = Id;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
