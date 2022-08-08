package br.edu.infnet.apppetshop;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppetshop.model.domain.Vacina;

@Component
@Order(6)
public class VacinaTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
System.out.println("#Vacina");
		
		Vacina vacina = new Vacina();
		vacina.setNome("raiva");
		vacina.setValor(100);
		vacina.setUrgencia(true);
		vacina.setImportada(true);
		vacina.setData(LocalDateTime.now());
		vacina.setDescricao("primeira dose");	
		System.out.println(vacina);
		
		Vacina vacina2 = new Vacina();
		vacina2.setNome("leishmaniose");
		vacina2.setValor(300);
		vacina2.setUrgencia(true);
		vacina2.setImportada(true);
		vacina2.setData(LocalDateTime.now());
		vacina2.setDescricao("primeira segunda");	
		System.out.println(vacina2);
		
		Vacina vacina3 = new Vacina();
		vacina3.setNome("antirrábica");
		vacina3.setValor(150);
		vacina3.setUrgencia(true);
		vacina3.setImportada(false);
		vacina3.setData(LocalDateTime.now());
		vacina3.setDescricao("primeira terceira");				
		System.out.println(vacina3);
		
	}

	
}
