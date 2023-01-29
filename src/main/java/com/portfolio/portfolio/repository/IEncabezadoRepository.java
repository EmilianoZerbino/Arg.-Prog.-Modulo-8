package com.portfolio.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.portfolio.model.Encabezado;

@Repository
public interface IEncabezadoRepository extends JpaRepository <Encabezado,Long>{

}
