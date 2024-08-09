package com.produtos.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.produtos.api.model.produto;

@Repository
public interface ProdutoRepository extends JpaRepository<produto,Long> {
    
}
