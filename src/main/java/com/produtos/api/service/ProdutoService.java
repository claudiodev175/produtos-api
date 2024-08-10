package com.produtos.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.produtos.api.dto.ProdutoDTO;
import com.produtos.api.model.produto;
import com.produtos.api.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public produto salvaProduto(produto produto){
        return produtoRepository.save(produto);
    }
    
    public ProdutoDTO buscarProdutoPeloId(Long id){
        Optional<produto> produtoOpt = produtoRepository.findById(id);

    if (produtoOpt.isPresent()) {
        return produtoOpt.get().toDTO();
    }

    return null;

    }

    @DeleteMapping("/{id}")
    public void deletarProduto(Long id){
        produtoRepository.deleteById(id);
    }

    public produto atualizarProduto(Long id,produto dadosProduto){
        Optional<produto> produtoOpt = produtoRepository.findById(id);

        if (produtoOpt.isPresent()) {
            produto produto = produtoOpt.get();

            produto.setNome(dadosProduto.getNome());
            produto.setDescricao(dadosProduto.getDescricao());
            produto.setPreco(dadosProduto.getPreco());

            return produtoRepository.save(produto);
        }

        return null;
    }

    
}
