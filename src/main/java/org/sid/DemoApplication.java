package org.sid;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.sid.dao.ContactRepository;
import org.sid.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	@Autowired
    private ContactRepository contactRepository;
    
    
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		DateFormat df=new SimpleDateFormat("dd/MM/yyy");
//		contactRepository.save(new Contact("ayman", "feki", df.parse("12/01/1984"), "fkiayman@yahoo.fr","22159684", "."));		contactRepository.save(new Contact("ameni", "khlif", df.parse("12/01/1984"), "fkiayman@yahoo.fr","22159684", "."));		
//	contactRepository.findAll().forEach(c->{System.out.println(c.getNom());	});	
//		
//		
		
	}

}
