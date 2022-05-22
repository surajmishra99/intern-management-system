package com.internmanagementsystem.internmanagementsys.controller;

import com.internmanagementsystem.internmanagementsys.beans.ResponseBean;
import com.internmanagementsystem.internmanagementsys.models.Designation;
import com.internmanagementsystem.internmanagementsys.services.DesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class DesignationController {

    @Autowired
    DesignationService designationService;

    @RequestMapping("/hello")
    @ResponseBody
    public String helloUSer( ){
        return "hello World";
    }

    @RequestMapping(value="/addDesignation", method = RequestMethod.GET)
    @ResponseBody
    public ResponseBean addDesignation(Designation designation){
        ResponseBean rsp =  designationService.addDesignation(designation);
        return rsp;
    }
}

