package com.example.demo.curso.boot.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="FUNCIONARIOS")
public class Funcionarios extends AbstractEntity<Long> {

	@Column(name="nome",nullable=false,length = 60)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="id_cargo_fk") //referenciar a chave estrangueira cargo
	private Cargo cargos;
	
	@OneToOne (cascade= CascadeType.ALL) //remocçaõ de funcionarrio e do endereco junto 
	@JoinColumn(name="id_endereco_fk") //referenciar a chave estrangueira
	private Enderecos enderecos;
	
	@Column(nullable = false, columnDefinition = "DECIMAL(7,2) DEFAULT 0.00" )
	private BigDecimal salario;
	
	@Column(name="data_entrada", nullable = false, columnDefinition = "DATE")
	private LocalDate dataEntrada;
	
	@Column(name="data_saida", columnDefinition = "DATE")
	private LocalDate dataSaida;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cargo getCargos() {
		return cargos;
	}

	public void setCargos(Cargo cargos) {
		this.cargos = cargos;
	}

	public Enderecos getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(Enderecos enderecos) {
		this.enderecos = enderecos;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public LocalDate getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public LocalDate getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(LocalDate dataSaida) {
		this.dataSaida = dataSaida;
	}
	
	
}
