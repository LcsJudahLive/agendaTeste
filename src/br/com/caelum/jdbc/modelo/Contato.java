package br.com.caelum.jdbc.modelo;

import java.util.Calendar;

public class Contato {
	private Long id;
	private String nome;
	private String email;
	private String endereco;
	private Calendar dataNascimento;
	public Long getId() {
		return id;
	}
	public void setId(Long novo) {
		this.id = novo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String novo) {
		this.nome = novo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String novo) {
		this.email = novo;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String novo) {
		this.endereco = novo;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar novo) {
		this.dataNascimento = novo;
	}
	

}
