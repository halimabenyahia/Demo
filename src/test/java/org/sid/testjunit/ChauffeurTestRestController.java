package org.sid.testjunit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


import org.junit.Test;
import org.sid.entities.Chauffeurs;
import org.sid.web.ChauffeursRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import test.TestParc;
import test.TestParcRestController;

public class ChauffeurTestRestController extends TestParcRestController {
	
	@Autowired
	ChauffeursRestService chauffeurService ;
	
	//Donne accès au résultat d'une requête exécutée.
	private MvcResult mvcResult;
	
	@Autowired
	TestParc testParc ;
	
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
			Chauffeurs[] chauffeurList = testParc.mapFromJson(content, Chauffeurs[].class);
			assertTrue(chauffeurList.length > 0);

		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

//	@Test
//	@Override
//	public void createEntity() {
//		try {
//			Chauffeurs chauffeur = new Chauffeurs();
//			chauffeur.setNom_ch("yahia");
//			chauffeurService.addChauffeur(chauffeur);
//			String inputJson = testParc.mapToJson(chauffeur);
//			mvcResult = mvc.perform(MockMvcRequestBuilders.post("/addChauffeur").contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson)).andReturn();
//			int status = mvcResult.getResponse().getStatus();
//			assertEquals(200, status);
//			Chauffeurs foundChauffeurs = chauffeurService.getChauffeurParam(chauffeur.getNom_ch());
//			assertNotNull(foundChauffeurs);
//			assertEquals(foundChauffeurs.getNom_ch(), chauffeur.getNom_ch());
//
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}

	@Test
	@Override
	public void updateEntity() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEntity() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createEntity() {
		// TODO Auto-generated method stub
		
	}

}
