package com.encapsulamento;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instanciando objetos
		PessoaFisica usuario = new PessoaFisica();
		PessoaJuridica empresa = new PessoaJuridica();
		
		// Recebe os dados do usuario
		usuario.setNome(JOptionPane.showInputDialog("Informe o nome:"));
		usuario.setProfissao(JOptionPane.showInputDialog("Informe a profissão:"));
		usuario.setEmail(JOptionPane.showInputDialog("Informe o email"));
		usuario.setCidade(JOptionPane.showInputDialog("Informe a cidade:"));
		usuario.setIdUsuario(10101);
		
		// Recebe os dados do usuario
		empresa.setRazaoSocial(JOptionPane.showInputDialog("Informe a razão social:"));
		empresa.setNomeFantasia(JOptionPane.showInputDialog("Informe o nome fantasia:"));
		empresa.setEmail(JOptionPane.showInputDialog("Informe o email"));
		empresa.setCidade(JOptionPane.showInputDialog("Informe a cidade:"));
		empresa.setIdUsuario(10101);
		
		//Output do usuario
		JOptionPane.showMessageDialog(null, "Nome:" + usuario.getNome() + "\nProfissão:" + usuario.getProfissao() + "\nEmail:" + usuario.getEmail() + "\nCidade" + usuario.getCidade() + "\nIdUsuario:" + usuario.getIdUsuario() + ".");
		
		//Output da empresa
				JOptionPane.showMessageDialog(null, "Razão social:" + empresa.getRazaoSocial() + "\nNome fantasia:" + empresa.getNomeFantasia() + "\nEmail:" + usuario.getEmail() + "\nCidade" + usuario.getCidade() + "\nIdUsuario:" + usuario.getIdUsuario() + ".");
		

	}

}
