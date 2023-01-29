package com.portfolio.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.portfolio.model.SkillUsuario;

@Repository
public interface ISkillUsuarioRepository extends JpaRepository <SkillUsuario,Long>{

}
