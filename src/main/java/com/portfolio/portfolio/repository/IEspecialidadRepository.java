package com.portfolio.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.portfolio.model.Especialidad;

@Repository
public interface IEspecialidadRepository extends JpaRepository <Especialidad,Long>{

}
