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
        return produtoRepository.obterTodos();
    } 

    public Optional<Produto> obteProdutoPorID(int id){
        return produtoRepository.obteProdutoPorID(id);
    }

    public Produto adicionar(Produto produto){
        return produtoRepository.adicionar(produto);
    }

    public void deletar(int id){
        produtoRepository.deletar(id);
    }

    public Produto atualizar(int id, Produto produto){
        produtoRepository.atualizar(produto);
        produto.setId(id);
        
        return produtoRepository.atualizar(produto);
    }
}


