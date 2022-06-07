package br.unicap.estagiario.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Coordenador implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Long id;
	private String nome;
	private String idade;
	private String cpf;
	private String cargo;
	private String endereco;
	private String telefone;
	private String email;
	private String senha;
	
	public Coordenador() {}
	public Coordenador(String nome, String cpf, String cargo, String endereco, String telefone, String email,
			String idade, String senha) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.idade = idade;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public Long getId() {
		return id;
	}

	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Override
	public String toString() {
		return "Coordenador [nome=" + nome + ", cpf=" + cpf + ", cargo=" + cargo + ", endereco=" + endereco
				+ ", telefone=" + telefone + ", email=" + email + ", idade=" + idade + "]";
	}

}
