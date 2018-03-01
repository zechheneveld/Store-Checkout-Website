package com.zech.citrusLemon.controller;

import com.zech.citrusLemon.data.InfoRepository;
import com.zech.citrusLemon.data.MathRepository;
import com.zech.citrusLemon.models.InfoEntry;
import com.zech.citrusLemon.models.MathEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {

    @Autowired
    private MathRepository mathRepository;
    @Autowired
    private InfoRepository infoRepository;

    @RequestMapping("/")
    public String baseRoute(){
        return "index";
    }

    @RequestMapping("/math/{regQty}/{strQty}")
    public String doMath(
            @PathVariable String regQty,
            @PathVariable String strQty,
            ModelMap modelMap
            ){

        MathEntry newEntry = new MathEntry(regQty, strQty);
        mathRepository.addEntry(newEntry);
        modelMap.put("entry", newEntry);
        return "checkout";
    }
    @RequestMapping("/log")
    public String getMath(ModelMap modelMap){
        modelMap.put("mathrepo", mathRepository.getAllEntries());
        return "log";
    }
    @RequestMapping("/name/{firstName}/{lastName}/{address}/{city}/{state}/{zipCode}/{creditCard}/{expiration}/{CSV}")
    public String doName(
            @PathVariable String firstName,
            @PathVariable String lastName,
            @PathVariable String address,
            @PathVariable String city,
            @PathVariable String state,
            @PathVariable String zipCode,
            @PathVariable String creditCard,
            @PathVariable String expiration,
            @PathVariable String CSV,
            ModelMap modelMap
            ){
        InfoEntry newInfo = new InfoEntry (firstName, lastName, address, city, state, zipCode, creditCard, expiration, CSV);
        infoRepository.addEntry(newInfo);
        modelMap.put("whatever", mathRepository.getLastEntry());
        modelMap.put("info", newInfo);
        return "confirm";
    }
//    @RequestMapping("/log")
//    public String getName (ModelMap modelMap){
//        modelMap.put("namerepo", infoRepository.getAllEntry());
//        return "log";
//    }
}
