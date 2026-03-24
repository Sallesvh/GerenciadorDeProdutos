package com.GerenciadorDeProdutos.demo;



import com.GerenciadorDeProdutos.demo.Model.ProdutosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository <ProdutosModel, Long> {
}