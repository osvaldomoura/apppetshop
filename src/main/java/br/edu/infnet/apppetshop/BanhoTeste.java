package br.edu.infnet.apppetshop;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppetshop.model.domain.Banho;

@Component
@Order(3)
public class BanhoTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
System.out.println("#Banho");
		
		Banho banho = new Banho();
		banho.setNome("banho completo");
		banho.setValor(120);
		banho.setUrgencia(false);
		banho.setCompleto(true);
		banho.setPorte("Grande");
		banho.setAlergia(true);		
		System.out.println(banho);
		
		Banho banho2 = new Banho();
		banho2.setNome("banho e tosa ");
		banho2.setValor(150);
		banho2.setUrgencia(false);
		banho2.setCompleto(true);
		banho2.setPorte("Grande");
		banho2.setAlergia(true);			
		System.out.println(banho2);
		
		Banho banho3 = new Banho();
		banho3.setNome("banho rapido");
		banho3.setValor(60);
		banho3.setUrgencia(false);
		banho3.setCompleto(true);
		banho3.setPorte("Grande");
		banho3.setAlergia(true);		
		System.out.println(banho3);
		
	}

	

}
