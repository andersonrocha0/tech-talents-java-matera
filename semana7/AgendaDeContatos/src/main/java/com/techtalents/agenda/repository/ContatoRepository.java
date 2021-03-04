package com.techtalents.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techtalents.agenda.entity.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

}
