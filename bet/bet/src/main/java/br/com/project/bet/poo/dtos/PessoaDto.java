package br.com.project.bet.poo.dtos;

import java.util.Date;

public class PessoaDto {

	private String nome;
	private String email;
	private String senha;
	private String CPF;
	private Date dataNascimento;
	private String genero;
	private String endereco;
	private String telefone;
	
	

	public PessoaDto(int idPessoa, String nome, String email, String senha) {
		super();
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public PessoaDto autenticarLogin(String nomeUsuario, String senhaUsuario) {
		
		
		pessoa = 
		return login;
		
	}
	
	public void realizarLogout() {
		
	}

}
