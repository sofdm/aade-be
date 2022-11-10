package com.aade.aadebe.services;

import com.aade.aadebe.dtos.BasicInfoDto;
import org.springframework.stereotype.Service;

@Service
public class BasicInfoService {

    public BasicInfoDto retrieveInfoByAFM(String afm) {
        return new BasicInfoDto("123445678", "test", "test", "test", "test", "sofia dimou epa");
    }


}
