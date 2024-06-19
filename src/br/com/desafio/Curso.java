package br.com.desafio;

public class Curso {

	private String nome;
	private String descricao;
	private int cargaHoraria;
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public String getDescricao() {
		return descricao;
	}
	public String getNome() {
		return nome;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		
		return nome+ " " + descricao + " " + cargaHoraria;
	}
}
