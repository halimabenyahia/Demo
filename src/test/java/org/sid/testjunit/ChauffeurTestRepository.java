package org.sid.testjunit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.sid.dao.ChauffeursRepository;
import org.sid.entities.Chauffeurs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import test.TestParcRepository;


/*tester persistance chauffeur*/
@SpringBootTest
public class ChauffeurTestRepository extends TestParcRepository {
	
	@Autowired
	ChauffeursRepository chauffeurRep ;

	@Test
	@Override
	public void givenEntityRepository_whenSaving() {
		System.out.println("--------------- Testing givenEntityRepository_whenSaving Method ---------------");
		Chauffeurs savedchauffeur=new Chauffeurs() ;
		savedchauffeur.setNom_ch("ben romdhane");
		savedchauffeur=chauffeurRep.save(savedchauffeur);
		System.out.println("--------------- chauffeur saved ---------------");
		List<Chauffeurs> foundChauffeur = chauffeurRep.findByParametreChauffeur(savedchauffeur.getNom_ch());
		assertNotNull(foundChauffeur);
		System.out.println("--------------- chauffeur trouvé ---------------");
		assertEquals(( ((Chauffeurs) foundChauffeur).getId_chauffeur()), savedchauffeur.getId_chauffeur());
		System.out.println("--------------- chauffeur vérifié ---------------");		

	}

	@Test
	@Override
	public void givenEntityRepository_whenUpdating() {
		System.out.println("--------------- Testing givenEntityRepository_whenUpdating Method ---------------");
		Chauffeurs savedchauffeur=new Chauffeurs() ;
		savedchauffeur.setNom_ch("ben yahia");
		savedchauffeur = chauffeurRep.save(savedchauffeur);
		savedchauffeur.setNom_ch("ben yahya");
		savedchauffeur = chauffeurRep.save(savedchauffeur);
		Chauffeurs foundChauffeurs = chauffeurRep.findOne(savedchauffeur.getId_chauffeur());
		assertEquals(foundChauffeurs.getNom_ch(), savedchauffeur.getNom_ch());
		
	}
	

	@Test
	@Override
	public void givenEntityRepository_whenDeleting() {
		Chauffeurs savedChauffeurs = new Chauffeurs() ;
		savedChauffeurs.setNom_ch("ben yahia");
		savedChauffeurs = chauffeurRep.save(savedChauffeurs);
		chauffeurRep.delete(savedChauffeurs);
		Chauffeurs foundChauffeurs = (Chauffeurs) chauffeurRep.findByParametreChauffeur(savedChauffeurs.getNom_ch());
		assertEquals(null, foundChauffeurs);

		
	}

	@Test
	@Override
	public void givenEntityRepository_whenRetrievingAll() {
		Chauffeurs savedChauffeurs = new Chauffeurs() ;
		//savedChauffeurs.setNom_ch("ben yahia");
		savedChauffeurs = chauffeurRep.save(savedChauffeurs);
		List<Chauffeurs> list = chauffeurRep.findAll();
		assertEquals(1, list.size());
	}

	@Test
	@Override
	public void givenEntityRepository_whenRetrievingOneById() {
		Chauffeurs savedChauffeurs = new Chauffeurs();
		savedChauffeurs.setNom_ch("ben yahia");
		savedChauffeurs = chauffeurRep.save(savedChauffeurs);
		savedChauffeurs.setNom_ch("ben yahia");
		Chauffeurs foundChauffeurs = chauffeurRep.getOne(savedChauffeurs.getId_chauffeur());
		assertEquals(foundChauffeurs.getId_chauffeur(), savedChauffeurs.getId_chauffeur());
		
	}
	

}
