package com.adleralves.TesteBackend.domain.repository;

import com.adleralves.TesteBackend.domain.model.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long>{
    
}
