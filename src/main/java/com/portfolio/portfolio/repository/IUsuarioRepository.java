package com.portfolio.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.portfolio.model.Usuario;

@Repository
public interface IUsuarioRepository extends JpaRepository <Usuario,Long>{

}
