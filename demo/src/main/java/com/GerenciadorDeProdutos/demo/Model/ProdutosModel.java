package com.GerenciadorDeProdutos.demo.Model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_produtos")
public class ProdutosModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "nome_produto")
    private String nome;
    private BigDecimal preco;
    @Column (name = "estoque")
    private Integer estoque;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }
}
