package com.aade.aadebe.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.Size;
import java.io.Serializable;

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

    @JsonProperty("firmFlag")
    private String firmFlag;

    @JsonProperty("deactivationFlag")
    private String deactivationFlag;

    @JsonProperty("onomasia")
    private String onomasia;

    @JsonProperty("ninLegalPurpose")
    private Integer ninLegalPurpose;

    @JsonProperty("ninLegalPurposeDescr")
    private String ninLegalPurposeDescr;

    @JsonProperty("ninLegalStatus")
    private Integer ninLegalStatus;

    @JsonProperty("ninLegalStatusDescr")
    private String ninLegalStatusDescr;

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

    @JsonProperty("frmFstStateDescr")
    private String frmFstStateDescr;

    @JsonProperty("firmPhone")
    private String firmPhone;

    public BasicInfoDto(String afm, String doy, String doyDescr, String firmFlag, String deactivationFlag, String onomasia) {
        this.afm = afm;
        this.doy = doy;
        this.doyDescr = doyDescr;
        this.firmFlag = firmFlag;
        this.deactivationFlag = deactivationFlag;
        this.onomasia = onomasia;
    }
}
