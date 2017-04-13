package com.eurekour;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.eurekour.entity.Client;
import com.eurekour.manager.MangerClient;
import com.eurekour.respository.RepositoryUser;

@SpringBootApplication
public class EurekourApplication {

	public static void main(String[] args) {
		
	
		ApplicationContext ctx=SpringApplication.run(EurekourApplication.class, args);	

		RepositoryUser   repoPer=ctx.getBean(RepositoryUser.class);
		  Client client=new Client("Elibrch", "hicham", new Date(), "casablanca", "oulfa", "email@eurekour", "07070667", "M", "login1","pass", "suptech");
	   
	    MangerClient mg=new MangerClient();
	     mg.addClient(client);
	    // repoPer.save(client);
	}
}
