package com.tiagoabr.mastersys.repository;

import com.tiagoabr.mastersys.domain.FaturaMatricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaturaMatriculaRepository extends JpaRepository<FaturaMatricula, Long> {
}
