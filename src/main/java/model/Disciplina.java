package model;

import java.util.ArrayList;
import java.util.Arrays;

public class Disciplina {
	private String nome;
	private int quantidadeAlunos;
	private boolean habilidado;

	public Disciplina() {
	
	}
	public Disciplina(String nome) {
		this.nome=nome;// TODO Auto-generated constructor stub
	}
	
	public Disciplina(String nome, int quantidadeAlunos) {
		this.nome = nome;
		this.quantidadeAlunos = quantidadeAlunos;
		this.habilidado=true;
	}
	public Disciplina(String nome, int quantidadeAlunos, boolean habilitado) {
		this.nome = nome;
		this.quantidadeAlunos = quantidadeAlunos;
		this.habilidado = habilitado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidadeAlunos() {
		return quantidadeAlunos;
	}

	public void setQuantidadeAlunos(int quantidadeAlunos) {
		this.quantidadeAlunos = quantidadeAlunos;
	}

	public boolean isHabilidado() {
		return habilidado;
	}

	public void setHabilidado(boolean habilidado) {
		this.habilidado = habilidado;
	}

	@Override
	public String toString() {
		return "Disciplina [nome=" + nome + ", quantidadeAlunos=" + quantidadeAlunos + ", habilidado=" + habilidado
				+ "]";
	}

	
}