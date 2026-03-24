package com.GerenciadorDeProdutos.demo;

import com.GerenciadorDeProdutos.demo.Model.ProdutosModel;
import com.GerenciadorDeProdutos.demo.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

    public ProdutosModel Criar(ProdutosModel produtosModel){
        return repository.save(produtosModel);
    }

    public List<ProdutosModel> Listar(){
        return repository.findAll();
    }
        public Optional <ProdutosModel> BuscarId(Long id){
        return repository.findById(id);
    }
    public void deletar(Long id){
        repository.deleteById(id);
    }
}
