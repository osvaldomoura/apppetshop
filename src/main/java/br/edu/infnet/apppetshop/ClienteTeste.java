package br.edu.infnet.apppetshop;


import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppetshop.model.domain.Cliente;


@Component
@Order(3)
public class ClienteTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
System.out.println("#Cliente");
		
		Cliente cliente = new Cliente("osvaldo moura","111.123.123-51","osvaldo@gmail.com");		
		System.out.println(cliente);
		
		Cliente cliente2 = new Cliente("fernando marcos","111.123.123-52", "fernando@gmail.com");
		System.out.println(cliente2);
		
		Cliente cliente3 = new Cliente("felipe abreu","111.123.123-53","felipe@gmail.com");	
		System.out.println(cliente3);
		
	}


}
