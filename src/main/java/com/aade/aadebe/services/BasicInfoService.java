package com.aade.aadebe.services;

import com.aade.aadebe.dtos.BasicInfoDto;
import com.aade.aadebe.dtos.mappers.BasicInfoMapper;
import com.aade.aadebe.exceptions.AfmNotExistsException;
import com.aade.aadebe.jpa.models.BasicInfo;
import com.aade.aadebe.jpa.repositories.BasicInfoRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasicInfoService {

    @Autowired
    private BasicInfoRepository basicInfoRepository;

    @Autowired
    private final BasicInfoMapper basicInfoMapper = Mappers.getMapper(BasicInfoMapper.class);

    public BasicInfoDto retrieveInfoByAFM(String afm) {
        BasicInfo basicInfo = basicInfoRepository.findByAfm(afm).orElseThrow(AfmNotExistsException::new);
        return basicInfoMapper.convertToDto(basicInfo);
    }

}
