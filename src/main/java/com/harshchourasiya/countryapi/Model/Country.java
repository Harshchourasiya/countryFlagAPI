package com.harshchourasiya.countryapi.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country {

    @Id
    private String name;
    private String code;
    private String capital;
    private String region;
    private String flag;


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCapital() {
        return this.capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getFlag() {
        return this.flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", code='" + getCode() + "'" +
            ", capital='" + getCapital() + "'" +
            ", region='" + getRegion() + "'" +
            ", flag='" + getFlag() + "'" +
            "}";
    }




}

    

