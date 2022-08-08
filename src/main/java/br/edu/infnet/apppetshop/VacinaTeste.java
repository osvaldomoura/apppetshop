package br.edu.infnet.apppetshop;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Vacina;

@Component
public class VacinaTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
System.out.println("#Vacina");
		
		Vacina vacina = new Vacina();
		vacina.importada = true;
		vacina.data = LocalDateTime.now();
		vacina.descricao = "primeira dose";		
		System.out.println(vacina);
		
		Vacina vacina2 = new Vacina();
		vacina2.importada = true;
		vacina2.data = LocalDateTime.now();
		vacina2.descricao = "primeira segunda";		
		System.out.println(vacina2);
		
		Vacina vacina3 = new Vacina();
		vacina3.importada = false;
		vacina3.data = LocalDateTime.now();
		vacina3.descricao = "primeira terceira";		
		System.out.println(vacina3);
		
	}

	
}
