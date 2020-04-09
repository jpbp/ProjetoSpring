package com.example.demo.curso.boot.dao;

import java.util.List;


import com.example.demo.curso.boot.domain.Funcionarios;

public interface FuncionarioDao {
void save(Funcionarios departamento);
	
	void update(Funcionarios departamento);
	
	void delete (Long id);
	
	Funcionarios findById(Long id);
	
	List<Funcionarios> findAll();
}
