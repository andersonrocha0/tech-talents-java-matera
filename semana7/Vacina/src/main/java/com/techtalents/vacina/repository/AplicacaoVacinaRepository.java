package com.techtalents.vacina.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techtalents.vacina.entity.AplicacaoVacina;

@Repository
public interface AplicacaoVacinaRepository extends JpaRepository<AplicacaoVacina, Long> {

}
