package br.edu.infnet.apppetshop;


import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppetshop.model.domain.Exame;


@Component
@Order(5)
public class ExameTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
System.out.println("#Exame");
		
		Exame exame = new Exame();
		exame.setNome("sangue");
		exame.setValor(100);
		exame.setUrgencia(true);
		exame.setFilhote(true);
		exame.setPeso(12.5f);
		exame.setMedicacao("dipirona");		
		System.out.println(exame);
		
		Exame exame2 = new Exame();
		exame2.setNome("vista");
		exame2.setValor(200);
		exame2.setUrgencia(true);
		exame2.setFilhote(true);
		exame2.setPeso(15.5f);
		exame2.setMedicacao("paracetamol");		
		System.out.println(exame2);
		
		Exame exame3 = new Exame();
		exame3.setNome("urina");
		exame3.setValor(120);
		exame3.setUrgencia(true);
		exame3.setFilhote(true);
		exame3.setPeso(20.5f);
		exame3.setMedicacao("injeção");		
		System.out.println(exame3);
		
	}

	

}
