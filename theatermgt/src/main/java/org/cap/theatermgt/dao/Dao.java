package org.cap.theatermgt.dao;

import org.cap.theatermgt.entities.Theater;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Dao extends JpaRepository<Theater, Integer> {

}
