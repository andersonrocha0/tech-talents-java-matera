package com.techtalents.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techtalents.agenda.entity.Telefone;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {

}
