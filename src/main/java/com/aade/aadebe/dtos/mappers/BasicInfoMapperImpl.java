package com.aade.aadebe.dtos.mappers;

import com.aade.aadebe.dtos.BasicInfoDto;
import com.aade.aadebe.jpa.models.BasicInfo;
import org.springframework.stereotype.Component;

@Component
public class BasicInfoMapperImpl implements BasicInfoMapper {

    @Override
    public BasicInfoDto convertToDto (BasicInfo basicInfo) {
        if (basicInfo == null) {
            return null;
        }
        BasicInfoDto dto = new BasicInfoDto();
        dto.setAfm(basicInfo.getAfm());
        dto.setBirthDate(basicInfo.getBirthDate());
        dto.setBirthPlace(basicInfo.getBirthPlace());
        dto.setDoy(basicInfo.getDoy());
        dto.setDoyDescr(basicInfo.getDoyDescr());
        dto.setOnomasia(basicInfo.getOnomasia());
        dto.setMothersFirstName(basicInfo.getMothersFirstName());
        dto.setResidenceAddress(basicInfo.getResidenceAddress());
        dto.setResidenceParDescr(basicInfo.getResidenceParDescr());
        dto.setResidenceZipCode(basicInfo.getResidenceZipCode());
        dto.setResidenceAddressNo(basicInfo.getResidenceAddressNo());

        return dto;
    }
}