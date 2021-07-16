package com.hr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
    Created with IntelliJ IDEA.
    @author: wang sir
    Date: 2021/7/16
    Time: 10:23
    To change this template use File | Settings | File Templates.
    Description: 
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String getIndex(){
        return "index";
    }

}