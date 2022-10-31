package com.harshchourasiya.countryapi.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
public class Country {

    @Id
    private String name;

    private String code;

    private String capital;

    private String region;

    private String flag;

}

    

