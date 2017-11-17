package model;

import java.util.List;

public class Curso {

	private String nome;
	private List<Disciplina> disciplinas;

	public Curso(String nome) {
		this.nome=nome;
		// TODO Auto-generated constructor stub
	}
	public Curso(String curso, List<Disciplina> disciplinas) {
		this.nome = curso;
		this.disciplinas = disciplinas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", disciplinas=" + disciplinas + "]";
	}

	
}
