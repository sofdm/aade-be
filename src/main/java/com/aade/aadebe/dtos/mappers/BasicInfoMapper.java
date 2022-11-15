package com.aade.aadebe.dtos.mappers;
import com.aade.aadebe.dtos.BasicInfoDto;
import com.aade.aadebe.jpa.models.BasicInfo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BasicInfoMapper {

    BasicInfoMapper INSTANCE = Mappers.getMapper(BasicInfoMapper.class);

    BasicInfoDto convertToDto(BasicInfo company);
}
