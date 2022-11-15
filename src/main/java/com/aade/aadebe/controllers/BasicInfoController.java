package com.aade.aadebe.controllers;

import com.aade.aadebe.dtos.BasicInfoDto;
import com.aade.aadebe.services.BasicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("aade")
public class BasicInfoController {

    @Autowired
    private BasicInfoService basicInfoService;

    /**
     *
     * @param afm
     * @return
     */
    @GetMapping("/basicInfo")
    public BasicInfoDto retrieveInfoByAFM(@RequestParam("afm") String afm) {
        return basicInfoService.retrieveInfoByAFM(afm);
    }
}
