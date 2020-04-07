package com.example.demo.curso.boot.domain;

public enum UF {
	AC("AC", "Acre"), 
	AL("AL", "Alagoas"),
	AM("AM", "Amazonas"),
	BA("BA", "Bahia"),
	CE("CE", "Ceara"),
	DF("DF", "Distrito Federal"),
	ES("ES", "Espirito Santo"),
	GO("GO", "Goiss"),
	MA("MA", "Maranhao"),
	MT("MT", "Mato Grosso"),
	MS("MS", "Mato Grosso do Sul"),
	MG("MG", "Minas Gerais"),
	PA("PA", "Para"),
	PB("PB", "Paraiba"),
	PR("PR", "Parana"),
	PE("PE", "Pernambuco"),
	PI("PI", "Piaui"),
	RJ("RJ", "Rio de Janeiro"),
	RN("RN", "Rio Grande do Norte"),
	RS("RS", "Rio Grande do Sul"),
	RO("RO", "Rondonia"),
	RR("RR", "Roraima"),
	SC("SC", "Santa Catarina"),
	SP("SP", "Sao Paulo"),
	SE("SE", "Sergipe"),
	TO("TO", "Tocantins");
	
	private String sigla;
	private String descricao;
	
	UF(String sigla, String descricao) {
		this.sigla=sigla;
		this.descricao=descricao;
	}
}
