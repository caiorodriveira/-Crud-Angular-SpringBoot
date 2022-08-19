package com.backend.pessoas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.pessoas.model.Pessoa;

public interface IPessoaRepository extends JpaRepository<Pessoa, Long>{

}
