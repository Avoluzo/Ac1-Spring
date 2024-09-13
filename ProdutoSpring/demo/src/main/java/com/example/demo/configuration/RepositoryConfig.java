package com.example.demo.configuration;

import com.example.demo.rep.CategoriaRepository;
import com.example.demo.rep.CategoriaRepositoryExtended;
import com.example.demo.rep.ProdutoRepository;
import com.example.demo.rep.ProdutoRepositoryExtended;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfig {

    @Bean
    public CategoriaRepository categoriaRepository() {
        return new CategoriaRepositoryExtended();
    }

    @Bean
    public ProdutoRepository produtoRepository() {
        return new ProdutoRepositoryExtended();
    }
}