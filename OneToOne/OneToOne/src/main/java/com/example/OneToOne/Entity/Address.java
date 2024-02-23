package com.example.OneToOne.Entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

@Embeddable
public class Address {
    private int AddressId;
    private int PinCode;
    private String City;

    public Address() {
        super();
    }

    public Address(int addressId, int pinCode, String city) {
        super();
        AddressId = addressId;
        PinCode = pinCode;
        City = city;
    }

    public int getAddressId() {
        return AddressId;
    }

    public void setAddressId(int addressId) {
        AddressId = addressId;
    }

    public int getPinCode() {
        return PinCode;
    }

    public void setPinCode(int pinCode) {
        PinCode = pinCode;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
