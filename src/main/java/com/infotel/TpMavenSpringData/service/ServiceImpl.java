package com.infotel.TpMavenSpringData.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotel.TpMavenSpringData.dao.AdresseRepository;
import com.infotel.TpMavenSpringData.dao.PersonneRepository;
import com.infotel.TpMavenSpringData.metier.Adresse;
import com.infotel.TpMavenSpringData.metier.Personne;

@Service("serviceImpl2")
public class ServiceImpl implements Iservice{
	@Autowired
	private PersonneRepository personneRepository;
	@Autowired
	private AdresseRepository adresseRepository;
	
	
	public PersonneRepository getPersonneRepository() {
		return personneRepository;
	}

	public void setPersonneRepository(PersonneRepository personneRepository) {
		this.personneRepository = personneRepository;
	}

	public AdresseRepository getAdresseRepository() {
		return adresseRepository;
	}

	public void setAdresseRepository(AdresseRepository adresseRepository) {
		this.adresseRepository = adresseRepository;
	}

	@Override
	public Personne ajouterPersonne(Personne p) {
		// TODO Auto-generated method stub
		return personneRepository.save(p);
	}
	
	@Override
	public Personne modifierPersonne(Personne p) {
		// TODO Auto-generated method stub
		return personneRepository.save(p);
	}
	@Override
	public void supprimerPersonne(Personne p) {
		// TODO Auto-generated method stub
		 personneRepository.delete(p);
	}


	@Override
	public Optional<Personne> getPersonne(int idPersonne) {
		// TODO Auto-generated method stub
		
		return personneRepository.findById(idPersonne);
	}

	@Override
	public List<Personne> findAllPersonnes() {
		// TODO Auto-generated method stub
		return personneRepository.findAll();
	}

	@Override
	public Adresse modifierAdresse(Adresse a) {
		// TODO Auto-generated method stub
		return adresseRepository.save(a);
	}

	@Override
	public void supprimerAdresse(Adresse a) {
		// TODO Auto-generated method stub
		 adresseRepository.delete(a);
	}

	@Override
	public List<Adresse> findAllAdresses() {
		// TODO Auto-generated method stub
		return adresseRepository.findAll();
	}

	@Override
	public List<Personne> rechercherParPrenom(String prenom) {
		// TODO Auto-generated method stub
		return personneRepository.findByPrenom(prenom);
	}

	@Override
	public List<Personne> rechercherParMC(String nom) {
		// TODO Auto-generated method stub
		return personneRepository.rechercherParMc("%" + nom + "%");
	}

	@Override
	public Adresse ajouterAdresse(Adresse a) {
		// TODO Auto-generated method stub
		return adresseRepository.save(a);
	}

	@Override
	public Adresse affichageAdresse(int idAdresse) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Adresse getAdresse(int idAdresse) {
		// TODO Auto-generated method stub
		return adresseRepository.getOne(idAdresse);
	}

	@Override
	public int ajouterAdressePersonne(Adresse adresse, int idPersonne) {
		// TODO Auto-generated method stub
		return personneRepository.ajouterAdressePersonne(adresse, idPersonne);
	}

}
