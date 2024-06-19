package br.com.desafio;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
public static void main(String[] args) {
	Curso curso1 = new Curso();
	curso1.setNome("Engenharia de software");
	curso1.setDescricao("Ensina umas coisa la");
	curso1.setCargaHoraria(5000);
	
	System.out.println(curso1.toString());
	
	Mentoria mentoria = new Mentoria();
	
	mentoria.setTitulo("Java");
	mentoria.setDescricao("ensina java");
	mentoria.setData(LocalDateTime.now());
	
	System.out.println(mentoria);
	
	
}

}
