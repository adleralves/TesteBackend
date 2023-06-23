package com.adleralves.TesteBackend.domain.api.controller;

import com.adleralves.TesteBackend.domain.model.Venda;
import com.adleralves.TesteBackend.domain.repository.VendaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VendaController {
    
    @Autowired
    private VendaRepository vendaRepository;

    @GetMapping("/vendas")
    public List<Venda> listar() {
        return vendaRepository.findAll();
    }
}
