package com.example.demo.curso.boot.dao;

import java.util.List;

import com.example.demo.curso.boot.domain.Cargo;

public interface CargoDao {
void save(Cargo departamento);
	
	void update(Cargo departamento);
	
	void delete (Long id);
	
	Cargo findById(Long id);
	
	List<Cargo> findAll();
}