package com.harshchourasiya.countryapi.Controller;

import java.util.ArrayList;
import java.util.List;

import com.harshchourasiya.countryapi.CountryRepo;
import com.harshchourasiya.countryapi.Model.Country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

    @Autowired
    CountryRepo repo; 

    @RequestMapping("/")
    public String home(){
        return "home.jsp";
    }

    @RequestMapping("/all")
    @ResponseBody
    public List<Country> all(){
        ArrayList<Country> countries =  (ArrayList<Country>)repo.findAll();
        return countries;
    }

    @RequestMapping("/country/{name}")
    @ResponseBody
    public List<Country> country(@PathVariable String name){
        ArrayList<Country> countries =  (ArrayList<Country>)repo.findByName(name.toLowerCase());
        return countries;
    }

    @RequestMapping("/code/{code}")
    @ResponseBody
    public List<Country> code(@PathVariable String code){
        ArrayList<Country> countries =  (ArrayList<Country>)repo.findByCode(code.toUpperCase());
        return countries;
    }

    @RequestMapping("/search/{name}")
    @ResponseBody
    public List<Country> search(@PathVariable String name){
        ArrayList<Country> countries =  (ArrayList<Country>)repo.searchByCountry(name.toLowerCase());
        return countries;
    }
}
