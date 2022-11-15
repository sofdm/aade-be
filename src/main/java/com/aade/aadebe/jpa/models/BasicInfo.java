package com.aade.aadebe.jpa.models;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "basicInfo")
@Getter
@Setter
public class BasicInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false, insertable = false)
    private Long Id;

    @Column(name = "afm")
    @NonNull
    @NotNull
    @Size(max = 9)
    private String afm;

    @Column(name = "doy")
    private String doy;

    @Column(name = "doy_descr")
    @Size(max = 60)
    private String doyDescr;

    @Column(name = "ini_flag")
    private String iNiFlag;

    @Column(name = "onomasia")
    @Size(max = 120)
    private String onomasia;

    @Column(name = "mothers_first_name")
    @Size(max = 20)
    private String mothersFirstName;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "birth_place")
    @Size(max = 60)
    private String birthPlace;

    @Column(name = "cnt_residence_descr")
    @Size(max = 40)
    private String cntResidenceDescr;

    @Column(name = "residence_address")
    @Size(max = 60)
    private String residenceAddress;

    @Column(name = "residence_address_no")
    @Size(max = 9)
    private String residenceAddressNo;

    @Column(name = "residence_zip_code")
    @Size(max = 5)
    private String residenceZipCode;

    @Column(name = "residence_par_descr")
    @Size(max = 40)
    private String residenceParDescr;

    @Column(name = "firm_commer_title")
    @Size(max = 80)
    private String firmCommerTitle;

    @Column(name = "firm_doy")
    @Size(max = 4)
    private String firmDoy;

    @Column(name = "firm_address")
    @Size(max = 60)
    private String firmAddress;

    @Column(name = "firm_address_no")
    @Size(max = 9)
    private String firmAddressNo;

    @Column(name = "firm_zip_code")
    @Size(max = 5)
    private String firmZipCode;

    @Column(name = "firm_par_descr")
    @Size(max = 40)
    private String firmParDescr;
}
