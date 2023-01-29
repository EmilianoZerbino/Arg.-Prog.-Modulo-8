package com.portfolio.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.portfolio.model.Proyecto;

@Repository
public interface IProyectoRepository extends JpaRepository <Proyecto,Long>{

}
