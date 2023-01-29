package com.portfolio.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.portfolio.model.Contacto;

@Repository
public interface IContactoRepository extends JpaRepository <Contacto,Long>{

}
