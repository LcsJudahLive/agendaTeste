package br.com.caelum.jdbc.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

import br.com.caelum.jdbc.ConnectionFactory;
import br.com.caelum.jdbc.ContatoDAO;

public class JDBCInsere {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		// cria um preparedStatement
		Contato contato = new Contato();
		contato.setNome("Caelum2");
		contato.setEmail("caelum@caelum.com.br");
		contato.setEndereco("R. Vergueiro 3185 cj57");
		contato.setDataNascimento(Calendar.getInstance());
		ContatoDAO dao = new ContatoDAO();
		dao.adiciona(contato);
		System.out.println("Gravado!");
		
	}

}
