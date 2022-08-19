package com.backend.pessoas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.pessoas.model.Estado;

public interface IEstadoRepository extends JpaRepository<Estado, Long>{

}
