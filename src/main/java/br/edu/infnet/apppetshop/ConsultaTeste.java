package br.edu.infnet.apppetshop;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppetshop.model.domain.Consulta;

@Component
@Order(4)
public class ConsultaTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Consulta");
		
		Consulta consulta = new Consulta();
		consulta.setDescricao("Ortopedia");
		consulta.setData(LocalDateTime.now());
		consulta.setEnfermidade(false);	
		System.out.println(consulta);
		
		Consulta consulta2 = new Consulta();
		consulta2.setDescricao("Ultrassom");
		consulta2.setData(LocalDateTime.now());
		consulta2.setEnfermidade(true);			
		System.out.println(consulta2);
		
		Consulta consulta3 = new Consulta();
		consulta3.setDescricao("RaioX");
		consulta3.setData(LocalDateTime.now());
		consulta3.setEnfermidade(false);			
		System.out.println(consulta3);
		
	}

}
