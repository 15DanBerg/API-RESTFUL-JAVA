package com.apirestfull.berg.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirestfull.berg.model.Produto;
import com.apirestfull.berg.repository.ProdutoRepository;

@Service
public class ProdutoService {
    
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> obterTodos(){
        //regra de negócio
        return produtoRepository.obterTodos();
    } 

    public Optional<Produto> obteProdutoPorID(int id){
        //regra de negócio
        return produtoRepository.obteProdutoPorID(id);
    }

    public Produto adicionar(Produto produto){
        //regra de negócio
        return produtoRepository.adicionar(produto);
    }

    public void deletar(int id){
        //regra de negócio
        produtoRepository.deletar(id);
    }

    public Produto atualizar(int id, Produto produto){
        //regra de negócio
        produtoRepository.atualizar(produto);
        produto.setId(id);
        
        return produtoRepository.atualizar(produto);
    }
}


