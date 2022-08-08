package br.edu.infnet.apppetshop;


import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Exame;


@Component
public class ExameTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
System.out.println("#Exame");
		
		Exame exame = new Exame();
		exame.filhote = true;
		exame.peso = 12.5f;
		exame.medicacao = "dipirona";		
		System.out.println(exame);
		
		Exame exame2 = new Exame();
		exame2.filhote = false;
		exame2.peso = 15.5f;
		exame2.medicacao = "paracetamol";		
		System.out.println(exame2);
		
		Exame exame3 = new Exame();
		exame3.filhote = true;
		exame3.peso = 20.5f;
		exame3.medicacao = "injeção";		
		System.out.println(exame3);
		
	}

	

}
