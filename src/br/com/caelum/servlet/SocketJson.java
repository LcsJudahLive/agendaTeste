package br.com.caelum.servlet;

import br.com.caelum.jdbc.modelo.Contato;
import org.json.*;
public class SocketJson {
	public void ParsingJson(Contato pessoa){
		try{
			//Contato pessoa = new Contato();
			//pessoa.setNome("Exemplo");
			//pessoa.setEmail("exemplo@yahoo.com");
			//pessoa.setEndereco("Rua A, 300");
			JSONObject jsonObj = new JSONObject();
			jsonObj.put("nome",pessoa.getNome());
			jsonObj.put("endereco",pessoa.getEndereco());
			jsonObj.put("email",pessoa.getEmail());
			System.out.println(jsonObj.getString("nome"));
			System.out.println(jsonObj);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
