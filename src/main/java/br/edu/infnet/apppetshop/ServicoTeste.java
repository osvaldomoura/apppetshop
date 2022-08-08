package br.edu.infnet.apppetshop;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Servico;

@Component
public class ServicoTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Servico");
		
		Servico servico = new Servico();
		servico.nome = "consulta";
		servico.valor = 50;
		servico.urgencia = true;		
		System.out.println(servico);
		
		Servico servico2 = new Servico();
		servico2.nome = "vacina";
		servico2.valor = 100;
		servico2.urgencia = true;		
		System.out.println(servico2);
		
		Servico servico3 = new Servico();
		servico3.nome = "cirurgia";
		servico3.valor = 500;
		servico3.urgencia = true;		
		System.out.println(servico3);
	}

	
}
