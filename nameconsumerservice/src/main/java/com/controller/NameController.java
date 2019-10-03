package com.controller;

import com.service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/")
public class NameController {

    private NameService nameService;

    @RequestMapping
    @ResponseBody
    public List<String> getAllNames() {
        return nameService.getAllNames();
    }

    @RequestMapping("/man")
    @ResponseBody
    public List<String> getManNames() {
        return nameService.getManNames();
    }

    @RequestMapping("/woman")
    @ResponseBody
    public List<String> getWomanNames() {
        return nameService.getWomanNames();
    }

    @Autowired
    public void setNameService(NameService nameService) {
        this.nameService = nameService;
    }
}
