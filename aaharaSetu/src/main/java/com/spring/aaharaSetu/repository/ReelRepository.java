package com.spring.aaharaSetu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.aaharaSetu.model.Reel;

@Repository
public interface ReelRepository extends JpaRepository<Reel, Integer> {

}
