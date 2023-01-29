package com.portfolio.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.portfolio.model.AcercaDe;

@Repository
public interface IAcercaDeRepository extends JpaRepository <AcercaDe,Long>{

}
