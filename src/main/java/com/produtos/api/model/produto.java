package com.produtos.api.model;

import com.produtos.api.dto.ProdutoDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tb_produtos")
public class produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PRODUTO")
    private Long id;

    @Column(name = "NOME_PRODUTO",nullable = false)
    private String nome;

    @Column(name = "DESCRICAO_PRODUTO",nullable = false)
    private String descricao;

    @Column(name = "PRECO_PRODUTO",nullable = false)
    private int preco;

    public ProdutoDTO toDTO(){
        ProdutoDTO dto = new ProdutoDTO();
        dto.setId(id);
        dto.setNome(nome);
        dto.setDescricao(descricao);
        dto.setPreco(preco);

        return dto;
    }


}
