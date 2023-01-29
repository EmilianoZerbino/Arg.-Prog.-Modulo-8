package com.portfolio.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.portfolio.model.Trabajo;

@Repository
public interface ITrabajoRepository extends JpaRepository <Trabajo,Long>{

}
