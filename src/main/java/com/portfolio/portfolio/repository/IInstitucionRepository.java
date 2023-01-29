package com.portfolio.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.portfolio.model.Institucion;

@Repository
public interface IInstitucionRepository extends JpaRepository <Institucion,Long>{

}
