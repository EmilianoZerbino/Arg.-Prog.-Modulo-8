package com.portfolio.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.portfolio.model.Tecnologia;

@Repository
public interface ITecnologiaRepository extends JpaRepository <Tecnologia,Long>{

}
