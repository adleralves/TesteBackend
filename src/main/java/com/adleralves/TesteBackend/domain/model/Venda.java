package com.adleralves.TesteBackend.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Venda {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    private Usuario usuario;
    
    @OneToOne
    private ItemVenda carrinho;
    
    private Double valor;

    public Venda() {

    }

    public Venda(Long id, Usuario usuario, ItemVenda carrinho, Double valor) {
        this.id = id;
        this.usuario = usuario;
        this.carrinho = carrinho;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ItemVenda getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(ItemVenda carrinho) {
        this.carrinho = carrinho;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    
    
}
