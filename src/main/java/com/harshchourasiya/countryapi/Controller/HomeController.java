package com.harshchourasiya.countryapi.Controller;

import com.harshchourasiya.countryapi.CountryRepo;
import com.harshchourasiya.countryapi.Model.Country;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequiredArgsConstructor
public class HomeController {

    private final CountryRepo repo;

    @RequestMapping("/")
    public String home() {
        return "home.jsp";
    }

    @GetMapping("/all")
    @ResponseBody
    public List<Country> getAllCountries() {
        return (List<Country>) repo.findAll();
    }

    @GetMapping("/country/{name}")
    @ResponseBody
    public List<Country> getCountryByName(@PathVariable String name) {
        return repo.findByName(name.toLowerCase());
    }

    @GetMapping("/code/{code}")
    @ResponseBody
    public List<Country> getCountryByCode(@PathVariable String code) {
        return repo.findByCode(code.toUpperCase());
    }

    @GetMapping("/search/{name}")
    @ResponseBody
    public List<Country> searchCountryByName(@PathVariable String name) {
        return repo.searchByCountry(name.toLowerCase());
    }
}
