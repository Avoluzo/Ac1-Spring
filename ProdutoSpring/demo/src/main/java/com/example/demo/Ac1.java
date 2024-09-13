package com.example.demo;

import com.example.demo.models.Categoria;
import com.example.demo.models.Produto;
import com.example.demo.rep.CategoriaRepository;
import com.example.demo.rep.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ac1 implements CommandLineRunner {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    public static void main(String[] args) {
        SpringApplication.run(Ac1.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Categoria cat1 = new Categoria();
        cat1.setCatNome("Casa");
        cat1.setCatDescricao("Produtos para casa");

        Categoria cat2 = new Categoria();
        cat2.setCatNome("Comida");
        cat2.setCatDescricao("Comidas");

        Categoria cat3 = new Categoria();
        cat3.setCatNome("Carros");
        cat3.setCatDescricao("automoveis");

        categoriaRepository.save(cat1);
        categoriaRepository.save(cat2);
        categoriaRepository.save(cat3);
       


        Produto prod1 = new Produto();
        prod1.setProdNome("Celular");
        prod1.setProdQtd(1000);
        prod1.setCategoria(cat1);

        Produto prod2 = new Produto();
        prod2.setProdNome("Macarrao");
        prod2.setProdQtd(123);
        prod2.setCategoria(cat2);
        
        Produto prod3 = new Produto();
        prod3.setProdNome("Fusca");
        prod3.setProdQtd(1435);
        prod3.setCategoria(cat3);
        

        produtoRepository.save(prod1);
        produtoRepository.save(prod2);
        produtoRepository.save(prod3);

        System.out.println("Categorias:");
        categoriaRepository.findAll().forEach(System.out::println);

        System.out.println("Produtos:");
        produtoRepository.findAll().forEach(System.out::println);
    }
}