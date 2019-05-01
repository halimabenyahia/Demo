package org.sid;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.awt.List;
import java.util.Collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.sid.dao.MarqueRepository;
import org.sid.dao.VehiculeRepository;
import org.sid.entities.Vehicule;
import org.sid.web.VehiculeRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

//	@InjectMocks
//	private VehiculeRestService vehiculeService;
//
//	@Mock
//	private VehiculeRepository vehiculeRep;
//
//	@Test
//	public void testGetAllVehicule() {
//		Collection<Vehicule> list = vehiculeService.getAllVehicule();
//		Assert.assertNotNull("error!", list); // vérifie si l'objet n'est pas null
//		return;
//	}
//
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	


}
