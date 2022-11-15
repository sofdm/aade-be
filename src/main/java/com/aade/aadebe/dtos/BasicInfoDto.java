package com.aade.aadebe.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class BasicInfoDto implements Serializable {

    @JsonProperty("afm")
    @Size(max = 9)
    private String afm;

    @JsonProperty("doy")
    private String doy;

    @JsonProperty("doyDescr")
    private String doyDescr;

    @JsonProperty("iNiFlag")
    private String iNiFlag;

    @JsonProperty("onomasia")
    private String onomasia;

    @JsonProperty("mothersFirstName")
    private String mothersFirstName;

    @JsonProperty("birthDate")
    private Date birthDate;

    @JsonProperty("birthPlace")
    private String birthPlace;

    @JsonProperty("cntResidenceDescr")
    private String cntResidenceDescr;

    @JsonProperty("residenceAddress")
    private String residenceAddress;

    @JsonProperty("residenceAddressNo")
    private String residenceAddressNo;

    @JsonProperty("residenceZipCode")
    private String residenceZipCode;

    @JsonProperty("residenceParDescr")
    private String residenceParDescr;

    @JsonProperty("firmCommerTitle")
    private String firmCommerTitle;

    @JsonProperty("firmDoy")
    private String firmDoy;

    @JsonProperty("firmAddress")
    private String firmAddress;

    @JsonProperty("firmAddressNo")
    private String firmAddressNo;

    @JsonProperty("firmZipCode")
    private String firmZipCode;

    @JsonProperty("firmParDescr")
    private String firmParDescr;
}
