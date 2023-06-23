package com.adleralves.TesteBackend.domain.api.controller;

import com.adleralves.TesteBackend.domain.model.ItemVenda;
import com.adleralves.TesteBackend.domain.repository.ItemVendaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemVendaController {
    
    @Autowired
    private ItemVendaRepository itemVendaRepository;
    
    @PostMapping("/item/criar")
    @ResponseStatus(HttpStatus.CREATED)
    public ItemVenda criar(@RequestBody ItemVenda item) {
        return itemVendaRepository.save(item);
    }

    // Requisição apenas para listar
    @GetMapping("/itens")
    public List<ItemVenda> listar() {
        return itemVendaRepository.findAll();
    }
}
