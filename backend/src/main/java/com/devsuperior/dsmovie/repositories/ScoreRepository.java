package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.config.entities.Score;
import com.devsuperior.dsmovie.config.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

	
}
