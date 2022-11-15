package com.aade.aadebe.jpa.repositories;

import com.aade.aadebe.jpa.models.BasicInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BasicInfoRepository extends JpaRepository<BasicInfo, Long> {

    List<BasicInfo> findAll();

    Optional<BasicInfo> findByAfm(String afm);
}
