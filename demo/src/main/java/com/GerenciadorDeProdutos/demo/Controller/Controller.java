package com.GerenciadorDeProdutos.demo.Controller;


import com.GerenciadorDeProdutos.demo.Model.ProdutosModel;
import com.GerenciadorDeProdutos.demo.Service.ProdutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/Livro")
public class Controller {
    @Autowired
    private ProdutosService service;


    @PostMapping
    public ProdutosModel Criar (@RequestBody ProdutosModel livroModel){
        return service.Criar(livroModel);

    }
    @GetMapping
    public List<ProdutosModel>Listar(){
        return service.Listar();
    }

    @GetMapping("/{id}")
    public Optional <ProdutosModel> BuscarId(@PathVariable Long id){
        return service.BuscarId(id);
    }
    @DeleteMapping("/{id}")
    public void deletar (@PathVariable Long id){
        service.deletar(id);
    }






}
