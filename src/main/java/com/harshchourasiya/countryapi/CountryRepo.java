package com.harshchourasiya.countryapi;

import com.harshchourasiya.countryapi.Model.Country;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CountryRepo extends CrudRepository<Country, Integer> {

    List<Country> findByName(String name);

    List<Country> findByCode(String code);

    @Query("from Country where name LIKE ?1% order by name")
    List<Country> searchByCountry(String country);

}
