package com.controller;

import com.service.NameProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NameController {

    private NameProducerService nameProducerService;

    @GetMapping(value = "/")
    @ResponseBody
    public String produceName() {
        return nameProducerService.produceName();
    }

    @Autowired
    public void setNameProducerService(NameProducerService nameProducerService) {
        this.nameProducerService = nameProducerService;
    }
}
