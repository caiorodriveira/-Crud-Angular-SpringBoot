package com.backend.pessoas.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.pessoas.model.Pessoa;
import com.backend.pessoas.service.PessoaService;

@RestController
@RequestMapping ("/pessoas/")
public class PessoaREST {
	
	@Autowired
	private PessoaService pessoaService;
	
	@GetMapping
	private ResponseEntity<List<Pessoa>> getAllPessoas() {
		return ResponseEntity.ok(pessoaService.findAll());
	}
	
	@PostMapping
	private ResponseEntity<Pessoa> savePessoa (@RequestBody Pessoa pessoa){
		try {
		Pessoa pessoaSalva = pessoaService.save(pessoa);
		return ResponseEntity.created(new URI ("/pessoas/" + pessoaSalva.getId())).body(pessoaSalva);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deletePessoaEntity (@PathVariable("id") Long id){
		pessoaService.deleteById(id);
		return ResponseEntity.ok(!(pessoaService.findById(id)!=null));
	}
}
