package com.portfolio.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.portfolio.model.Formacion;

@Repository
public interface IFormacionRepository extends JpaRepository <Formacion,Long>{

}
