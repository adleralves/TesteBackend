package com.adleralves.TesteBackend.domain.api.controller;

import com.adleralves.TesteBackend.domain.model.Produto;
import com.adleralves.TesteBackend.domain.repository.ProdutoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    // Requisição pra criar produto só para popular banco de dados
    @PostMapping("/produto/criar")
    @ResponseStatus(HttpStatus.CREATED)
    public Produto criar(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    // Requisição para listar produtos
    @GetMapping("/produtos")
    public List<Produto> listar() {
        return produtoRepository.findAll();
    }
}
