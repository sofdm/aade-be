package com.aade.aadebe.controllers;

import com.aade.aadebe.dtos.BasicInfoDto;
import com.aade.aadebe.services.BasicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("basicInfo")
public class BasicInfoController {

    @Autowired
    private BasicInfoService basicInfoService;

    @GetMapping("/person")
    public BasicInfoDto retrieveInfoByAFM() {
        var afm1 = "12345";
        return basicInfoService.retrieveInfoByAFM(afm1);
    }
}
