package org.sid;

import java.awt.List;
import java.util.Collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.sid.dao.MarqueRepository;
import org.sid.entities.Marque;
import org.sid.entities.Vehicule;
import org.sid.web.VehiculeRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.PathVariable;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	
	@Autowired
	private VehiculeRestService vehiculeService ;
	
	@Autowired
	private MarqueRepository marqueRep ;

	@Test
	public void testGetAllVehicule() {
		Collection<Vehicule> list= vehiculeService.getAllVehicule();
		Assert.assertNotNull("error!", list); //vérifie si l'objet n'est pas null
		
		
		
			return ;
		}
	
		

	
	
	@Before
	public void before() {
	
	}
	
	@After
	public void after() {}

	
	
}
