package com.apirestfull.berg.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import com.apirestfull.berg.model.Produto;

@Repository
public class ProdutoRepository {

    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private int ultimoId = 0;

    /**
     * Método para retornar lista de produtos.
     * @return Lista de produtos 
     */
    public List<Produto> obterTodos(){
        return produtos;
    }

    /**
     * Método para retornar o produto encontrado pelo seu Id.
     * @param id do produto que será localizado
     * @return retorna um produto caso seja encontrado com o id solicitado 
     */
    public Optional<Produto> obteProdutoPorID(int id){
        return  produtos
            .stream()
            .filter(produto -> produto.getId() == id )
            .findFirst();
    }   
    
}

