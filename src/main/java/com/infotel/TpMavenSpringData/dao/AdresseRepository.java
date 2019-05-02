package com.infotel.TpMavenSpringData.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.infotel.TpMavenSpringData.metier.Adresse;

public interface AdresseRepository extends JpaRepository<Adresse, Integer>{


}
