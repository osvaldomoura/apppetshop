package br.edu.infnet.apppetshop;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Banho;

@Component
public class BanhoTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
System.out.println("#Banho");
		
		Banho banho = new Banho();	
		banho.completo = true;
		banho.porte = "Grande";
		banho.alergia = true;		
		System.out.println(banho);
		
		Banho banho2 = new Banho();
		banho2.completo = true;
		banho2.porte = "Medio";
		banho2.alergia = false;		
		System.out.println(banho2);
		
		Banho banho3 = new Banho();
		banho3.completo = true;
		banho3.porte = "Pequeno";
		banho3.alergia = true;	
		System.out.println(banho3);
		
	}

	

}
