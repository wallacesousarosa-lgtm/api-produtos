package com.wallace.produtos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wallace.produtos.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}