package com.infotel.TpMavenSpringData.presentation;

import java.util.List;
import java.util.Optional;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotel.TpMavenSpringData.metier.Adresse;
import com.infotel.TpMavenSpringData.metier.Personne;
import com.infotel.TpMavenSpringData.service.Iservice;
import com.infotel.TpMavenSpringData.service.ServiceImpl;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	/*Iservice services =  context.getBean("serviceImpl2", ServiceImpl.class);
    	//ajouter
    
		Personne p = context.getBean("personne", Personne.class);
		p.setNom("marion");
		p.setPrenom("californie");
    	p.setAge(52);
    	
    	services.ajouterPersonne(p);
    	
		Personne p2 = context.getBean("personne", Personne.class);
		p2.setNom("pierre");
		p2.setPrenom("rotond");
    	p2.setAge(55);
        
    	services.ajouterPersonne(p2);
    	
		Personne p3 = context.getBean("personne", Personne.class);
		p3.setNom("Captain");
		p3.setPrenom("Tsubasa");
    	p3.setAge(17);
  
    	services.ajouterPersonne(p3);
    	
    	*/
    	
    	/*supprimer
    	Personne p = context.getBean("personne", Personne.class);
    	
    	Iservice services =  context.getBean("serviceImpl2", ServiceImpl.class);
    	p.setIdPersonne(6);
    	services.supprimerPersonne(p);*/
    	
    	/*modifier
    	 
    	Personne p = context.getBean("personne", Personne.class);
    	
    	Iservice services =  context.getBean("serviceImpl2", ServiceImpl.class);
    	p.setIdPersonne(2);
    	p.setNom("Captain");
       	p.setPrenom("Tsubasa");
    	p.setAge(55);
    	
    	services.modifierPersonne(p);*/
    	
    	/* lister personne
    	
    	Iservice services =  context.getBean("serviceImpl2", ServiceImpl.class);
    	
    	System.out.println(services.findAllPersonnes()); */
    	
    	/* Rechercher par
    	
    	Iservice services =  context.getBean("serviceImpl2", ServiceImpl.class);
    	
    	System.out.println(services.rechercherParPrenom("Tsubasa"));
    	
    	System.out.println(services.rechercherParMC("Cap"));*/
    	
    	
    	
    	//adresse
    	
    	/*ajouter adresse
    	
    	Iservice services =  context.getBean("serviceImpl2", ServiceImpl.class);
    	Adresse a = context.getBean("adresse", Adresse.class);
    	a.setNomRue("boulevard bbb");
    	a.setNumRue("5");
    	a.setVille("lens");
    	a.setCp("32000");
     	services.ajouterAdresse(a);
    	
    	Adresse a2 = context.getBean("adresse", Adresse.class);
    	a2.setNomRue("boulevard aaa");
    	a2.setNumRue("22");
    	a2.setVille("rennes");
    	a2.setCp("22222");
     	services.ajouterAdresse(a2);*/
     	
     	/* modifier adresse
    	Iservice services =  context.getBean("serviceImpl2", ServiceImpl.class);
    	Adresse a = context.getBean("adresse", Adresse.class);
    	a.setIdAdresse(1);    	
    	a.setNomRue("rue modifié");
    	a.setNumRue("num modif");
    	a.setVille("ville modif");
    	a.setCp("01010");
    	
    	services.modifierAdresse(a);*/
    	
    	/*supprimer
    	
    	Iservice services =  context.getBean("serviceImpl2", ServiceImpl.class);
    	Adresse a = context.getBean("adresse", Adresse.class);
    	a.setIdAdresse(1);
    	
    	services.supprimerAdresse(a);*/
    	
    	/* lister
    	
    	Iservice services =  context.getBean("serviceImpl2", ServiceImpl.class);
    	
    	System.out.println(services.findAllAdresses()); */
    	
    	//Ajouter une personne à adresse
    	
    	Iservice services =  context.getBean("serviceImpl2", ServiceImpl.class);
    	
    	
    	services.ajouterAdressePersonne(services.getAdresse(1), 1);

    	context.close();
    }
}
