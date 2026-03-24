package com.GerenciadorDeProdutos.demo.Service;

import com.GerenciadorDeProdutos.demo.Model.ProdutosModel;
import com.GerenciadorDeProdutos.demo.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutosService {
    @Autowired
    private ProdutosRepository repository;

    public ProdutosModel Criar(ProdutosModel produtosmodel ){
        return repository.save(produtosmodel);
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
