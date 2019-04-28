package org.sid.testjunit;

import static org.junit.Assert.assertEquals;

import java.awt.PageAttributes.MediaType;

import org.junit.Test;
import org.sid.entities.Chauffeurs;
import org.sid.web.ChauffeursRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import test.TestParcRestController;

public class ChauffeurTestRestController extends TestParcRestController {
	
	@Autowired
	ChauffeursRestService chauffeurService ;
	
	//Donne accès au résultat d'une requête exécutée.
	private MvcResult mvcResult;
	
//	public public ChauffeurTestRestController() {
//		super();
//	}

	@Test
	@Override
	public void getAllEntityList() {
		try {
			Chauffeurs chauffeur = new Chauffeurs();
			chauffeur.setNom_ch("yahia");
			chauffeurService.addChauffeur(chauffeur);
			mvcResult = mvc.perform(MockMvcRequestBuilders.get("/chauffeurs").accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();

			int status = mvcResult.getResponse().getStatus();
			assertEquals(200, status);
			String content = mvcResult.getResponse().getContentAsString();
			Chauffeurs[] chauffeurList = this.mapFromJson(content, Chauffeurs[].class);

		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Test
	@Override
	public void createEntity() {
		// TODO Auto-generated method stub
		
	}

	@Test
	@Override
	public void updateEntity() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEntity() {
		// TODO Auto-generated method stub
		
	}

}
