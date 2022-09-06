package br.senai.sp.jandira;
import java.time.LocalDate;

import br.senai.sp.jandira.gui.FrameCalculadoraImc;
import br.senai.sp.jandira.model.Cliente;

public class AppAcademia {

	public static void main(String[] args) {
    FrameCalculadoraImc tela = new FrameCalculadoraImc();
    tela.titulo = "Calculadora IMC";
    tela.largura = 600;
    tela.altura = 600;
    tela.criaTela();
    
	Cliente clienteAlonso = new Cliente();
	
	clienteAlonso.nome = "Alonso";
	clienteAlonso.peso = 57;
	clienteAlonso.altura = 1.67;
	clienteAlonso.dataNascimento = LocalDate.of(2000, 1, 10);
	
	System.out.println(clienteAlonso.getImc());
	
	Cliente clientePadilha = new Cliente();
	
	clientePadilha.nome = "Padilha";
	clientePadilha.peso = 78.5;
	clientePadilha.altura = 1.74;
	clientePadilha.dataNascimento = LocalDate.of(1996, 2, 29);
	
	System.out.println(clientePadilha.getIdade());
	System.out.println(clienteAlonso.getIdade());
	
	System.out.println(clienteAlonso.getStatusImc());
	System.out.println(clientePadilha.getStatusImc());
	

	}

}
