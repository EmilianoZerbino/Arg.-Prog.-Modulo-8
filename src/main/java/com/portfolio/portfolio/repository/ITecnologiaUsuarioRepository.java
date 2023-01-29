package com.portfolio.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.portfolio.model.TecnologiaUsuario;

@Repository
public interface ITecnologiaUsuarioRepository extends JpaRepository <TecnologiaUsuario,Long>{

}
