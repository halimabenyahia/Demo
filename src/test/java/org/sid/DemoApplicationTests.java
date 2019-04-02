package org.sid;

import java.awt.List;
import java.util.Collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.sid.entities.Vehicule;
import org.sid.web.VehiculeRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	
	@Autowired
	private VehiculeRestService vehiculeService ;

	@Test
	public void testGetAll() {
		Collection<Vehicule> list= vehiculeService.getAllVehicule();
		Assert.assertNotNull("error!", list);
		Assert.assertEquals("error", 2, list.size());
	}
	
	
	@Before
	public void before() {}
	
	@After
	public void after() {}

	
	
}
