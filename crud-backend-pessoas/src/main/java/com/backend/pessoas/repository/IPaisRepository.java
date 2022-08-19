package com.backend.pessoas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.pessoas.model.Pais;


public interface IPaisRepository extends JpaRepository<Pais, Long>{

}
