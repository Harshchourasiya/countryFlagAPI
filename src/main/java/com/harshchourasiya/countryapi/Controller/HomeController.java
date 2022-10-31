package com.harshchourasiya.countryapi.Controller;

import java.util.ArrayList;
import java.util.List;

import com.harshchourasiya.countryapi.CountryRepo;
import com.harshchourasiya.countryapi.Model.Country;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequiredArgsConstructor
public class HomeController {

    private final CountryRepo repo;

    // For Home
    @RequestMapping("/")
    public String home(){
        return "home.jsp";
    }

    // Here are For API

    // for All Countries details
    @RequestMapping("/all")
    @ResponseBody
    public List<Country> all(){
        ArrayList<Country> countries =  (ArrayList<Country>)repo.findAll();
        return countries;
    }

    // To get detail by country name
    @RequestMapping("/country/{name}")
    @ResponseBody
    public List<Country> country(@PathVariable String name){
        ArrayList<Country> countries =  (ArrayList<Country>)repo.findByName(name.toLowerCase());
        return countries;
    }

    // to get detail by country code
    @RequestMapping("/code/{code}")
    @ResponseBody
    public List<Country> code(@PathVariable String code){
        ArrayList<Country> countries =  (ArrayList<Country>)repo.findByCode(code.toUpperCase());
        return countries;
    }

    // to search by country name
    @RequestMapping("/search/{name}")
    @ResponseBody
    public List<Country> search(@PathVariable String name){
        ArrayList<Country> countries =  (ArrayList<Country>)repo.searchByCountry(name.toLowerCase());
        return countries;
    }
}
