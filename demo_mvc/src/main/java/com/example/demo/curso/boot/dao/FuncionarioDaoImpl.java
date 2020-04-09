package com.example.demo.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.example.demo.curso.boot.domain.Funcionarios;

@Repository
public class FuncionarioDaoImpl extends abstractDao<Funcionarios, Long> implements FuncionarioDao{

}
