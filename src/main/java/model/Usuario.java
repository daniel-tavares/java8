package model;


public class Usuario{
	String nome;
	boolean situacao;
	

	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	public Usuario(String nome, boolean situacao) {
		super();
		this.nome = nome;
		this.situacao = situacao;
	}

	public Usuario(String nome) {
		this.nome=nome;
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	public boolean isSituacao() {
		return situacao;
	}

	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}

	public void ativarUsuario() {
		situacao=true;
	}

	public void desativarUsuario() {
		situacao=false;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", situacao=" + situacao + "]";
	}


}