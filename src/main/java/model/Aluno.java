package model;

import java.util.List;

public class Aluno {

	private String nome;
	private int idade;
	private boolean situacao;
	
	List<Disciplina> disciplinas;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, int idade, boolean situacao) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.situacao = situacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean isSituacao() {
		return situacao;
	}
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public void ativarAluno() {
		situacao=true;
	}
	
	public void desativarAluno() {
		situacao=false;
	}
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", situacao=" + situacao + ", disciplinas=" + disciplinas
				+ "]";
	}
	
	
	 
}
