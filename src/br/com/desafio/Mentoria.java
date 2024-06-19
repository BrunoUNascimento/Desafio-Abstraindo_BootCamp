package br.com.desafio;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Mentoria {
	
	private String titulo;
	private String descricao;
	private LocalDateTime data;
	
	public LocalDateTime getData() {
		return data;
	}
	public String getDescricao() {
		return descricao;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	@Override
	public String toString() {
		
		return titulo+ " " + descricao + " " + data;
	}
	
}
