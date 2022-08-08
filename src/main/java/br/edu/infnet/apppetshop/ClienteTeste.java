package br.edu.infnet.apppetshop;


import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Cliente;


@Component
public class ClienteTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
System.out.println("#Cliente");
		
		Cliente cliente = new Cliente();
		cliente.nome = "osvaldo moura";
		cliente.cpf = "111.123.123-51";
		cliente.email = "osvaldo@gmail.com";		
		System.out.println(cliente);
		
		Cliente cliente2 = new Cliente();
		cliente2.nome = "fernando marcos";
		cliente2.cpf = "111.123.123-52";
		cliente2.email = "fernando@gmail.com";
		System.out.println(cliente2);
		
		Cliente cliente3 = new Cliente();
		cliente3.nome = "felipe abreu";
		cliente3.cpf = "111.123.123-53";
		cliente3.email = "felipe@gmail.com";		
		System.out.println(cliente3);
		
	}


}
