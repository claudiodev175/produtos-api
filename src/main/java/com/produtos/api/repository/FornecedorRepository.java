package com.produtos.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.api.model.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor,Long> {
    
}
