package com.example.demo.curso.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/departamentos") //requisição da url do codigo home, departamentos
public class DepartamentoController { // ai se divide em duas funções /cadastrar, /home
	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "/departamento/cadastro";
	}
	@GetMapping("/listar")
	public String listar() {
		return "/departamento/lista";
	}
}
