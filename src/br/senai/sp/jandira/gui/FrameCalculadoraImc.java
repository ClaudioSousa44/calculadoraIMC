package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Cliente;



public class FrameCalculadoraImc {
	public String titulo;
	public int largura;
	public int altura;
	
	public void criaTela() {
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		Container painel = tela.getContentPane();
		painel.setBackground(Color.gray);
		
		//criando font
		 Font times = new Font("Times new Roman", Font.BOLD, 20);
		
		
		
		JLabel labelImc = new JLabel();
		labelImc.setText("IMC");
		labelImc.setFont(times);
		labelImc.setForeground(Color.orange);
		labelImc.setBounds(30, 20, 100, 30);
		
		JLabel labelNome = new JLabel();
		labelNome.setText("Nome:");
		labelNome.setBounds(30, 70, 100, 30);
		
		JTextField textFieldNome = new JTextField();
		textFieldNome.setBounds(30, 100, 200, 30);
		
		JLabel labelPeso = new JLabel();
		labelPeso.setText("Peso:");
		labelPeso.setBounds(30, 140, 100, 30);
		
		JTextField textFieldPeso = new JTextField();
		textFieldPeso.setBounds(30, 170, 200, 30);
		
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura:");
		labelAltura.setBounds(30, 210, 100, 30);
		
		JTextField textFieldAltura = new JTextField();
		textFieldAltura.setBounds(30, 240, 200, 30);
		
		JLabel labelDataNasc = new JLabel();
		labelDataNasc.setText("Data Nasc:");
		labelDataNasc.setBounds(30, 280, 100, 30);
		
		JTextField textFieldDataNasc = new JTextField();
		textFieldDataNasc.setBounds(30, 310, 200, 30);
		
		

		
		
		JButton buttonCalcular = new JButton();
		buttonCalcular.setBackground(Color.green);
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(300, 310, 100, 30);
		
		
		JLabel labelResultadoImc = new JLabel();
		labelResultadoImc.setText("");
		labelResultadoImc.setBounds(30, 340, 300, 30);
		
		JLabel labelStatusImc = new JLabel();
		labelStatusImc.setText("");
		labelStatusImc.setBounds(30, 370, 300, 30);
		
		
		JLabel labelResultadoIdade = new JLabel();
		labelResultadoIdade.setText("");
		labelResultadoIdade.setBounds(30, 400, 300, 30);
		
		
		
		
		painel.add(labelImc);	
		painel.add(labelNome);
		painel.add(textFieldNome);
		painel.add(labelPeso);
		painel.add(textFieldPeso);
		painel.add(labelAltura);
		painel.add(textFieldAltura);
		painel.add(labelDataNasc);
		painel.add(textFieldDataNasc);
		painel.add(buttonCalcular);
		painel.add(labelResultadoImc);
		painel.add(labelStatusImc);
		painel.add(labelResultadoIdade);
		
		
		
		
		tela.setVisible(true);
		
		//definir ouvintes 
		
		
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Cliente cliente = new Cliente();
				cliente.nome = textFieldNome.getText();
				cliente.peso = Double.parseDouble(textFieldPeso.getText());
				cliente.altura = Double.parseDouble(textFieldAltura.getText());
				cliente.dataNascimento = LocalDate.of(2000, 8, 21);
				
				String[] dataNascimento = textFieldDataNasc.getText().split("/");
				
				int dia = Integer.parseInt(dataNascimento[0]) ;
				int mes = Integer.parseInt(dataNascimento[1]);
				int ano = Integer.parseInt(dataNascimento[2]);
				
				cliente.dataNascimento = LocalDate.of(ano, mes, dia);
				
				
				labelResultadoImc.setText("IMC:" + cliente.getImc());
				labelStatusImc.setText("Status IMC:" + cliente.getStatusImc());
				labelResultadoIdade.setText("idade: " + cliente.getIdade());
		
				
			}
		});
	
	}

}
