package com.example.demo.curso.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //definir que a classe é controller
@RequestMapping("/funcionarios") // 
public class FuncionarioController {
	@GetMapping("/cadastrar") // o nome da pagina 
	public String cadastrar() {
		return "/funcionario/cadastro";
	}
	
	@GetMapping("/listar") // o nome da pagina 
	public String listar() {
		return "/funcionario/lista";
	}
}
