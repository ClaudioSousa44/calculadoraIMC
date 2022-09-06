package br.senai.sp.jandira.model;
import java.time.LocalDate;
import java.time.Period;

public class Cliente {
	public String nome;
	public LocalDate dataNascimento;
	public double altura;
	public double peso;
	public int idade;
	
	
	
	public double getImc() {
		return peso / Math.pow(altura, 2);
		
	}
	
	
	public int getIdade() {
		
		LocalDate now = LocalDate.now();
		Period period = Period.between( dataNascimento, now);

		return period.getYears();
		
	}
	
	
	public String getStatusImc() {
		if(getImc() <= 18.5) {
			return "Você está abaixo do peso!";
			
		} else if (getImc() > 18.5 && getImc() < 25 ){
			return "Você está no peso ideal!";
		} else if (getImc() >= 25 && getImc() < 30) {
			return "Você está levemente acima do peso!";
		} else if (getImc() >= 30 && getImc() < 35) {
			return "Você está Obesidade Grau I";
		} else if (getImc() >= 35 && getImc() < 40) {
			return "Você está com Obesidade Grau II";
		} else {
			return "Você está com Obesidade Grau III";
		}
		
	}
	

}
