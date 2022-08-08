package br.edu.infnet.apppetshop;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Consulta;

@Component
public class ConsultaTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Consulta");
		
		Consulta consulta = new Consulta();
		consulta.descricao = "Ortopedia";
		consulta.data = LocalDateTime.now();
		consulta.enfermidade = true;		
		System.out.println(consulta);
		
		Consulta consulta2 = new Consulta();
		consulta2.descricao = "Ultrassom";
		consulta2.data = LocalDateTime.now();
		consulta2.enfermidade = true;		
		System.out.println(consulta2);
		
		Consulta consulta3 = new Consulta();
		consulta3.descricao = "RaioX";
		consulta3.data = LocalDateTime.now();	
		consulta3.enfermidade = true;		
		System.out.println(consulta3);
		
	}

}
