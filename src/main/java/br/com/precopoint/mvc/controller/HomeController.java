package br.com.precopoint.mvc.controller;

import br.com.precopoint.mvc.model.Categoria;
import br.com.precopoint.mvc.model.Produto;
import br.com.precopoint.mvc.repository.CategoriaRepository;
import br.com.precopoint.mvc.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.logging.Logger;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    ProdutoRepository produtoRepository;
    @Autowired
    CategoriaRepository categoriaRepository;
    @GetMapping
    public ModelAndView carregaProdutos(){
        List<Produto> produtos = produtoRepository.findAll();
        ModelAndView mv = new ModelAndView("index.html");
        mv.addObject("produtos",produtos);
        return mv;
    }

    @GetMapping("/{categoria}")
    public ModelAndView porTeste(@PathVariable("categoria") String categoriaProduto){

        ModelAndView mv = new ModelAndView("index");
        List<Produto> produto = produtoRepository.findByCategoriaNomeCategoria(categoriaProduto);
        List<Categoria> categoria = categoriaRepository.findAll();
        mv.addObject("produtos", produto);
        mv.addObject("categoria", categoria);



        return mv;
    }
}
