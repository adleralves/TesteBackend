package com.adleralves.TesteBackend.domain.repository;

import com.adleralves.TesteBackend.domain.model.ItemVenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemVendaRepository extends JpaRepository<ItemVenda, Long>{
    
}
