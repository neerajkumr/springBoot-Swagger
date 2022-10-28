package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.entity.Animation;

@Repository
public interface AnimationDao extends JpaRepository<Animation, Integer> {

	
}
